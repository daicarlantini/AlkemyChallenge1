package com.example.challengealkemy1


data class Parking(val vehicles: MutableSet<Vehicle>) {
    private val count: Int = 0
    private val amount: Int = 0
    private var parkingHistory = Pair(count, amount)


    // Function that checks if a car can be added to the parking lot
    fun addVehicle(vehicle: Vehicle): Boolean {
        return if (vehicles.size <= 19 && !vehicles.contains(vehicle)) {
            vehicles.add(vehicle)
            showCheckInMessage(true)
            true
        } else {
            showCheckInMessage(false)
            false
        }
    }

    private fun showCheckInMessage(result: Boolean) {
        when(result){
            true -> println("Welcome to Alkeparking")
            false -> println("Sorry, the check-in Failed")
        }
    }

    //Function that checks if a vehicle is in the parking lot or not
    private fun checkOutVehicle(vehicle: Vehicle): Boolean {
        val foundVehicle = vehicles.find { it.plate == vehicle.plate }
        return foundVehicle != null
    }

    //Function that remove vehicle from set and calls two functions: calculateFee and updateHistory
    fun removeVehicle(vehicle: Vehicle) {
        if (checkOutVehicle(vehicle)) {
            val parkingSpace = ParkingSpace(vehicle)
            vehicles.remove(vehicle)
            val fee = parkingSpace.calculateFee(vehicle.type, vehicle.discountCard)
            updateHistory(fee)
            onSuccess(fee)
        } else {
            onError()
        }
    }

    private fun onSuccess(fee: Int) {
        parkingHistory
        println("Your fee is $fee. Come back soon")

    }

    private fun onError() {
        println("Sorry , the check out failed")
    }

    //Function that makes a list of parking vehicles
    fun listVehicles() {
        println("Plates in Parking :")
        vehicles.toList().forEach {
            println(it.plate)
        }
    }

    //Function that updates the Pair with the number of cars and the money collected
    private fun updateHistory(fee: Int) {
        parkingHistory = parkingHistory.copy(
            first = parkingHistory.first.plus(1),
            second = parkingHistory.second.plus(fee)
        )

    }

    //Function that shows the parkingHistory data
    fun showHistory() {
        println("${parkingHistory.first} vehicles have checked out and have earnings of ${parkingHistory.second} ")
    }


}