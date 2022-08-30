package com.example.challengealkemy1

import java.util.*

data class ParkingSpace(var vehicle: Vehicle) {

    val parkedTime: Long
        get() {
            return (Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis) / MINUTES_IN_MILLISECONDS
        }

}

const val MINUTES_IN_MILLISECONDS = 60000L

