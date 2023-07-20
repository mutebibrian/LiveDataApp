package com.kotlinseries.livedataapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainAvtivityViewModel(startingNo:Int):ViewModel() {
    private val total = MutableLiveData<Int>()//There are a lot of important things that live data provide us with, so this is how we store our total in a live data variable.
    //What does this code means,Live data is a data holder class that follows observer pattern.
    //It holds primitives and collection types and notifies its observers when the data has changed.
    //The UI components of that live data observes relevant data and immutable
// live data is a part of live data.
    val totalSum:LiveData<Int>
            get()=total //using the get method I'm starting the mutable live data
    // inside the live data by using the get method in order to get the total without changing it And because we're going to use the private.
    //Modifier..
    init {
        total.value =startingNo
    }

    fun sumUp(input:Int){
        total.value=(total.value)?.plus(input)
    }

}