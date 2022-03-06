
class AirTransport(
    override var weight: Float,
    override var capacity: String,
    override var speed: Float,
    var aircraft_type: String,
    var airline_name: String)
    : Transport {

    override fun ship(typeTrans: String, via: String) {
        println("In $typeTrans shipping is done via $via")
    }

    override fun toString(): String {
        return "Aircraft Type = $aircraft_type \nAircraft Name = $airline_name"
    }
}