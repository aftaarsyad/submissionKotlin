fun main() {
    val land = LandTransport(
        weight = 10f,
        capacity = "10 Kg",
        speed = 10f,
        transportation_mode = "Land Transport",
        vehicle_mode = "Truck")

    val air = AirTransport(
        10f,
        "200 Kg",
        10f,
        "Air",
        "Jet"
    )

    land.ship("Land Transport", "Truck Cargo")
    land.load()
    println(Transportation(land))
    land.unload()

    println("\n")

    air.ship("Air Transport", "Air Cargo")
    air.load()
    println(Transportation(air))
    air.unload()

}