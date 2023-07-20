package com.kotlinseries.livedataapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityViewModelFactory(private val startingNum:Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainAvtivityViewModel::class.java)){
            return MainAvtivityViewModel(startingNum)as T

        }
        throw IllegalArgumentException("Un Known view model class")
    }

}