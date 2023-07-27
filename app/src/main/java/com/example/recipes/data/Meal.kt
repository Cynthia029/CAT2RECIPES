package com.example.recipes.data

import java.io.Serializable

data class Meal(
    val id: Long,
    val name: String,
    val description: String,
    val duration: String,
    val Ingredients: String,
    val Steps: String,
    val mealImageId: Int = 0


) :Serializable