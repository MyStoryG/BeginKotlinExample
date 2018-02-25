fun main(args: Array<String>) {
    printFuel(Bus())
}

open class Car
class Bus: Car()

fun Car.getFuel() = "gasoline"
fun Bus.getFuel() = "lpg"

fun printFuel(fuel: Car) {
    println(fuel.getFuel())
}