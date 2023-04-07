package com.example.epoxypractice.models

import com.example.epoxypractice.R

object FoodDataFactory {
    private val random = java.util.Random()

    private val titles = arrayListOf("Nachos", "Fries", "Cheese Balls", "Pizza")

    private fun randomTitle(): String {
        val title = random.nextInt(4)
        return titles[title]
    }

    private fun randomPicture(): Int {
        return when (random.nextInt(7)) {
            0 -> R.drawable.food_1
            1 -> R.drawable.food_3
            2 -> R.drawable.food_5
            3 -> R.drawable.food_6
            4 -> R.drawable.food_8
            5 -> R.drawable.food_9
            6 -> R.drawable.food_3
            else -> R.drawable.food_9
        }
    }
    fun getFoodItems(count: Int): List<Food> {
        val foodItems = mutableListOf<Food>()
        repeat(count) {
            val image = randomPicture()
            val title = randomTitle()
            val desc = "dummy"
            foodItems.add(Food(image, title, desc))
        }
        return foodItems
    }
}
