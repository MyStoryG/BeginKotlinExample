fun main(args: Array<String>) {
    val car = Car()
    println(car.getPrice(0))
}

class Car {
    fun getPrice(): Int {
        return 10000
    }
}

fun Car.getPrice(price: Int): Int {
    return 20000
}