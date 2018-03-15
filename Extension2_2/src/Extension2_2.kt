fun main(args: Array<String>) {
    println("Hello".getLonggerLength(3))
}

fun String.getLonggerLength(x: Int) : Int {
    return if(this.length > x) this.length else x
}