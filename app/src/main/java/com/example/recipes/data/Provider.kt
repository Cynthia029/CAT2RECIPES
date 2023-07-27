package com.example.recipes.data

import android.content.Context
import com.example.fufuurecipies.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object Provider {
    val meal =
        Meal(
            id = 1,
            name = "eggs",
            description ="Deviled Eggs(Facelifted Eggs) With Uber-Kenyan Kachumbari ",
            duration = "1 Hour",
            Ingredients ="2 Matoke" +
                    "3 Eggs" +
                    "1 Curry Powder Sachet" +
                    "1/2 cup Vegetable Oil" +
                    "1 Tomato" +
                    "1 Red Onion" +
                    "1 dhania bunch" +
                    "1 Lemon",
            Steps ="",
            mealImageId = R.drawable.img1
        )
    val mealList = listOf(
        Meal(
            id = 1,
            name = "pan cakes",
            description ="\n" +
                    "Mayai mwitu, also known as \"wild eggs\" in Swahili, is a traditional" +
                    " East African dish that showcases the creative use of eggs in local cuisine." +
                    " It involves frying eggs in a unique way, typically in a shallow pan with" +
                    " various ingredients added to enhance the flavor. Common additions" +
                    " include onions, tomatoes, spices, and sometimes chopped vegetables" +
                    " or meats. Mayai mwitu is known for its rustic and hearty nature," +
                    " often enjoyed as a breakfast or brunch dish. ",
            duration = "Heating the pan and adding oil: 1-2 minutes\n" +
                    "Sautéing onions: 3-5 minutes\n" +
                    "Adding tomatoes and chili pepper: 2-3 minutes\n" +
                    "Cracking eggs and seasoning: 1-2 minutes\n" +
                    "Stirring and cooking eggs: 5-7 minutes",
            Ingredients ="2 Matoke\n" +
                    "3 Eggs\n" +
                    "1 Curry Powder Sachet\n" +
                    "1/2 cup Vegetable Oil\n" +
                    "1 Tomato\n" +
                    "1 Red Onion\n" +
                    "1 dhania bunch\n" +
                    "1 Lemon",
            Steps ="Heat a non-stick frying pan or skillet over medium heat and add the cooking oil. Allow the oil to heat up.\n" +
                    "\n" +
                    "Add the chopped onions to the pan and sauté them until they become translucent and lightly browned.\n" +
                    "\n" +
                    "Add the diced tomatoes and green chili pepper (if using) to the pan. Stir and cook until the tomatoes start to soften and release their juices.\n" +
                    "\n" +
                    "Crack the eggs directly into the pan, ensuring they are evenly distributed over the onion and tomato mixture. Be careful not to break the egg yolks.\n" +
                    "\n" +
                    "Sprinkle salt and black pepper over the eggs according to your taste preferences.\n" +
                    "\n" +
                    "Using a spatula or wooden spoon, gently stir the eggs and mix them with the onion and tomato mixture. You can break the egg yolks slightly for a more evenly cooked dish or leave them intact for a visually appealing presentation.\n" +
                    "\n" +
                    "Cook the eggs over medium heat, stirring occasionally, until they are fully cooked and no longer runny. The eggs should be firm and set, but still moist and tender.\n" +
                    "\n" +
                    "Once the eggs are cooked to your liking, remove the pan from the heat.\n" +
                    "\n" +
                    "Serve the mayai mwitu hot, either as a standalone dish or with accompaniments such as chapati, bread, or rice.",
            mealImageId = R.drawable.img1
        ),
        Meal(
            id = 2,
            name = "ugali",
            description ="\n" +
                    "Ugali choma is a popular East African dish that combines " +
                    "two staple foods: ugali and choma (grilled meat). Ugali is a " +
                    "thick, starchy porridge made from maize flour and water, often served" +
                    " as a main carbohydrate component in the region. Choma refers to grilled" +
                    " or barbecued meat, typically goat, beef, or chicken, which is marinated " +
                    "with spices and then cooked over an open flame or charcoal.",
            duration = "Marinating the meat: 30 minutes (marination time can be adjusted based on preference)\n" +
                    "Preheating the grill: 10-15 minutes (depending on the type of grill)\n" +
                    "Grilling the meat: 10-30 minutes (depending on the type and thickness of meat)\n" +
                    "Preparing the ugali: 5-10 minutes (depending on the quantity and desired thickness)",
            Ingredients ="Goat, beef, or chicken (cut into pieces)\n" +
                    "Salt (to taste)\n" +
                    "Black pepper (to taste)\n" +
                    "Lemon juice (optional)\n" +
                    "Cooking oil (for grilling)\n" +
                    "Maize flour (for ugali)\n" +
                    "Water (for ugali)",
            Steps ="Marinate the meat: In a bowl, season the meat pieces with salt, black pepper, and lemon juice (if desired). Allow the meat to marinate for at least 30 minutes to enhance the flavors.\n" +
                    "\n" +
                    "Preheat the grill: Heat the grill or barbecue to medium-high heat. Make sure the grill grates are clean and well-oiled to prevent sticking.\n" +
                    "\n" +
                    "Grill the meat: Place the marinated meat on the hot grill and cook it to your desired level of doneness. Turn the meat occasionally to ensure even cooking. The cooking time will vary depending on the type and thickness of the meat. Generally, it takes around 10-15 minutes for smaller cuts of meat to cook through, while larger cuts may require more time. Adjust the cooking time accordingly.\n" +
                    "\n" +
                    "Prepare the ugali: While the meat is grilling, prepare the ugali. In a large saucepan, bring water to a boil. Gradually add maize flour while continuously stirring to prevent lumps from forming. Keep stirring until the mixture thickens and starts to pull away from the sides of the pan.\n" +
                    "\n" +
                    "Shape the ugali: Once the ugali has thickened, reduce the heat to low. Wet your hands with water to prevent sticking, then take a portion of the hot ugali and shape it into a ball or mound using your hands. Repeat until all the ugali is shaped.\n" +
                    "\n" +
                    "Serve: Once the meat is cooked and the ugali is shaped, it's time to serve Ugali Choma. Arrange the grilled meat on a platter and place the shaped ugali alongside it. Ugali can be served as a base for the meat or eaten by tearing off small portions and using it to scoop up the meat.\n" +
                    "\n" +
                    "Enjoy: Ugali Choma is traditionally eaten with hands, so dig in and enjoy the flavorful combination of the grilled meat and the soft, starchy texture of the ugali. You can also pair it with side dishes like sukuma wiki (collard greens) or kachumbari (a fresh tomato and onion salad) for a complete meal.",
            mealImageId = R.drawable.img2
        ),
        Meal(
            id = 3,
            name = " kuku wet",
            description ="\n" +
                    "\"Wet chicken\" is a term used to describe chicken that has been cooked or prepared " +
                    "with a wet cooking method, such as boiling, poaching, or braising. Wet chicken " +
                    "dishes often absorb the flavors of the cooking liquid, creating a rich and " +
                    "flavorful end result. This cooking technique is commonly used in soups, stews, " +
                    "curries, and other dishes where the chicken is intended to be tender and infused" +
                    " with the surrounding flavors.",
            duration = "•\tMarinating: 30 minutes\n" +
                    "•\tBreading: 10 minutes\n" +
                    "•\tDeep-frying: 15-20 minutes\n" +
                    "•\tCooking the sauce: 10 minutes\n" +
                    "•\tAssembling: 5 minutes\n",
            Ingredients ="•\tFor the chicken:" +
                    "\t1.5-2 pounds bone-in, skin-on chicken pieces" +
                    ",\t1/2 cup plain yogurt" +
                    ",\t1 tablespoon lemon juice" +
                    ",\t1 teaspoon garam masala" +
                    ",\t1 teaspoon ground cumin" +
                    ",\t1 teaspoon ground coriander" +
                    ",\t1/2 teaspoon turmeric powder" +
                    ",\t1/4 teaspoon cayenne pepper" +
                    ",\t1/4 teaspoon salt\n" +
                    "•\tFor the sauce:" +
                    "\t1 tablespoon vegetable oil" +
                    ",\t1 onion, chopped" +
                    ",\t2 cloves garlic, minced" +
                    ",\t1 teaspoon ginger, minced" +
                    ",\t1 (14.5 ounce) can diced tomatoes, undrained" +
                    ",\t1/2 cup water" +
                    ",\t1 tablespoon tomato paste" +
                    ",\t1 teaspoon garam masala" +
                    ",\t1/2 teaspoon ground cumin" +
                    ",\t1/4 teaspoon cayenne pepper" +
                    ",\t1/4 teaspoon salt\n" +
                    "•\tFor frying:" +
                    "\tVegetable oil, for frying\n",
            Steps ="1.\tIn a large bowl, combine the chicken, yogurt, lemon juice, garam masala, cumin, coriander, turmeric, cayenne pepper, and salt. Mix well to coat the chicken. Cover the bowl and refrigerate for at least 30 minutes, or up to overnight.\n" +
                    "2.\tTo make the sauce, heat the oil in a large skillet over medium heat. Add the onion and cook until softened, about 5 minutes. Add the garlic and ginger and cook for 1 minute more.\n" +
                    "3.\tStir in the diced tomatoes, water, tomato paste, garam masala, cumin, cayenne pepper, and salt. Bring to a simmer and cook for 15 minutes, or until the sauce has thickened.\n" +
                    "4.\tRemove the chicken from the marinade and discard the marinade.\n" +
                    "5.\tHeat the oil in a large pot or Dutch oven over medium-high heat. Fry the chicken pieces in batches until golden brown and cooked through, about 10-12 minutes per batch.\n" +
                    "6.\tServe the chicken with the sauce and your favorite sides.\n" +
                    "Enjoy!\n",
            mealImageId = R.drawable.img3
        ),
        Meal(
            id = 4,
            name = "rice",
            description ="Pilau, also known as pilaf, is a flavorful rice dish made by" +
                    " cooking rice in seasoned broth or stock along with a combination of" +
                    " spices, vegetables, and sometimes meat. The result is a fragrant and " +
                    "aromatic dish with grains that are typically separate and fluffy." +
                    " Pilau is enjoyed in many cultures worldwide and can be customized with" +
                    " different ingredients to create unique variations. ",
            duration = "•\tActive time: 30 minutes\n" +
                    "•\tTotal time: 1 hour\n",
            Ingredients ="•\t2 tablespoons vegetable oil" + "•\t1 large onion, chopped" + "•\t2 cloves garlic, minced" +
                    "•\t1 inch piece of ginger, minced" +
                    "•\t1 teaspoon ground cumin" +
                    "•\t1 teaspoon ground coriander" +
                    "•\t1/2 teaspoon turmeric powder" +
                    "•\t1/4 teaspoon cayenne pepper" +
                    "•\t1/4 teaspoon salt" +
                    "•\t1 pound boneless, skinless chicken breasts, cut into 1-inch pieces" +
                    "•\t2 cups basmati rice" +
                    "•\t3 cups water" +
                    "•\t1 bay leaf" +
                    "•\t1/2 teaspoon garam masala" +
                    "•\t1/4 cup chopped cilantro, for garnish",
            Steps ="1.\tHeat the oil in a large pot or Dutch oven over medium heat. Add the onion and cook until softened, about 5 minutes. Add the garlic and ginger and cook for 1 minute more.\n" +
                    "2.\tStir in the cumin, coriander, turmeric, cayenne pepper, and salt. Cook for 1 minute more.\n" +
                    "3.\tAdd the chicken and cook until browned on all sides, about 5 minutes.\n" +
                    "4.\tAdd the rice, water, bay leaf, and garam masala. Bring to a boil, then reduce heat to low, cover, and simmer for 20 minutes, or until the rice is cooked through and the liquid has been absorbed.\n" +
                    "5.\tGarnish with cilantro and serve.\n",
            mealImageId = R.drawable.img4
        ),
        Meal(
            id = 5,
            name = "Meat",
            description ="Meatballs are savory, bite-sized balls of ground meat, " +
                    "typically seasoned with herbs, spices, and breadcrumbs. They are" +
                    " a versatile and popular dish enjoyed in various cuisines" +
                    " around the world, often served with pasta, rice, or in sandwiches.",
            duration = "•\tActive time: 30 minutes\n" +
                    "•\tTotal time: 1 hour\n",
            Ingredients ="•\t1 pound ground beef" +
                    "•\t1/2 cup breadcrumbs" +
                    "•\t1/4 cup milk" +
                    "•\t1 egg" +
                    "•\t1/4 cup grated Parmesan cheese" +
                    "•\t1/4 cup chopped onion" +
                    "•\t1 teaspoon dried oregano" +
                    "•\t1/2 teaspoon salt" +
                    "•\t1/4 teaspoon black pepper",
            Steps ="1.\tIn a large bowl, combine all of the ingredients. Mix well until everything is evenly combined.\n" +
                    "2.\tForm the mixture into meatballs about 1-2 inches in diameter.\n" +
                    "3.\tHeat a large skillet over medium heat. Add a small amount of oil to the skillet.\n" +
                    "4.\tCook the meatballs in batches until browned on all sides, about 5-7 minutes per batch.\n" +
                    "5.\tServe the meatballs with your favorite sauce or pasta.\n",
            mealImageId = R.drawable.img6
        ),
        Meal(
            id = 6,
            name = "Maziwa Mala",
            description = "Maziwa Mala is a traditional East African fermented milk drink known for its tangy and creamy flavor. It is made by fermenting fresh milk with a Maziwa Mala starter culture or plain yogurt with active cultures. The fermentation process gives it a thick texture and a delightful tang, making it a refreshing and nutritious beverage enjoyed in East African cuisines.",
            duration = "•\tPreparation time: 10 minutes\n" +
                    "•\tFermentation time: 24 hours\n",
            Ingredients = "•\t1 liter fresh milk (preferably whole milk)\n" +
                    "•\t2 tablespoons Maziwa Mala starter culture or plain yogurt with active cultures\n",
            Steps = "1.\tHeat the fresh milk in a clean pot over low to medium heat until it reaches around 85°C (185°F). Stir occasionally to prevent scorching.\n" +
                    "2.\tAllow the milk to cool down to around 43°C (110°F). You can speed up the cooling process by placing the pot in a cold water bath.\n" +
                    "3.\tAdd the Maziwa Mala starter culture or plain yogurt with active cultures to the cooled milk. Mix well to ensure even distribution.\n" +
                    "4.\tCover the pot with a clean lid or cloth and leave it undisturbed at room temperature for approximately 24 hours. During this time, the beneficial bacteria will ferment the milk, creating the tangy and creamy Maziwa Mala.\n" +
                    "5.\tAfter 24 hours, check the consistency and taste of the Maziwa Mala. It should have a slightly thickened and creamy texture with a tangy flavor. If needed, you can let it ferment for a few more hours until the desired taste is achieved.\n" +
                    "6.\tRefrigerate the Maziwa Mala to halt the fermentation process and preserve its flavor.\n" +
                    "7.\tServe the Maziwa Mala chilled as a refreshing drink or use it as a yogurt substitute in various recipes.\n" +
                    "8.\tEnjoy your homemade Maziwa Mala!\n",
            mealImageId = R.drawable.mala
        ),
        Meal(
            id = 7,
            name = "Ndenguu",
                    description = "Ndenguu, also known as Kenyan Green Gram Stew, is a flavorful and nutritious dish from Kenya. It is made with green grams (mung beans) cooked in a rich coconut sauce along with various spices and vegetables. Ndenguu is a popular dish enjoyed with rice, chapati, or ugali in Kenyan cuisine.",
                    duration = "•\tPreparation time: 10 minutes\n" +
                    "•\tCooking time: 40 minutes\n" +
                    "•\tTotal time: 50 minutes\n",
                    Ingredients = "•\t1 cup green grams (mung beans), soaked overnight and drained\n" +
                    "•\t1 tablespoon cooking oil\n" +
                    "•\t1 onion, finely chopped\n" +
                    "•\t2 cloves of garlic, minced\n" +
                    "•\t1 teaspoon grated ginger\n" +
                    "•\t1 tomato, chopped\n" +
                    "•\t1 cup coconut milk\n" +
                    "•\t2 cups vegetable broth or water\n" +
                    "•\t1 teaspoon ground cumin\n" +
                    "•\t1 teaspoon ground coriander\n" +
                    "•\t1/2 teaspoon turmeric powder\n" +
                    "•\t1/2 teaspoon red chili powder (adjust to taste)\n" +
                    "•\tSalt to taste\n" +
                    "•\tChopped cilantro for garnish\n",
                    Steps = "1.\tIn a large pot, heat the cooking oil over medium heat. Add the chopped onions and sauté until they become soft and translucent.\n" +
                    "2.\tAdd the minced garlic and grated ginger to the pot. Sauté for another minute until the garlic releases its aroma.\n" +
                    "3.\tAdd the chopped tomato to the pot and cook until it becomes soft and starts to break down.\n" +
                    "4.\tStir in the soaked and drained green grams (mung beans) into the pot, and mix well with the sautéed vegetables.\n" +
                    "5.\tPour in the coconut milk and vegetable broth or water. Stir in the ground cumin, ground coriander, turmeric powder, red chili powder, and salt.\n" +
                    "6.\tBring the mixture to a boil, then reduce the heat to low. Cover the pot and let it simmer for about 30 minutes or until the green grams are tender and fully cooked.\n" +
                    "7.\tCheck the seasoning and adjust salt and spices according to your taste preferences.\n" +
                    "8.\tOnce the Ndenguu is cooked to perfection, garnish it with chopped cilantro.\n" +
                    "9.\tServe the Ndenguu hot with steamed rice, chapati, or ugali.\n" +
                    "10.\tEnjoy the delicious and wholesome Ndenguu – a taste of Kenyan cuisine!\n",
            mealImageId = R.drawable.ngengu
        ),
        Meal(
            id = 8,
            name = "chipoo",
            description = "Ndenguu, also known as Kenyan Green Gram Stew, is a flavorful and nutritious dish from Kenya. It is made with green grams (mung beans) cooked in a rich coconut sauce along with various spices and vegetables. Ndenguu is a popular dish enjoyed with rice, chapati, or ugali in Kenyan cuisine.",
            duration = "•\tPreparation time: 10 minutes\n" +
                    "•\tCooking time: 40 minutes\n" +
                    "•\tTotal time: 50 minutes\n",
            Ingredients = "•\t1 cup green grams (mung beans), soaked overnight and drained\n" +
                    "•\t1 tablespoon cooking oil\n" +
                    "•\t1 onion, finely chopped\n" +
                    // Add the rest of the ingredients here
                    "•\tChopped cilantro for garnish\n",
            Steps = "1.\tIn a large pot, heat the cooking oil over medium heat. Ad become soft and translucent.\n" ,

            mealImageId = R.drawable.chipoo
        ),
        Meal(
            id = 9,
            name = "Kuku",
                    description = "Kuku, also known as Kenyan Chicken Curry, is a flavorful and aromatic dish from Kenya. It features tender chicken pieces cooked in a fragrant blend of spices, coconut milk, and tomatoes. Kuku is a popular and hearty meal enjoyed with rice, chapati, or ugali in Kenyan cuisine.",
                    duration = "•\tPreparation time: 20 minutes\n" +
                    "•\tCooking time: 40 minutes\n" +
                    "•\tTotal time: 1 hour\n",
                    Ingredients = "•\t500g chicken pieces, cleaned and cut\n" +
                    "•\t2 tablespoons cooking oil\n" +
                    "•\t1 onion, finely chopped\n" +
                    "•\t2 cloves of garlic, minced\n" +
                    "•\t1 teaspoon grated ginger\n" +
                    "•\t2 tomatoes, chopped\n" +
                    "•\t1 cup coconut milk\n" +
                    "•\t1 cup chicken broth or water\n" +
                    "•\t1 tablespoon curry powder\n" +
                    "•\t1/2 teaspoon turmeric powder\n" +
                    "•\t1/2 teaspoon cayenne pepper (adjust to taste)\n" +
                    "•\tSalt to taste\n" +
                    "•\tChopped fresh cilantro for garnish\n",
                    Steps = "1.\tIn a large pot, heat the cooking oil over medium heat. Add the chopped onions and sauté until they become soft and translucent.\n" +
                    "2.\tAdd the minced garlic and grated ginger to the pot. Sauté for another minute until the garlic releases its aroma.\n" +
                    "3.\tAdd the chopped tomatoes to the pot and cook until they become soft and start to break down.\n" +
                    "4.\tStir in the chicken pieces into the pot and cook until they are lightly browned on all sides.\n" +
                    "5.\tPour in the coconut milk and chicken broth or water. Stir in the curry powder, turmeric powder, cayenne pepper, and salt.\n" +
                    "6.\tBring the mixture to a boil, then reduce the heat to low. Cover the pot and let it simmer for about 30 minutes or until the chicken is tender and fully cooked.\n" +
                    "7.\tCheck the seasoning and adjust salt and spices according to your taste preferences.\n" +
                    "8.\tOnce the Kuku is cooked to perfection, garnised\n",

                    mealImageId = R.drawable.kuku
        ),
        Meal(
            id = 10,
            name = "Matumbo",
            description ="•\tPreparation time: 30 minutes\n",
            duration = "•\t500g beef tripe, cleaned and cut into pieces. \n" +
                    "8.\tOnce the Kuku is cooked to perfection, garnised\n",
            Ingredients ="",
            Steps ="",
            mealImageId = R.drawable.matumbo
        ),


        )


    // Save data to the Room database using coroutines
    suspend fun saveMealsToDatabase(context: Context) {
        val database = DatabaseProvider.getDatabase(context)
        val mealDao = database.mealDao()

        withContext(Dispatchers.IO) {
            // Clear any existing data in the table
            mealDao.clearAllMeals()

            // Insert the new data from the mealList
            mealList.forEach { meal ->
                val mealEntity = MealEntity(
                    id = meal.id,
                    name = meal.name,
                    description = meal.description,
                    duration = meal.duration,
                    Ingredients = meal.Ingredients,
                    Steps = meal.Steps,
                    mealImageId = meal.mealImageId
                )
                mealDao.insertMeal(mealEntity)
            }
        }
    }

    // Retrieve data from the Room database
    fun getMealsFromDatabase(context: Context): List<Meal> {
        val database = DatabaseProvider.getDatabase(context)
        val mealDao = database.mealDao()
        val mealEntities = mealDao.getAllMeals()

        return mealEntities.map { mealEntity ->
            Meal(
                id = mealEntity.id,
                name = mealEntity.name,
                description = mealEntity.description,
                duration = mealEntity.duration,
                Ingredients = mealEntity.Ingredients,
                Steps = mealEntity.Steps,
                mealImageId = mealEntity.mealImageId
            )
        }
    }
}

