package com.designpattern.carpicker.vehicle.parts

class Engine: Part {

    val transmission = Transmission()
    override val price: Int
        get() = 150000
}