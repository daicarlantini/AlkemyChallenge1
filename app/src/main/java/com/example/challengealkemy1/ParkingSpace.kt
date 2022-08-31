package com.example.challengealkemy1

import java.util.*

data class ParkingSpace(var vehicle: Vehicle) {

    val parkedTime: Long
        get() {
            return (Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis) / MINUTES_IN_MILLISECONDS
        }

    //Function to calculateFee
    fun calculateFee(type: VehicleType, hasDiscountCard: String?) : Int {
        //AGREGUE UNA VALIDACIÓN PARA SABER SI ESTUVO MÁS DE DOS HORAS, SI ESTUVO MENOS COBRARIA EL BASICO POR TIPO. ESTA OK?
        var fee = type.fee
        if(parkedTime > TWO_HOURS_IN_MINUTES){
              kotlin.math.ceil(((parkedTime - TWO_HOURS_IN_MINUTES) /
                   FIFTEEN_MINUTES.toFloat())) * PRICE_FOR_FIFTEEN_MINUTES + fee
       }
        hasDiscountCard?.let {
            fee = (fee - (fee * DISCOUNT_PERCENTAGE)).toInt()
        }
        return fee
    }

}

const val MINUTES_IN_MILLISECONDS = 60000L
const val TWO_HOURS_IN_MINUTES = 120
const val FIFTEEN_MINUTES = 15
const val PRICE_FOR_FIFTEEN_MINUTES = 5
const val DISCOUNT_PERCENTAGE = 0.15

