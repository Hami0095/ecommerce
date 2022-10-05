package com.example.e_commerce_v1

data class Items(
    var titleImage: Int,
    var heading: String,
    var price: String,
    var description: String,
    var quantity: Int = 0,

    ){
    fun totalPrice() : String{
        var p:Int = price.toInt()
        return (quantity * p).toString()
    }
}
