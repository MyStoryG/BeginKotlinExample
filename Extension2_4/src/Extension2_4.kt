fun main(args: Array<String>) {
    println("Hello" getLonggerStringLength "Have a nice day!")
}

infix fun String.getLonggerStringLength(x: String) : Int {
    return if(this.length > x.length) this.length else x.length
}