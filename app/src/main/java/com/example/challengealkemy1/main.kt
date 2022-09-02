package com.example.challengealkemy1

import kotlinx.coroutines.withTimeout
import java.util.*



fun main() {

    //Instances of all vehicles
    val vehicle1 = Vehicle("AA111AA1", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CAR_001")
    val vehicle2 = Vehicle("B222BBB2", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val vehicle3 = Vehicle("B222BBC3", VehicleType.BUS, Calendar.getInstance())
    val vehicle4 = Vehicle("AA111AD4", VehicleType.MINIBUS, Calendar.getInstance(), "DISCOUNT_MINIBUS_001")
    val vehicle5 = Vehicle("B222BBB5", VehicleType.CAR, Calendar.getInstance())
    val vehicle6 = Vehicle("B222BBB6", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val vehicle7 = Vehicle("AA111AA7", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_BUS_001")
    val vehicle8 = Vehicle("B222BBB8", VehicleType.MINIBUS, Calendar.getInstance())
    val vehicle9 = Vehicle("B222BBB9", VehicleType.CAR, Calendar.getInstance())
    val vehicle10 = Vehicle("AA111AA10", VehicleType.MOTORCYCLE, Calendar.getInstance(), "DISCOUNT_MOTORCYCLE_001")
    val vehicle11 = Vehicle("B222BBB11", VehicleType.BUS, Calendar.getInstance())
    val vehicle12 = Vehicle("B222BBB12", VehicleType.MINIBUS, Calendar.getInstance())
    val vehicle13 = Vehicle("AA111AA13", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CAR_002")
    val vehicle14 = Vehicle("B222BBB14", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val vehicle15 = Vehicle("B222BBB15", VehicleType.BUS, Calendar.getInstance())
    val vehicle16 = Vehicle("AA111AA16", VehicleType.MINIBUS, Calendar.getInstance(), "DISCOUNT_MINIBUS_002")
    val vehicle17 = Vehicle("B222BBB17", VehicleType.CAR, Calendar.getInstance())
    val vehicle18 = Vehicle("B222BBB18", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val vehicle19 = Vehicle("AA111AA19", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_BUS_002")
    val vehicle20 = Vehicle("B222BBB20", VehicleType.MINIBUS, Calendar.getInstance())
    val vehicle21 = Vehicle("B222BBB21", VehicleType.CAR, Calendar.getInstance())

    //Array of vehicles
    val arrayOfVehicles = arrayOf(vehicle1, vehicle2, vehicle3, vehicle4, vehicle5, vehicle6, vehicle7, vehicle8, vehicle9, vehicle10, vehicle11,
    vehicle12, vehicle13, vehicle14, vehicle15, vehicle16, vehicle17, vehicle18, vehicle19, vehicle20, vehicle21)

    val parking = Parking(mutableSetOf())

    //for structure that adds the vehicles to the parking lot
    for (vehicle in arrayOfVehicles){
        parking.addVehicle(vehicle)
    }

    /*
 // when I add two equal vehicles it will show the message "Sorry, the check-in Failed"
    parking.addVehicle(vehicle1)
    parking.addVehicle(vehicle2)
    parking.addVehicle(vehicle3)
    parking.addVehicle(vehicle3)
*/

    //When a vehicle is removed the message  "Your fee is $fee. Come back soon" is displayed
    //parking.addVehicle(vehicle1)
    //parking.removeVehicle(vehicle1)


    //When we try to remove a vehicle that is not in the parking lot, the message "Sorry , the check out failed" is displayed
    //parking.removeVehicle(vehicle1)

    //We call a function that lists the vehicles inside the parking lot
    //parking.addVehicle(vehicle1)
    //parking.addVehicle(vehicle2)
    // parking.addVehicle(vehicle3)
    //parking.listVehicles()


    // Functions that shows the number of vehicles that were removed along with the daily profit
    //parking.addVehicle(vehicle1)
    //parking.addVehicle(vehicle2)
    //parking.addVehicle(vehicle3)
    /*parking.removeVehicle(vehicle1)
    parking.removeVehicle(vehicle2)
    parking.removeVehicle(vehicle3)
    parking.showHistory()*/



}





