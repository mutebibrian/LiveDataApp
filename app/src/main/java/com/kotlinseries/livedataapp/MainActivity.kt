package com.kotlinseries.livedataapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.kotlinseries.livedataapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //start making our variables
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainAvtivityViewModel
    lateinit var viewModelFactory: MainActivityViewModelFactory
    //These are the three instances that binding the view model
    // and the view model factors that we've learned
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //setContentView(R.layout.activity_main)
        //initializing variables
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(startingNum = 100)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainAvtivityViewModel::class.java)

        //observing for any data change
        viewModel.totalSum.observe(this,{binding.tvshow.text = it.toString()})

        binding.button.setOnClickListener {
            viewModel.sumUp(binding.etscore.text.toString().toInt())
        }



    }
}