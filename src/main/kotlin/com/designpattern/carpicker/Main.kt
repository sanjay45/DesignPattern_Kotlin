package com.designpattern.carpicker

import com.designpattern.carpicker.vehicle.Vehicle


//In java
class Main {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello World")

            val vehicle = Vehicle()
            println("My car's price is = ${vehicle.price}")
        }
    }
}