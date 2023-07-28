package com.example.recipes

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.recipes.data.Meal
import com.example.recipes.data.Provider
import com.example.recipes.ui.theme.RecipiesTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity(), CoroutineScope by MainScope() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()

        // Call saveMealsToDatabase to populate the Room database using a coroutine scope
        launch {
            Provider.saveMealsToDatabase(applicationContext)
        }

        setContent {
            RecipiesTheme {
                MyApp { meal ->
                    startActivity(RecipesActivity.newIntent(this@MainActivity, meal))
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(navigateToProfile: (Meal) -> Unit ) {
    Scaffold(
        content = {
            RecipeHomeContent(navigateToProfile = navigateToProfile)
        }
    )
}
