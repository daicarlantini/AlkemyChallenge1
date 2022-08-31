package com.example.challengealkemy1



data class Parking(val vehicles: MutableSet<Vehicle>) {

    // Function that checks if a car can be added to the parking lot
    fun addVehicle(vehicle: Vehicle): Boolean {
        return if (vehicles.size <= 19) {
            vehicles.add(vehicle)
            true
        } else false
    }

    //Función remover vehículo
    fun checkOutVehicle(vehicle: Vehicle){
        val searchVehicle = vehicles.find { it.plate == vehicle.plate}
        if (searchVehicle != null){
            removeVehicle(vehicle)
        } else {
            println("Sorry, the check out failed")
        }
    }

    fun removeVehicle(vehicle: Vehicle){
        val parkingSpace = ParkingSpace(vehicle)
        vehicles.remove(vehicle)
        val fee = parkingSpace.calculateFee(vehicle.type, vehicle.discountCard)
        println("Your fee is $fee. Come back soon")

    }





}