package com.example.challengealkemy1



data class Parking(val vehicles: MutableSet<Vehicle>) {
    private val count: Int = 0
    private val amount: Int = 0
    private var parkingHistory = Pair(count, amount)


    // Function that checks if a car can be added to the parking lot
    fun addVehicle(vehicle: Vehicle): Boolean {
        return if (vehicles.size <= 19 && !vehicles.contains(vehicle)) {
            vehicles.add(vehicle)
            successAddVehicle()
            true
        } else {
            errorAddVehicle()
            false
        }

    }

    private fun successAddVehicle() {
        println("Welcome to Alkeparking")
    }

    private fun errorAddVehicle() {
        println("Sorry, the check-in Failed")
    }


    private fun checkOutVehicle(vehicle: Vehicle): Boolean {
        val foundVehicle = vehicles.find { it.plate == vehicle.plate }
        return foundVehicle != null
    }

    fun removeVehicle(vehicle: Vehicle) {
        if (checkOutVehicle(vehicle)) {
            val parkingSpace = ParkingSpace(vehicle)
            vehicles.remove(vehicle)
            val fee = parkingSpace.calculateFee()
            updateHistory(fee)
            onSuccess(fee)
        } else {
            onError()
        }
    }

    fun listVehicles() {
        println("Plate in Parking :")
        vehicles.toList().forEach {
            println(it.plate)
        }
    }


    private fun updateHistory(fee: Int) {
        parkingHistory = parkingHistory.copy(
            first = parkingHistory.first.plus(1),
            second = parkingHistory.second.plus(fee)
        )

    }

    fun showHistory() {
        println("${parkingHistory.first} vehicles have checked out and have earnings of ${parkingHistory.second} ")
    }

    private fun onSuccess(fee: Int) {
        parkingHistory
        println("Your fee is $fee. Come back soon")

    }

    private fun onError() {
        println("Sorry , the check out failed")
    }

//ejercicio 10


}