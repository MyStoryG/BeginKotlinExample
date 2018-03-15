fun main(args: Array<String>) {
    println("Hello".getLonggerString("Hi"))
}

fun String.getLonggerString(x: String) : String {
    return if(this.length > x.length) this else x
}