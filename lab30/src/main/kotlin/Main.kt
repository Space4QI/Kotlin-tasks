fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val filteredNumbers = filterList(numbers) { it % 2 == 0 }
    println("Filtered numbers: $filteredNumbers")

    val adder = { x: Int, y: Int -> x + y }
    val multiplier = { x: Int, y: Int -> x * y }
    val combinedFunction = combineNums(adder, multiplier)
    println("Result of combined function: ${combinedFunction(3, 4)}")
}

fun <T> filterList(list: List<T>, predicate: (T) -> Boolean): List<T> {
    val resultList = mutableListOf<T>()
    for (item in list) {
        if (predicate(item)) {
            resultList.add(item)
        }
    }
    return resultList
}

fun combineNums(num1: (Int, Int) -> Int, num2: (Int, Int) -> Int): (Int, Int) -> Int {
    return { x, y -> num1(x, y) + num2(x, y) }
}

