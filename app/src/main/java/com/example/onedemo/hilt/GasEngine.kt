package com.example.onedemo.hilt

import javax.inject.Inject

/**
 *@Description:
 *
 */
class GasEngine @Inject constructor() : Engine {
    override fun start() {
        println("Gas engine start.")
    }

    override fun shutdown() {
        println("Gas engine shutdown.")
    }
}