/**
 * --- Lesson 1 : Public Modifier ---
 * Modifier Public dapat di tulis atau tidak, karena
 * Default class dari Kotlin adalah Public, pada
 * kelas contohPublicClass2 adalah cohtoh kelas public
 * tanpa di dideklarasikan Modifiernya.
 */
public class contohPublicClass1{}
class contohPublicClass2{}
/**
 * --- Lesson 2 : Private Modifier ---
 * Private modifier tidak bisa di akses dari luar berkas
 * sekalipun sudah di extend.
 */
class Cat(val name: String){
    private var weight =1
    fun eat(){
        println("$name telah makan...")
        weight++
    }
    fun getWeight():Int{
        return weight
    }
}
/**
 * --- Lesson 3 : Protected Modifier ---
 * pada modifier protected ini walaupun protected
 * tetap masih bisa di akses jika kelas tersebut meng extend
 * dari kelas ber modifier Protected
 */
open class user{
    protected val name = "Bejo Woyo"
}
class binatang : user(){
    val namaBiantang = name
}

/**
 * --- Lesson 4 : Internal Modifier ---
 * Modifier Internal ini dapat tetap di akses oleh kelas lain
 * tetapi hanya pada modul yang sama.
 */
internal class Status{}
class UserStatus{
    internal val id = 17
}
fun main(args: Array<String>) {
    //Lesson 2
    val woyo2 = Cat("Woyo-Woyo")
    woyo2.eat()
    println("Berat dari ${woyo2.name} adalah : ${woyo2.getWeight()}Kg")
    //Lesson 3
    val binatang = binatang()
    println("Nama binatang ${binatang.namaBiantang}")
}