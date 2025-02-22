fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val list2 = mutableListOf(1,2,3)
    list2.add(4)
    println(list2) //Output: [1,2,3,4]

    val list3 = emptyList<Int>()
    if (list3.isEmpty()) println("List is empty")
}