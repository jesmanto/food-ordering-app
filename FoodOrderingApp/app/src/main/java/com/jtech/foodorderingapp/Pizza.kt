package com.jtech.foodorderingapp

data class Pizza(
    val name: String? = null,
    val size: String? = null,
    val description: String? = null,
    val price: Double = 0.0
)

data class AddOn (
    val name: String,
    val price: Double
)
