import javafx.scene.image.ImageView

fun main(args: Array<String>) {
    //Lesson 1
    println("====== Lesson 1 ======")
    val a = 3
    val b =2
    if(a > b){
        println("a is greater than b")
    }else{
        println("a is not greater than b")
    }
    val result = if(a > b) a else b
    println(result)
    //Lesson 2
    println("====== Lesson 2 ======")
    val xa = 4
    when(xa){
        1 -> println("xa == 1")
        2 -> println("xa == 2")
        else ->{
            println("x is neither 1 nor 2")
        }
    }
    val validNumber = arrayOf(11,12,13,14,15)
    when(xa){
        in 1..10 -> println("xa is in the range")
        in validNumber -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }
    //Lesson 3
    println("====== Lesson 3 ======")
    val insarr = arrayOf(1,2,3,4,5,6,7,8,9)
    for (number in 1..5) print("$number ")
    println()
    for (nu in 0 until insarr.size) print("$nu ")
    println()
    for (num in 0..10 step 2) print("$num ")
    println()
    for (num in 9 downTo  0) print("$num ")
    println()
    val arrayNum = intArrayOf(1,3,5,7,9)
    //menggunakan Index
    for ((index,value) in arrayNum.withIndex())print("Bilangan $value adalah indeks ke-$index\n")
    println()
    //Menggunakan indicas
    for (index in arrayNum.indices) print("Bialngan ${arrayNum[index]} adalah indeks ke-$index\n")

    //Lesson 4
    println("====== Lesson 4 ======")
    println("Panggil aku 3 kali...")
    repeat(3){
        println("Bejo...")
    }

    //Lesson 5
    println("====== Lesson 5 ======")
    //while
    var x=0
    while (x<5){
        println("Maman!")
        x++
    }
    //do..while
    var y =0
    do{
        println("Si Maman Bejo")
        y++
    }while (y<5)





}