//Treating function linke any other data type!!

fun main() {
    val trickFunction = ::trick
    trickFunction()
} 

fun trick () {
    println("No treats")
}


//Assign lamda function as variable!!

/*fun main() {
    val trickFunction = trick
    trickFunction()
} 

val trick = {
    println("No treats")
}


// Assigning a parameter
fun main() {
    treat()
} 

val treat: () -> Unit = {
    println("Have a treat!")
}*/