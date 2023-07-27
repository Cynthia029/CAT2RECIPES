package com.example.recipes.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MealDao {
    @Query("SELECT * FROM meal_table")
    fun getAllMeals(): List<MealEntity>

    @Insert
    fun insertMeal(meal: MealEntity)

    @Query("DELETE FROM meal_table")
    fun clearAllMeals()
}
