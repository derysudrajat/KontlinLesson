/**
 * --- Lesson 1: Generics ---
 * fungsi generic adalah memingkinkan sebuah kelas atau interface menjadi tipe
 * parameter yang bisa digunakan untuk berbai macam tipe data.
 */
class TypedClass<T>(parameter:T){
    val value:T = parameter
}

/**
 * --- Lesson 2: Variance ---
 * terdapat 2 kata kunci generic dalam variance yaitu 'in' dan 'out', in
 * sebagai contravariant sedangkan out digunakan sebagai covariant.
 */
class tipeClass<in T>{
    fun toString(value: T):String{
        return value.toString()
    }
}
class tipe2Class<out T>(private val value: T){
    fun get() : T{
        return value
    }
}
fun main(args: Array<String>) {
    val stringType = TypedClass("Hi Bejo")
    val intType = TypedClass(7)
    val nullType = TypedClass<String?>(null)
}