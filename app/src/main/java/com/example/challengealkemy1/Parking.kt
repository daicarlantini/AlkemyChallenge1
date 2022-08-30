package com.example.challengealkemy1

data class Parking(val vehicles: MutableSet<Vehicle>) {

    // Function that checks if a car can be added to the parking lot
    fun addVehicle(vehicle: Vehicle): Boolean {
        return if (vehicles.size <= 19) {
            vehicles.add(vehicle)
            true
        } else false
    }
}