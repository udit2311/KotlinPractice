package com.app.coffeeShop.domain

class Coffee(id: Int, productName: String, price: Double) : Product(id, productName, price) {
    override fun toString(): String {
        return ("ID:$id\t\t$productName\t\t$price\n")
    }
}