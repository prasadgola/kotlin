class SmartDevice {
    val name = "Android TV"
    val catogory = "Entertainment"
    var deviceStatus = "online"
    
	var speakerVolume = 2 // properties can be more than a variable name
    set(value) {
        if (value in 0..100) {
            field = value
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
    val SmartTvDevice = SmartDevice()
    SmartTvDevice.turnOff()
    print("Device name is ${SmartTvDevice.name}")
    print(SmartTvDevice.speakerVolume)
}