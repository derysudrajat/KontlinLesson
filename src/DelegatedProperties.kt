import kotlin.properties.Delegates

/**
 * --- Lesson 1: Standard Lazy Delegates ---
 * memungkinkan nilai properties untuk dikomputasi hanya saat pertama kali
 * diakses dan kemudian dimasukan kedalam cache
 */
val lazyValue : String by lazy {
    println("computed!")
    "Hi Kotlin"
}

/**
 * --- Lesson 2 : Standard Observable Delegates ---
 * memungkinkan untuk sebuah fungsi dijalankan kapanpun ketika terdapat
 * perubahan pada nilai properti
 */
class me{
    var name: String by Delegates.observable("<no name>"){
        prop, old, new ->
        println("$old -> $new")
    }
    var list: List<String> by Delegates.vetoable(emptyList()){
        _, old, new -> new.size > old.size
    }
}

/**
 * --- Lesson 3 : Menyimpan Properties ke Map
 * hal ini dapat digunakan untuk menguraikan JSON atau beberapa hal yang dinamik
 * yaitu menggunakan instance dari map seabagi delegasi properties
 */
class Jsonme(val map: Map<String, Any?>){
    val nameMe : String by map
    val ageMe : Int by map
}
fun main(args: Array<String>) {
    //Lesson 1
    println(lazyValue)
    println(lazyValue)

    //Lesson 2
    val userMe = me()
    userMe.name = "Bejo"
    userMe.name = "Maman"

    //Lesson 3
    val jsonMe = Jsonme(mapOf(
        "nameMe" to "Romen",
        "ageMe" to 22
    ))
    println("Name is ${jsonMe.nameMe}\n" +
            "Age is ${jsonMe.ageMe}")
}