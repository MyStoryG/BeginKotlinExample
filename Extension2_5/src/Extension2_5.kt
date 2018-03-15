fun main(args: Array<String>) {
    val car = Car()
    println(car.getPrice())
}

class Car {
    fun getPrice(): Int {
        return 10000
    }
}

fun Car.getPrice(): Int {
    return 20000
}