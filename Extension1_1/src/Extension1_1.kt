fun main(args: Array<String>) {
    val car = Car()
    println(car.getBrandName())
}

class Car {
    fun getPrice() : Int {
        return 10000
    }
}


fun Car.getBrandName() : String {
    return "BMW"
}