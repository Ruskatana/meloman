import java.util.*

fun main () {
    while (true) {
        println("Введите сумму Вашей покупки ")
        val nomber1 = Scanner(System.`in`)
        var value: Int = nomber1.nextInt()
        println(
            """Являетесь ли Вы постоянным покупателем?
        | Ответ введите в формате: да / нет
    """.trimMargin()
        )
        val answer = readLine()


        if (value in 0..1000 && answer == "да") {
            var discount = value * 1 / 100
            println("Стоимость покупки " + (value - discount) + " рублей. " + " Cкидка составляет " + discount + " рублей ")
        } else if (value in 0..1000 && answer == "нет") {
            println("Стоимость покупки " + value + " рублей ")
        } else if (value in 1001..10000 && answer == "да") {
            var discount = value * 1 / 100
            println("Стоимость покупки " + (value - 100 - discount) + " рублей. " + " Cкидка составляет рублей " + discount + " рублей ")
        } else if (value in 1001..10000 && answer == "нет") {
            println("Стоимость покупки " + (value - 100) + " рублей ")
        } else if (value > 10001 && answer == "да") {
            var discount1 = value * 1 / 100
            var discount2 = value * 5 / 100
            println("Стоимость покупки " + (value - discount1 - discount2) + " рублей. " + " Скидка составляет " + (discount1 + discount2) + " рублей ")
        } else if (value > 10001 && answer == "нет") {
            var discount2 = value * 5 / 100
            println("Стоимость покупки " + (value - discount2) + " рублей. " + " Скидка составляет " + discount2 + " рублей ")
        } else println("""Вы нажали не в соответствии с инструкцией
            Попробуйте еще раз!
                """)
    }
}