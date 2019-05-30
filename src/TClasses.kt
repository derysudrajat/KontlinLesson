//Lesson 1 Nested Classes
class User {
    inner class Name(private val name: String) {
        fun printName() {
            println("Your name is $name")
        }
    }
}

//Lesson 2 Enum Classes
enum class pengguna(val field: String) {
    NAME("Bejo Maman") {
        override fun print() {
            println("Your Name is $field")
        }
    },
    EMAIL("sibejo111@gmail.com") {
        override fun print() {
            println("Your mail is $field")
        }
    },
    PHONE("081322505589") {
        override fun print() {
            println("Your phone is $field")
        }
    };

    abstract fun print()
}

enum class Gender { MALE, FEMALE }

fun main(args: Array<String>) {
    /**
     * Lesson 1
     * Nested Classes
     */
    println("======= Lesson 1 =======")
    //Cara 1
    val user = User()
    user.Name("Bejo").printName()
    user.Name("Maman").printName()
    //Cara 2
    val name = User().Name("Bejo Maman")
    name.printName()

    /**
     * Lesson 2
     * Enum Classes
     */
    println("======= Lesson 2 =======")
    pengguna.NAME.print()
    pengguna.EMAIL.print()
    pengguna.PHONE.print()

    println(enumValues<Gender>().joinToString { it.name })

}