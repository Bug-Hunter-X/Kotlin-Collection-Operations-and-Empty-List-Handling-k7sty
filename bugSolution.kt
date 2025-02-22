fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val list2 = mutableListOf(1,2,3)
    list2.add(4)
    println(list2) //Output: [1,2,3,4]

    val list3 = emptyList<Int>()
    if (list3.isEmpty()) println("List is empty")

    //Safe handling of potentially empty lists
    val list4 = listOf(6,7,8)
    val firstElement = list4.firstOrNull() ?: 0 // use firstOrNull() for empty list handling
    println(firstElement)

    val anotherList = emptyList<Int>()
    val sum = anotherList.sumOf { it } // avoid exceptions if list is empty
    println(sum) //Output: 0
}