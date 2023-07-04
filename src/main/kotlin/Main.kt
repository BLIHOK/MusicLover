fun main(args: Array<String>) {
    val discount100 = 100
    val discount5Percent = 0.05
    val discountForVIP = 0.01
    val buyerIsVIP = true

    println("Введите сумму покупки")
    val cost = readln().toInt()
    var totalDiscountValue = 0.0

    when (cost) {
        in 0..10_00 -> totalDiscountValue
        in 10_01..10_000 -> totalDiscountValue += discount100
        else -> totalDiscountValue += cost * discount5Percent
    }
    if (buyerIsVIP == true) {
        if (cost < 1000) {
            totalDiscountValue = cost * discountForVIP
        } else {
            totalDiscountValue += (cost - totalDiscountValue) * discountForVIP
        }
    }

    val totalCost = cost - totalDiscountValue

    println(
        """
        Скидка составит: $totalDiscountValue
        Итоговая сумма: $totalCost
        """.trimIndent()
    )
}