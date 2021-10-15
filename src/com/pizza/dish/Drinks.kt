package com.pizza.dish

data class Drinks(override val id: Int,
             override val name: String,
             override val price: Int) : Dish() {
}