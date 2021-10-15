package com.pizza

import com.pizza.dish.Drinks
import com.pizza.dish.Pizza
import com.pizza.order.Order
import com.pizza.restaurant.Restaurant
import com.pizza.visitor.Visitor

fun main() {
    val pizza1 = Pizza(1, "Cezar", 10)
    val pizza2 = Pizza(2, "Summer", 30)
    val pizza3 = Pizza(3, "Spring", 70)
    val pizza = arrayOf(pizza1, pizza2, pizza3)
    val drinks1 = Drinks(4, "Cezar", 100)
    val drinks2 = Drinks(5, "Summer", 140)
    val drinks3 = Drinks(9, "Spring", 50)
    val drinks = arrayOf(drinks1, drinks2, drinks3)

    val visitor = Visitor(1, "SomeOne")
    val order = Order(1, pizza, drinks)
    val restaurant = Restaurant("PizzaMan","Cherkasy, some street")

    println(restaurant)
    println()
    println(visitor.showMenu(pizza, drinks))
    println(order.make())
    println(order.price())


}