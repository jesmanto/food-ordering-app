package com.jtech.foodorderingapp

object DummyData {
    val pizzaList = listOf(
        Pizza(
            "Margarita", "Medium", "Medium | Cheese , onion, and tomato pure", 12.0
        ),
        Pizza(
            "Classic Pepperoni",
            "Medium",
            "Medium | Cheese, hungarian pepper, paneer, capsicum and onion",
            12.0
        ),
        Pizza(
            "Chicken Supreme", "Medium",
            "Medium | Cheese , onion, and tomato pure",
            12.0
        ),
        Pizza(
            "Vegetarian", "Medium",
            "Medium | Cheese , onion, and tomato pure",
            12.0
        ),
        Pizza(
            "Margarita", "Medium",
            "Medium | Cheese , onion, and tomato pure",
            12.0
        ),
        Pizza(
            "Margarita", "Medium",
            "Medium | Cheese , onion, and tomato pure",
            12.0
        )
    )

    val foodList = listOf(
        Food("Pizza", true),
        Food("Salad", false),
        Food("Desserts", false),
        Food("African", false),
        Food("Snacks", false)
    )
}