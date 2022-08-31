package com.example.challengealkemy1

import kotlinx.coroutines.withTimeout
import java.util.*


val parking = Parking(mutableSetOf())


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

    for (vehicle in arrayOfVehicles){
        println(addVehicleAndShowMessage(vehicle))
    }

    println(parking.vehicles.size)

    parking.checkOutVehicle(car2)
    println(parking.vehicles.size)






    /*  parking.addVehicle(car1)
    parking.addVehicle(car2)
    parking.addVehicle(car3)
    parking.addVehicle(car4)
    parking.addVehicle(car5)
    parking.addVehicle(car6)
    parking.addVehicle(car7)
    parking.addVehicle(car8)
    parking.addVehicle(car9)
    parking.addVehicle(car10)
    parking.addVehicle(car11)
    parking.addVehicle(car12)
    parking.addVehicle(car13)
    parking.addVehicle(car14)
    parking.addVehicle(car15)
    parking.addVehicle(car16)
    parking.addVehicle(car17)
    println(parking.addVehicle(car18))
    println(addVehicleAndShowMessage(car19))
    println(addVehicleAndShowMessage(car20))
    println(addVehicleAndShowMessage(car21))



    val parking = Parking(mutableSetOf(car, car, car2))
    val iscar2Inserted = parking.vehicles.add(car2)

    println(iscar2Inserted)
    parking.vehicles.remove(car)
    println(parking.vehicles.contains(car))
    println(parking.vehicles.contains(car))
*/
}

//Function to display a message depending on the result of the "addVehicle" function
fun addVehicleAndShowMessage(vehicle: Vehicle): String {
    return when (parking.addVehicle(vehicle)) {
        true -> "Welcome to Alkeparking"
        false -> "Sorry, the check-in Failed"
    }
}
