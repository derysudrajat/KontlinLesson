fun main(args: Array<String>) {
    //Lesson 1
    val SingleLineString = "Hi, aku Bejo"
    val multiLineString ="""Hai
        |Aku
        |Adalah
        |Bejo""".trimMargin()
    println(SingleLineString)
    println(multiLineString)

    //Lesson 2
    val multiLine2 = "Hi, aku bejo \n" +
            "Hai juga aku adalah Sisi"
    val multiLine3 = "Hai salam kenal bejo \n iyaa salam kenal sisi"
    println(multiLine2)
    println(multiLine3)

    //Lesson 3
    val singleLine2 = "Hai, Tayo"
    val huruf = singleLine2[2]
    println(huruf)

    //Lesson 4
    val queueNumbers = 7
    val yourQueue = "Antrean kamu adalah $queueNumbers.\n" +
            "silahkan tunggu"
    println(yourQueue)

    //Lesson 5
    val emptyCoy = true
    val stock = 0
    val checkStock =  "Your Stock is :${if (emptyCoy)0  else stock}"
    println(checkStock)
}