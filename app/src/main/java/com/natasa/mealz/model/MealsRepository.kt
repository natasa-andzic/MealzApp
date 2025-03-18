package com.natasa.mealz.model

import com.natasa.mealz.model.api.MealsWebService
import com.natasa.mealz.model.response.MealsCategoriesResponse

class MealsRepository(private val webService: MealsWebService = MealsWebService()) {

    suspend fun getMeals(): MealsCategoriesResponse {
        return webService.getMeals()
    }
}