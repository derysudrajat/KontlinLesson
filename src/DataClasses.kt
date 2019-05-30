data class DataStudent(var name:String ="Bejo Maman",var major: String, var phone:String)

fun main(args: Array<String>) {
    val Student = DataStudent("Bejo anak Maman","Software Engineering","1100101")
    println("Your name is ${Student.name}\n" +
            "Your major is ${Student.major}\n" +
            "Your phone is ${Student.phone}")
    //Copy Data
    val StudentA = Student.copy(phone = "111")
    println("Copy of Phone : ${StudentA.phone}")
    //Objek menjadi variable
    val (name,major,phone) = Student
    println("OName: $name, OMajor: $major, OPhone: $phone")
    //Destructuring declaration
    val nameStudent = Student.component1()
    val majorStudent = Student.component2()
    val phoneStudent = Student.component3()
    println("DdName: $nameStudent\n" +
            "DdMajor: $majorStudent\n" +
            "DdPhone: $phoneStudent")
}