package com.example.e_commerce_v1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class CartAdapter(private val itemsList: ArrayList<Items>) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    class CartViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val titleImage : ShapeableImageView = itemView.findViewById(R.id.cart_image)
        val titleHeading: TextView = itemView.findViewById(R.id.cart_heading)
        val titlePrice: TextView = itemView.findViewById(R.id.cart_price)
        var totalAmount:String = cart.totalAmount()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.cart_item, parent, false)
        return CartViewHolder(itemView)
    }


    override fun getItemCount(): Int {
        return itemsList.size
    }

    override fun onBindViewHolder(holder: CartAdapter.CartViewHolder, position: Int) {
        val currentItem = itemsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.titleHeading.text= currentItem.heading
        holder.titlePrice.text = currentItem.price
        holder.totalAmount = currentItem.totalPrice()
    }
}