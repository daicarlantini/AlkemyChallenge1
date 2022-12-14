package com.example.challengealkemy1

//DUDA: Para nosotros el parámetro checkInTime debería ir en parkingSpace.
//Exercise 3: it must be located in the vehicle since the property of having or not having a card belongs to the vehicle
data class Vehicle(
    val plate: String,
    val type: VehicleType,
    val checkInTime: java.util.Calendar,
    val discountCard: String? = null
) {

    //Function states that two Vehicles are equal if their plates are equal
    override fun equals(other: Any?): Boolean {
        if (other is Vehicle) {
            return this.plate == other.plate
        }

        return super.equals(other)
    }

    //Function states that the hashCode(Used internally in search functions
    //in sets and arrays) is the hashCode of the plate
    override fun hashCode(): Int = this.plate.hashCode()
}


