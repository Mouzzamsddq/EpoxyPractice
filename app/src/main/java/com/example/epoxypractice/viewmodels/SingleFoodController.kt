package com.example.epoxypractice.viewmodels

import com.airbnb.epoxy.EpoxyController
import com.example.epoxypractice.models.Food
import com.example.epoxypractice.models.FoodDataFactory
import com.example.epoxypractice.views.SingleFoodModel_

class SingleFoodController : EpoxyController() {
    var foodItems: List<Food> = FoodDataFactory.getFoodItems(50)
    override fun buildModels() {
        var id: Long = 0
        foodItems.forEach { food ->
            SingleFoodModel_()
                .id(id++)
                .image(food.image)
                .title(food.title)
                .addTo(this)
        }
    }
}
