package com.example.epoxypractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.epoxypractice.databinding.ActivityMainBinding
import com.example.epoxypractice.viewmodels.SingleFoodController

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    private val singleFoodController: SingleFoodController by lazy {
        SingleFoodController()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        initRecyclerView()

        singleFoodController.requestModelBuild()
    }

    private fun initRecyclerView() {
        binding?.foodRv?.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            this.adapter = singleFoodController.adapter
        }
    }
}
