package com.designpattern.carpicker.vehicle

import com.designpattern.carpicker.vehicle.parts.Engine
import com.designpattern.carpicker.vehicle.parts.WheelBase


class Vehicle {

    val wheelBase = WheelBase()
    val engine = Engine()

    val price: Int get() {
        var cost = 0
        cost += wheelBase.price
        cost += wheelBase.chasis.price
        cost += wheelBase.wheels.sumOf {
            it.price
        }
        cost += wheelBase.chasis.seats.sumOf {
            it.price
        }
        cost += engine.price
        cost += engine.transmission.price

        return cost
    }

}