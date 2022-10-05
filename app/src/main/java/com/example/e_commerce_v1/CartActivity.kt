package com.example.e_commerce_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CartActivity : AppCompatActivity() {
    private lateinit var cartRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        cartRecyclerView= findViewById(R.id.cart_recyclerView)
        val discardBtn = findViewById<Button>(R.id.discardBtn_ID)
        discardBtn.setOnClickListener {
            cart.itemsList.clear()
        }
        val checkOutBtn = findViewById<Button>(R.id.checkOutBtn_ID)
        checkOutBtn.setOnClickListener {
            cart.itemsList.clear()
            Toast.makeText(this, "Thankyou for the checkOut", Toast.LENGTH_SHORT).show()
        }
        cartRecyclerView.layoutManager= LinearLayoutManager(this)
        cartRecyclerView.setHasFixedSize(true)
        getCartData()
    }
    private fun getCartData(){
        var adapter = CartAdapter(cart.itemsList)
        cartRecyclerView.adapter= adapter
    }
}