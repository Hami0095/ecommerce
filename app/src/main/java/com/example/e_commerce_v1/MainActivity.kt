package com.example.e_commerce_v1

import android.content.ClipData.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private var newArrayList: ArrayList<Items> = arrayListOf<Items>()
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    lateinit var price: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageId= arrayOf(
            R.drawable.s1,
            R.drawable.s2,
            R.drawable.s3,
            R.drawable.s4,
            R.drawable.s5,
            R.drawable.s6,
            R.drawable.s7,
            R.drawable.s8,
            R.drawable.s9,
            R.drawable.s10,
            R.drawable.s11,
            R.drawable.s12,
            R.drawable.s13,
            R.drawable.s14
        )
        heading= arrayOf(
            "Blue Shirt F",
            "Gray Shirt F",
            "Brown Shirt M",
            "Gray Shirt M",
            "Check Shirt",
            "White Shirt",
            "Tight Fit Shirt",
            "Black Shirt",
            "Savag Shirt",
            "Black Half Sleeves",
            "Collar Shirt",
            "Smiley Shirt",
            "Light Gray White Shirt",
            "Green Shirt",
        )
        price = arrayOf(
            "Pkr 1000",
            "Pkr 1500",
            "Pkr 1300",
            "Pkr 1600",
            "Pkr 1200",
            "Pkr 1670",
            "Pkr 1890",
            "Pkr 1320",
            "Pkr 1210",
            "Pkr 1300",
            "Pkr 1600",
            "Pkr 2000",
            "Pkr 1300",
            "Pkr 1000",
        )
        newRecyclerView= findViewById(R.id.main_recyclerView)
        newRecyclerView.layoutManager= LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        getUserData()


    }
    private fun getUserData(){
        lateinit var item:Items
        for(i in imageId.indices){
            item= Items(titleImage= imageId[i], heading = heading[i], price= price[i])
            newArrayList.add(item)
        }
        var adapter = MyAdapter(newArrayList)
        newRecyclerView.adapter= adapter
        adapter.setOnClickListener(object: MyAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(this@MainActivity, "You clicked on item no. $position",Toast.LENGTH_SHORT).show()
            }
        })


    }
}