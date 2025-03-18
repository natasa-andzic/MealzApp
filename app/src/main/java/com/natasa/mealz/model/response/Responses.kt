package com.natasa.mealz.model.response

import com.google.gson.annotations.SerializedName
import com.natasa.mealz.ui.meals.MealzCategoryViewModel

data class MealsCategoriesResponse(
     val categories: List<MealResponse>
)

//Gson deserialization into JSON into data classes

data class MealResponse(
    @SerializedName("idCategory")  val id: String,
    @SerializedName("strCategory")  val name: String,
    @SerializedName("strCategoryDescription")  val description: String,
    @SerializedName("strCategoryThumb")  val imageUrl: String
)