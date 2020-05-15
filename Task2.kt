fun main() {
    println("Введите пожалуйста исходные цены, через запятую без пробелов:")
    val price = readLine()!!.split(",").toMutableList()
    println("Введите пожалуйста размер скидки, целое число от 1 до 99:")
    var discount = 0
    var a = 0
    while (a == 0) {
        discount = readLine()!!.toInt()
        if (discount in 1..99) {
            a++
        } else {
            println("Вы ввели неверное значение, попробуйте еще раз:")
        }
    }
    println("Введите номер позиции с которой применить скидку:")
    var offset = readLine()!!.toInt()
    println("Введите колличество позиций к которым нужно применить скидку:")
    var readLength = readLine()!!.toInt()
    var j = readLength + offset - 1
    val newPrice = mutableListOf<String>()
    for (i in offset..j) {
        newPrice.add((price[i - 1].toDouble() / 100 * discount).toInt().toString())
    }
    println(newPrice)
}
