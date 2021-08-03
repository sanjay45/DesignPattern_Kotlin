package com.designpattern.carpicker.vehicle.parts

class WheelBase : Part{
    val chasis = Chasis()
    val wheels: List<Wheel> = listOf(
        Wheel(), Wheel(), Wheel(), Wheel()
    )
    override val price: Int
        get() = 125000

}