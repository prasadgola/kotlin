fun main() {
    println(birthdayGreeting("Rover"))
    println(birthdayGreeting("Riz"))
}

fun birthdayGreeting(name : String): String {
    val nameGreeting = "Happy Birthday, $String!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}