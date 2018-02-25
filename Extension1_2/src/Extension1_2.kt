fun main(args: Array<String>) {
    val car = Car()
    println(car.getBrandName().getPrice())
}

class Car {
    fun getPrice() : Int {
        return 10000
    }
}

fun Car.getBrandName() : Car {
    println("BMW")
    return this
}