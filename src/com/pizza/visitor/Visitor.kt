package com.pizza.visitor

import com.pizza.dish.Drinks
import com.pizza.dish.Pizza
import com.pizza.order.Order

class Visitor(open val id: Int, val name: String) {
    fun showMenu(pizza: Array<Pizza>, drinks: Array<Drinks>) {
        pizza.forEach { i ->
            println("Pizza name: ${i.name} , price: ${i.price}")

        }
        println()
        drinks.forEach { i ->
            println("Drink name: ${i.name} , price: ${i.price}")

        }
        println()
    }

}

