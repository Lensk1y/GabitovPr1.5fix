fun main(args: Array<String>) {
    println("Введите целое число n:")
    val n = readln().toInt()
    println("Введите основание степени x:")
    val x = readln().toInt()

    var y = 0
    var result = 1

    while (result < n) {
        y++
        result *= x
    }

    if (result == n) {
        println("Целочисленный показатель y = $y")
    } else {
        println("Целочисленный показатель не существует")
    }
}