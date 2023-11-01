package com.example.hw3_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hw3_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var foodList : ArrayList<Food>
    private lateinit var foodAdapter : FoodAdapter
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        foodList = ArrayList()
        foodAdapter = FoodAdapter(foodList)
        foodListItems()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = foodAdapter
    }

    private fun foodListItems(){
        foodList.add(Food(R.drawable.pizza1,"Pepperoni"))
        foodList.add(Food(R.drawable.pizza2,"Firmennyi"))
        foodList.add(Food(R.drawable.pizza3,"Gripbnoi"))
        foodList.add(Food(R.drawable.noodles1,"makarowki"))
        foodList.add(Food(R.drawable.noodles2,"Domawnyi Noodles"))
        foodList.add(Food(R.drawable.paneer,"Mini Pizza"))
        foodList.add(Food(R.drawable.paste,"suwi"))
        foodList.add(Food(R.drawable.pizza_spagethi,"pizza_spagethi"))

//        foodList.add(Food(R.drawable.pizza1,"chicken Pizza"))
//        foodList.add(Food(R.drawable.pizza2,"Beef Chicken"))
//        foodList.add(Food(R.drawable.noodles1,"normal Pizza"))
//        foodList.add(Food(R.drawable.noodles2,"sweet Chicken"))
//        foodList.add(Food(R.drawable.paneer,"Mini Pizza"))
//        foodList.add(Food(R.drawable.pasta,"Extra Chicken"))
//        foodList.add(Food(R.drawable.pizza_spagethi,"meat Pizza"))
//        foodList.add(Food(R.drawable.pizza3,"vegez Chicken"))
    }
}