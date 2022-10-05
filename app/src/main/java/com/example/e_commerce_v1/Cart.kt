package com.example.e_commerce_v1

var cart: Cart = Cart()

class Cart {
    var itemsList: ArrayList<Items> = ArrayList<Items>()
    init {
    }
    fun totalAmount() : String{
        var sum = 0
        val iterator = itemsList.iterator()
        for (iterator in itemsList){
            sum = iterator.totalPrice().toInt()
        }
        return sum.toString()
    }
}

