package com.example.e_commerce_v1

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private var newArrayList: ArrayList<Items> = arrayListOf<Items>()
    private var tempArrayList: ArrayList<Items> = arrayListOf<Items>()
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    lateinit var price: Array<String>
    lateinit var description: Array<String>

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
            "1000",
            "1500",
            "1300",
            "1600",
            "1200",
            "1670",
            "1890",
            "1320",
            "1210",
            "1300",
            "1600",
            "2000",
            "1300",
            "1000",
        )
        description = arrayOf(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer lectus dui, dictum id scelerisque sed, maximus vel mi. In lectus tellus, tempor eget vehicula at, fringilla sit amet est. Mauris sagittis dolor pretium viverra rutrum. Sed congue pharetra facilisis. Morbi sem mi, ultricies varius massa et, accumsan sagittis orci. Etiam urna felis, pretium quis ultricies at, lacinia id ante. Donec ligula lacus, bibendum eu luctus quis, viverra ut odio. Maecenas lacus nunc, tempus et venenatis eget, porta sit amet nibh. Curabitur non scelerisque nisl. Donec facilisis porttitor nunc, eget congue arcu pharetra a. Nam mattis lacus sit amet felis suscipit hendrerit. Nulla interdum massa in tincidunt tincidunt. Sed ullamcorper sed mauris id accumsan. Pellentesque a iaculis neque. Quisque id augue sed turpis commodo luctus. In placerat neque vel justo scelerisque, nec facilisis diam scelerisque.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer lectus dui, dictum id scelerisque sed, maximus vel mi. In lectus tellus, tempor eget vehicula at, fringilla sit amet est. Mauris sagittis dolor pretium viverra rutrum. Sed congue pharetra facilisis. Morbi sem mi, ultricies varius massa et, accumsan sagittis orci. Etiam urna felis, pretium quis ultricies at, lacinia id ante. Donec ligula lacus, bibendum eu luctus quis, viverra ut odio. Maecenas lacus nunc, tempus et venenatis eget, porta sit amet nibh. Curabitur non scelerisque nisl. Donec facilisis porttitor nunc, eget congue arcu pharetra a. Nam mattis lacus sit amet felis suscipit hendrerit. Nulla interdum massa in tincidunt tincidunt. Sed ullamcorper sed mauris id accumsan. Pellentesque a iaculis neque. Quisque id augue sed turpis commodo luctus. In placerat neque vel justo scelerisque, nec facilisis diam scelerisque.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer lectus dui, dictum id scelerisque sed, maximus vel mi. In lectus tellus, tempor eget vehicula at, fringilla sit amet est. Mauris sagittis dolor pretium viverra rutrum. Sed congue pharetra facilisis. Morbi sem mi, ultricies varius massa et, accumsan sagittis orci. Etiam urna felis, pretium quis ultricies at, lacinia id ante. Donec ligula lacus, bibendum eu luctus quis, viverra ut odio. Maecenas lacus nunc, tempus et venenatis eget, porta sit amet nibh. Curabitur non scelerisque nisl. Donec facilisis porttitor nunc, eget congue arcu pharetra a. Nam mattis lacus sit amet felis suscipit hendrerit. Nulla interdum massa in tincidunt tincidunt. Sed ullamcorper sed mauris id accumsan. Pellentesque a iaculis neque. Quisque id augue sed turpis commodo luctus. In placerat neque vel justo scelerisque, nec facilisis diam scelerisque.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer lectus dui, dictum id scelerisque sed, maximus vel mi. In lectus tellus, tempor eget vehicula at, fringilla sit amet est. Mauris sagittis dolor pretium viverra rutrum. Sed congue pharetra facilisis. Morbi sem mi, ultricies varius massa et, accumsan sagittis orci. Etiam urna felis, pretium quis ultricies at, lacinia id ante. Donec ligula lacus, bibendum eu luctus quis, viverra ut odio. Maecenas lacus nunc, tempus et venenatis eget, porta sit amet nibh. Curabitur non scelerisque nisl. Donec facilisis porttitor nunc, eget congue arcu pharetra a. Nam mattis lacus sit amet felis suscipit hendrerit. Nulla interdum massa in tincidunt tincidunt. Sed ullamcorper sed mauris id accumsan. Pellentesque a iaculis neque. Quisque id augue sed turpis commodo luctus. In placerat neque vel justo scelerisque, nec facilisis diam scelerisque.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer lectus dui, dictum id scelerisque sed, maximus vel mi. In lectus tellus, tempor eget vehicula at, fringilla sit amet est. Mauris sagittis dolor pretium viverra rutrum. Sed congue pharetra facilisis. Morbi sem mi, ultricies varius massa et, accumsan sagittis orci. Etiam urna felis, pretium quis ultricies at, lacinia id ante. Donec ligula lacus, bibendum eu luctus quis, viverra ut odio. Maecenas lacus nunc, tempus et venenatis eget, porta sit amet nibh. Curabitur non scelerisque nisl. Donec facilisis porttitor nunc, eget congue arcu pharetra a. Nam mattis lacus sit amet felis suscipit hendrerit. Nulla interdum massa in tincidunt tincidunt. Sed ullamcorper sed mauris id accumsan. Pellentesque a iaculis neque. Quisque id augue sed turpis commodo luctus. In placerat neque vel justo scelerisque, nec facilisis diam scelerisque.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer lectus dui, dictum id scelerisque sed, maximus vel mi. In lectus tellus, tempor eget vehicula at, fringilla sit amet est. Mauris sagittis dolor pretium viverra rutrum. Sed congue pharetra facilisis. Morbi sem mi, ultricies varius massa et, accumsan sagittis orci. Etiam urna felis, pretium quis ultricies at, lacinia id ante. Donec ligula lacus, bibendum eu luctus quis, viverra ut odio. Maecenas lacus nunc, tempus et venenatis eget, porta sit amet nibh. Curabitur non scelerisque nisl. Donec facilisis porttitor nunc, eget congue arcu pharetra a. Nam mattis lacus sit amet felis suscipit hendrerit. Nulla interdum massa in tincidunt tincidunt. Sed ullamcorper sed mauris id accumsan. Pellentesque a iaculis neque. Quisque id augue sed turpis commodo luctus. In placerat neque vel justo scelerisque, nec facilisis diam scelerisque.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer lectus dui, dictum id scelerisque sed, maximus vel mi. In lectus tellus, tempor eget vehicula at, fringilla sit amet est. Mauris sagittis dolor pretium viverra rutrum. Sed congue pharetra facilisis. Morbi sem mi, ultricies varius massa et, accumsan sagittis orci. Etiam urna felis, pretium quis ultricies at, lacinia id ante. Donec ligula lacus, bibendum eu luctus quis, viverra ut odio. Maecenas lacus nunc, tempus et venenatis eget, porta sit amet nibh. Curabitur non scelerisque nisl. Donec facilisis porttitor nunc, eget congue arcu pharetra a. Nam mattis lacus sit amet felis suscipit hendrerit. Nulla interdum massa in tincidunt tincidunt. Sed ullamcorper sed mauris id accumsan. Pellentesque a iaculis neque. Quisque id augue sed turpis commodo luctus. In placerat neque vel justo scelerisque, nec facilisis diam scelerisque.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer lectus dui, dictum id scelerisque sed, maximus vel mi. In lectus tellus, tempor eget vehicula at, fringilla sit amet est. Mauris sagittis dolor pretium viverra rutrum. Sed congue pharetra facilisis. Morbi sem mi, ultricies varius massa et, accumsan sagittis orci. Etiam urna felis, pretium quis ultricies at, lacinia id ante. Donec ligula lacus, bibendum eu luctus quis, viverra ut odio. Maecenas lacus nunc, tempus et venenatis eget, porta sit amet nibh. Curabitur non scelerisque nisl. Donec facilisis porttitor nunc, eget congue arcu pharetra a. Nam mattis lacus sit amet felis suscipit hendrerit. Nulla interdum massa in tincidunt tincidunt. Sed ullamcorper sed mauris id accumsan. Pellentesque a iaculis neque. Quisque id augue sed turpis commodo luctus. In placerat neque vel justo scelerisque, nec facilisis diam scelerisque.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer lectus dui, dictum id scelerisque sed, maximus vel mi. In lectus tellus, tempor eget vehicula at, fringilla sit amet est. Mauris sagittis dolor pretium viverra rutrum. Sed congue pharetra facilisis. Morbi sem mi, ultricies varius massa et, accumsan sagittis orci. Etiam urna felis, pretium quis ultricies at, lacinia id ante. Donec ligula lacus, bibendum eu luctus quis, viverra ut odio. Maecenas lacus nunc, tempus et venenatis eget, porta sit amet nibh. Curabitur non scelerisque nisl. Donec facilisis porttitor nunc, eget congue arcu pharetra a. Nam mattis lacus sit amet felis suscipit hendrerit. Nulla interdum massa in tincidunt tincidunt. Sed ullamcorper sed mauris id accumsan. Pellentesque a iaculis neque. Quisque id augue sed turpis commodo luctus. In placerat neque vel justo scelerisque, nec facilisis diam scelerisque.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer lectus dui, dictum id scelerisque sed, maximus vel mi. In lectus tellus, tempor eget vehicula at, fringilla sit amet est. Mauris sagittis dolor pretium viverra rutrum. Sed congue pharetra facilisis. Morbi sem mi, ultricies varius massa et, accumsan sagittis orci. Etiam urna felis, pretium quis ultricies at, lacinia id ante. Donec ligula lacus, bibendum eu luctus quis, viverra ut odio. Maecenas lacus nunc, tempus et venenatis eget, porta sit amet nibh. Curabitur non scelerisque nisl. Donec facilisis porttitor nunc, eget congue arcu pharetra a. Nam mattis lacus sit amet felis suscipit hendrerit. Nulla interdum massa in tincidunt tincidunt. Sed ullamcorper sed mauris id accumsan. Pellentesque a iaculis neque. Quisque id augue sed turpis commodo luctus. In placerat neque vel justo scelerisque, nec facilisis diam scelerisque.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer lectus dui, dictum id scelerisque sed, maximus vel mi. In lectus tellus, tempor eget vehicula at, fringilla sit amet est. Mauris sagittis dolor pretium viverra rutrum. Sed congue pharetra facilisis. Morbi sem mi, ultricies varius massa et, accumsan sagittis orci. Etiam urna felis, pretium quis ultricies at, lacinia id ante. Donec ligula lacus, bibendum eu luctus quis, viverra ut odio. Maecenas lacus nunc, tempus et venenatis eget, porta sit amet nibh. Curabitur non scelerisque nisl. Donec facilisis porttitor nunc, eget congue arcu pharetra a. Nam mattis lacus sit amet felis suscipit hendrerit. Nulla interdum massa in tincidunt tincidunt. Sed ullamcorper sed mauris id accumsan. Pellentesque a iaculis neque. Quisque id augue sed turpis commodo luctus. In placerat neque vel justo scelerisque, nec facilisis diam scelerisque.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer lectus dui, dictum id scelerisque sed, maximus vel mi. In lectus tellus, tempor eget vehicula at, fringilla sit amet est. Mauris sagittis dolor pretium viverra rutrum. Sed congue pharetra facilisis. Morbi sem mi, ultricies varius massa et, accumsan sagittis orci. Etiam urna felis, pretium quis ultricies at, lacinia id ante. Donec ligula lacus, bibendum eu luctus quis, viverra ut odio. Maecenas lacus nunc, tempus et venenatis eget, porta sit amet nibh. Curabitur non scelerisque nisl. Donec facilisis porttitor nunc, eget congue arcu pharetra a. Nam mattis lacus sit amet felis suscipit hendrerit. Nulla interdum massa in tincidunt tincidunt. Sed ullamcorper sed mauris id accumsan. Pellentesque a iaculis neque. Quisque id augue sed turpis commodo luctus. In placerat neque vel justo scelerisque, nec facilisis diam scelerisque.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer lectus dui, dictum id scelerisque sed, maximus vel mi. In lectus tellus, tempor eget vehicula at, fringilla sit amet est. Mauris sagittis dolor pretium viverra rutrum. Sed congue pharetra facilisis. Morbi sem mi, ultricies varius massa et, accumsan sagittis orci. Etiam urna felis, pretium quis ultricies at, lacinia id ante. Donec ligula lacus, bibendum eu luctus quis, viverra ut odio. Maecenas lacus nunc, tempus et venenatis eget, porta sit amet nibh. Curabitur non scelerisque nisl. Donec facilisis porttitor nunc, eget congue arcu pharetra a. Nam mattis lacus sit amet felis suscipit hendrerit. Nulla interdum massa in tincidunt tincidunt. Sed ullamcorper sed mauris id accumsan. Pellentesque a iaculis neque. Quisque id augue sed turpis commodo luctus. In placerat neque vel justo scelerisque, nec facilisis diam scelerisque.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer lectus dui, dictum id scelerisque sed, maximus vel mi. In lectus tellus, tempor eget vehicula at, fringilla sit amet est. Mauris sagittis dolor pretium viverra rutrum. Sed congue pharetra facilisis. Morbi sem mi, ultricies varius massa et, accumsan sagittis orci. Etiam urna felis, pretium quis ultricies at, lacinia id ante. Donec ligula lacus, bibendum eu luctus quis, viverra ut odio. Maecenas lacus nunc, tempus et venenatis eget, porta sit amet nibh. Curabitur non scelerisque nisl. Donec facilisis porttitor nunc, eget congue arcu pharetra a. Nam mattis lacus sit amet felis suscipit hendrerit. Nulla interdum massa in tincidunt tincidunt. Sed ullamcorper sed mauris id accumsan. Pellentesque a iaculis neque. Quisque id augue sed turpis commodo luctus. In placerat neque vel justo scelerisque, nec facilisis diam scelerisque.",
        )
        newRecyclerView= findViewById(R.id.main_recyclerView)
        newRecyclerView.layoutManager= LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        getUserData()


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item, menu)
        val item = menu?.findItem(R.id.search_section)
        val cartBtn = menu?.findItem(R.id.cart_section)
        val btn = cartBtn?.actionView
        btn?.setOnClickListener {
            val cart_intent = Intent(this@MainActivity, CartActivity::class.java )
            startActivity(cart_intent)
        }
        val searchView = item?.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                TODO("Not yet implemented")
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                tempArrayList.clear()
                val searchText = newText!!.toLowerCase(Locale.getDefault())
                if(searchText.isNotEmpty()){
                    newArrayList.forEach{
                        if (it.heading.toLowerCase(Locale.getDefault()).contains(searchText)){
                            tempArrayList.add(it)
                        }
                    }
                    newRecyclerView.adapter!!.notifyDataSetChanged()
                }else{
                    tempArrayList.clear()
                    tempArrayList.addAll(newArrayList)
                    newRecyclerView.adapter!!.notifyDataSetChanged()
                }
                return false
            }
        })
        return super.onCreateOptionsMenu(menu)
    }

    private fun getUserData(){
        lateinit var item:Items
        for(i in imageId.indices){
            item= Items(titleImage = imageId[i], heading = heading[i], price = price[i], description = description[i])
            newArrayList.add(item)
        }
        tempArrayList.addAll(newArrayList)
        var adapter = MyAdapter(tempArrayList)
        newRecyclerView.adapter= adapter
        adapter.setOnClickListener(object: MyAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                val intent = Intent(this@MainActivity, DetailsActivity::class.java )
                intent.putExtra("heading", newArrayList[position].heading)
                intent.putExtra("imageId", newArrayList[position].titleImage)
                intent.putExtra("description", newArrayList[position].description)
                intent.putExtra("price", newArrayList[position].price)
                startActivity(intent)
            }
        })


    }
}