package com.example.onedemo.hilt

import javax.inject.Inject

/**
 *@Description:
 *
 */
class ElectricEngine @Inject constructor() : Engine {
    override fun start() {
        println("Electric engine start.")
    }

    override fun shutdown() {
        println("Electric engine shutdown.")
    }
}