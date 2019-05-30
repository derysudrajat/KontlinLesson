fun main(args: Array<String>) {
    //Lesson 1
    val booleanTrue = true
    val booleanFalde = false
    println("BooleanTrue: "+booleanTrue+"\n" +
            "BooleanFalse "+booleanFalde)

    //lesson 2
    val a = 3
    val b = 7
    val c = 5
    val x = a < b && b > c
    val y = a > b && b < c
    val z = a < b || a > b
    println(x)
    println(y)
    println(z)

}