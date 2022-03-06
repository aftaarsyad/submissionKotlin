class LandTransport(
    override var weight: Float,
    override var capacity: String,
    override var speed: Float,
    var transportation_mode: String,
    var vehicle_mode: String,
): Transport {
    override fun ship(typeTrans: String, via: String) {
        println("In $typeTrans shipping is done via $via")
    }

    override fun toString(): String {
        return "Transportation mode = $transportation_mode \nVehicle = $vehicle_mode"
    }
}