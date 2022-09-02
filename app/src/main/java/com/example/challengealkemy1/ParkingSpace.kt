package com.example.challengealkemy1

import java.util.*


const val MINUTES_IN_MILLISECONDS = 60000L
const val TWO_HOURS_IN_MINUTES = 120
const val FIFTEEN_MINUTES = 15
const val PRICE_FOR_FIFTEEN_MINUTES = 5
const val DISCOUNT_PERCENTAGE = 0.15


data class ParkingSpace(var vehicle: Vehicle) {


    private val parkedTime: Long
        get() {
            return (Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis) / MINUTES_IN_MILLISECONDS
        }

    //function that calculates the fee for the Vehicle type passed checking if it has discount card
    fun calculateFee(type: VehicleType, discountCard: String?): Int {
        var fee = type.fee
        if (parkedTime > TWO_HOURS_IN_MINUTES) {
            fee = kotlin.math.ceil(
                ((parkedTime - TWO_HOURS_IN_MINUTES) /
                        FIFTEEN_MINUTES.toFloat())
            ).toInt() * PRICE_FOR_FIFTEEN_MINUTES + type.fee
        }
        discountCard?.let {
            fee = (fee - (fee * DISCOUNT_PERCENTAGE)).toInt()
        }

        return fee
    }

}









