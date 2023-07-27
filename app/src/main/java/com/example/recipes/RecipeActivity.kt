package com.example.recipes

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.recipes.data.Meal
import com.example.recipes.ui.theme.RecipesTheme


class RecipeActivity : ComponentActivity() {
    private val meal: Meal by lazy {
        intent?.getSerializableExtra(MEAL_ID) as Meal
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            RecipesTheme{
                MealScreen(meal = meal)

                
            }

        }
    }
    companion object{
        private const val MEAL_ID ="Meal Id"
        fun newIntent(context: Context,meal: Meal) =Intent(context, RecipeActivity::class.java).apply {
            putExtra(MEAL_ID, meal)
        }
    }
}