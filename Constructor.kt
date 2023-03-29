// Below line uses primary constructor
class SmartDevice (val name : String, val catogory : String, val statusCode: Int )  { // this line: class == SmartDevice constructor () {
    
    
    var deviceStatus = "online"
// Below line uses secondory constructor and they can be multiple secondory constructor methods
    constructor(name: String, category: String, catogory : String, statusCode: Int) : this(name, category, statusCode) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
    
    fun turnOn(){
        println("Smart device is turned on.")
    }

    fun turnOff(){
        println("Smart device is turned off.")
        turnOn()
    }
}

fun main() {
    val SmartTvDevice = SmartDevice( name = "Android TV", catogory =  "Entertainment", statusCode = 1)
    SmartTvDevice.turnOff()
    print("Device status is ${SmartTvDevice.deviceStatus}")