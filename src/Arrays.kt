fun main(args: Array<String>) {
    //Lesson 1
    val simpleArray = arrayOf(1,2,3,4)
    println(simpleArray[2])

    //Lesson 2
    val mixArray = arrayOf(1,2,3,"Bejo",true)
    println(mixArray[2])
    println(mixArray[3])

    //Lesson 3
    val numberArrays = Array(4,{i -> i*3 })
    println(numberArrays[2])


}