open class Users(var name :String, var email: String){
     constructor(nama: String, mail: String, studert: Users) : this(nama,mail)
    var namaUser = this.name
        get() = field.toUpperCase()
    var emailUser = this.email
        get() = field.toUpperCase()
}
//Leeson 2
open class usersss{
    open fun userAddress(): String {
        return "London, United Kingdom"
    }
}
open class Student : usersss(){
    override fun userAddress(): String {
        return super.userAddress()
    }
}
class InformaticsStudent : Student(){
    override fun userAddress(): String {
        return super.userAddress()
    }
}

//Lesson 3
open class users{
    open fun userAddresss(){}
}
abstract class student : users(){
    override abstract fun userAddresss()
}



fun main(args: Array<String>) {
    //Lesson 1
    println("======= Lesson 1 =======")
    val MainUser = Users("Bejo", "bejo@mail.com")
    val UserName = MainUser.namaUser
    val UserMail = MainUser.emailUser
    println("Nama : $UserName \n" +
            "Email : $UserMail")

    //Lesson 2
    println("======= Lesson 2 =======")
    val myStudent = InformaticsStudent()
    println(myStudent.userAddress())


}