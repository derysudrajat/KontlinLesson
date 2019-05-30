import java.util.*

fun Date.isTuesday(): Boolean {
    return getDay() == 2
}

fun main(args: Array<String>) {
    val date = Date()
    println("Hari ini adalah selasa : ${date.isTuesday()}")

}