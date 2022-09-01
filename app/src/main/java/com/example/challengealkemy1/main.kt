package com.example.challengealkemy1

import kotlinx.coroutines.withTimeout
import java.util.*



fun main() {
    val car1 = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CAR_001")
    val car2 = Vehicle("B222BBB", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val car3 = Vehicle("B222BBC", VehicleType.BUS, Calendar.getInstance())
    val car4 = Vehicle("AA111AD", VehicleType.MINIBUS, Calendar.getInstance(), "DISCOUNT_CAR_001")
    val car5 = Vehicle("B222BBB1", VehicleType.CAR, Calendar.getInstance())
    val car6 = Vehicle("B222BBB2", VehicleType.CAR, Calendar.getInstance())
    val car7 = Vehicle("AA111AA3", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CAR_001")
    val car8 = Vehicle("B222BBB4", VehicleType.CAR, Calendar.getInstance())
    val car9 = Vehicle("B222BBB5", VehicleType.CAR, Calendar.getInstance())
    val car10 = Vehicle("AA111AA6", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CAR_001")
    val car11 = Vehicle("B222BBB7", VehicleType.CAR, Calendar.getInstance())
    val car12 = Vehicle("B222BBB8", VehicleType.CAR, Calendar.getInstance())
    val car13 = Vehicle("AA111AA9", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CAR_001")
    val car14 = Vehicle("B222BBB10", VehicleType.CAR, Calendar.getInstance())
    val car15 = Vehicle("B222BBB11", VehicleType.CAR, Calendar.getInstance())
    val car16 = Vehicle("AA111AA12", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CAR_001")
    val car17 = Vehicle("B222BBB13", VehicleType.CAR, Calendar.getInstance())
    val car18 = Vehicle("B222BBB14", VehicleType.CAR, Calendar.getInstance())
    val car19 = Vehicle("AA111AA15", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CAR_001")
    val car20 = Vehicle("B222BBB16", VehicleType.CAR, Calendar.getInstance())
    val car21 = Vehicle("B222BBB17", VehicleType.CAR, Calendar.getInstance())

    val arrayOfVehicles = arrayOf(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11,
    car12, car13, car14, car15, car16, car17, car18, car19, car20, car21)

    val parking = Parking(mutableSetOf())
    for (vehicle in arrayOfVehicles){
        println(parking.addVehicle(vehicle))
    }

    println(parking.vehicles.size)

    parking.removeVehicle(car1)
    println(parking.vehicles.size)



}

