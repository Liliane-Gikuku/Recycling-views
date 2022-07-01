package com.liliane.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.liliane.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_main)
        displayNames()
    }

    fun displayNames(){
        val namesList=listOf("Feyi","Roique")
        binding.rvNames.layoutManager=LinearLayoutManager(this)
        val namesAdapter=NamesRecyclerViewAdapter(namesList)
        binding.rvNames.adapter=namesAdapter
    }
}