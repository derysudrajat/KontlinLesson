open class Studentme(var name:String, var mail:String)
fun main(args: Array<String>) {
    val mStudent = Studentme("Maman",
        "maman@mail.com")
    println("Name: ${mStudent.name}")
    println("Mail: ${mStudent.mail}")
}
