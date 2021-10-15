package com.pizza.order

import com.pizza.dish.Dish
import com.pizza.dish.Drinks
import com.pizza.dish.Pizza
import com.pizza.visitor.Visitor

class Order(val id: Int, val pizza: Array<Pizza>, val drinks: Array<Drinks>) {
    fun make() {
        println("Ordered")
    }
     fun price() {
         var price = 0
         pizza.forEach { i ->
             price += i.price
         }
         drinks.forEach { i ->
             price += i.price
         }
         println("Meals price is: $price UAH")
     }

}