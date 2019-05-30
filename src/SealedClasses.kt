sealed class Operation{
    class Add(val value:Int):Operation()
    class Divide(val value:Int):Operation()
    class Miltiply(val value:Int):Operation()
    class Substract(val value:Int):Operation()
}
fun execute(x: Int, operation: Operation): Int = when(operation){
    is Operation.Add -> operation.value + x
    is Operation.Divide -> operation.value / x
    is Operation.Substract -> operation.value - x
    is Operation.Miltiply -> operation.value * x
}
fun main(args: Array<String>) {
    val operation = Operation.Add(10)
    val result = execute(10,operation)
    println("Hasil : $result")
}