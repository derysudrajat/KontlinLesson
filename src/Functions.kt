/**
 * --- Lesson 1 : Function ---
 * setiap function dalam kotlin pasti akan mengembalikan sebuah nilai, nilai
 * akan di generate secara langsung oleh kotlin jika kita tidak mendeklarasikan
 */
//cara 1
fun sum(x: Int, y: Int): Int {
    return x + y
}

class hitungCoy() {
    //cara 2
    fun sum2(x: Int, y: Int): Int = x + y

    //cara 3
    fun sum3(x: Int, y: Int) = x + y
}

/**
 * --- Lesson 2 : Function Unit ---
 * Function Unit ialah sebuah function dalam kotlin, yang tidak disertai key
 * 'return' atau jika di java adalah 'Void', pada function ini secara otomatis
 * ia akan mereturn Unit.
 */
//contoh 1
fun hello(name: String) {
    println("Hello $name")
}

//contoh 2
fun introduction(name: String, city: String) {
    println("Hello, my name is $name, I'm from $city")
}

//contoh 3
fun introduction2(name: String, city: String = "Unknown") {
    println("Hello, my name is $name, I'm from $city")
}

/**
 * --- Lesson 3 : Variable Argument List ---
 * ialah melakukan suatu aksi secara langsung kepada parameter yang ada,
 * atau menggabungkan beberapa parameter secara langsung, jika fungsi
 * memiliki 2 parameter atau lebih maka arguman 'vararg' di sarankan agar
 * ditempatkan dibelakang, agar tidak membingungkan kompiler seperti pada
 * function 'sumVararg2'.
 */
//contoh 1
fun sumVararg(vararg numbers: Int): Int {
    var total = 0
    for (num in numbers) total += num
    return total
}

fun sumVararg2(name: String, vararg numbers: Int): Int {
    var total = 0
    for (num in numbers) total += num
    println("Total Pesanan $name adalah: $total items")
    return total
}


fun main(args: Array<String>) {
    //Lesson 1
    val total = sum(2, 7)
    val total2 = hitungCoy().sum2(3, 7)
    val total3 = hitungCoy().sum3(1, 5)
    println(
        "Sum : $total\n" +
                "Sum 2: $total2\n" +
                "Sum 3: $total3"
    )
    //Lesson 2
    hello("Bejo")
    introduction(name = "Maman", city = "Tokyo")
    introduction2(name = "Si Bejo")
    //Lesson 3
    println("Total nilai sumVararg : ${sumVararg(1, 2, 3, 4, 5)}")
    sumVararg2("Bejo Maman", 1, 23, 4, 34, 5)

}
