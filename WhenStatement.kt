fun main() {
    val trafficLightColor = "Black"
    
    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Start")
        "Green" -> println("Go")
        else -> print("Invalid traffic color")
    }
}