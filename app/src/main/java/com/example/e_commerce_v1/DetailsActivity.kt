package com.example.e_commerce_v1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {

    private lateinit var myListener: OnCartBtnClickListener
    interface OnCartBtnClickListener{
        fun onCartBtnClick(position: Int)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_page)



        val detailsName: TextView = findViewById(R.id.details_nameID)
        val detailsImg: ImageView = findViewById(R.id.details_ImageID)
        val detailsDesc: TextView = findViewById(R.id.details_descriptionID)
        val detailsPrice: TextView = findViewById(R.id.details_priceID)
        val cartBtn: Button = findViewById<Button>(R.id.details_cartBtn)

        val bundle: Bundle?= intent.extras
        val name = bundle!!.getString("heading")
        val price = bundle.getString("price")
        val image = bundle.getInt("imageId")
        val desc = bundle.getString("description")
        cartBtn.setOnClickListener {
            val item = Items(image,name.toString(),price.toString(),desc.toString())
            if(!cart.itemsList.contains(item)){
                item.quantity++
                print(item.heading)
                cart.itemsList.add(item)
            }else{  // if the item is present in the cart, then just increment the quantity of the item
                item.quantity++
            }
            print(cart.itemsList.size)
            Toast.makeText(this@DetailsActivity, "Item added to cart!", Toast.LENGTH_SHORT).show()
        }
        detailsName.text = name
        detailsDesc.text  = desc
        detailsPrice.text = price
        detailsImg.setImageResource(image)

    }

}