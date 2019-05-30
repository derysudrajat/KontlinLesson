fun main(args: Array<String>) {
    /*
    Variable define by 2 val and var, val is final in java or value
    val being declare a constant or object which never be change after it been initialize
     */
    //Lesson 1
    val company = "Bejo"
    println(company)

    //Lesson 2
    var name = "Bejo"
    name = "Maman"
    println(name)

    /*
    Properties Lesson : properties is a variable which a part of class
    the variable it (val{value}/final and var / variable
     */
    //Lesson 3
    class Student{var studentName = ""}
    val student = Student()
    student.studentName = "Bejo Maman"
    val nameofStudent = student.studentName
    println(nameofStudent)

    //Lesson 3
    class Mahasiswa{
        var namaMahasiswa = ""
        get() = field.toUpperCase()
        set(value){
            field = "Name: $value"
        }
    }
    val mahasiswa1 = Mahasiswa()
    mahasiswa1.namaMahasiswa = "Kotaro"
    val namaMahasiswa = mahasiswa1.namaMahasiswa
    println(namaMahasiswa)

}
