package com.example.practice.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class viewmodelmainActivity(private var value:Int):ViewModel() {

   var total:MutableLiveData<Int> = MutableLiveData()
    init {
        total.value=value
    }


    fun setcurrentvalue(input:Int){

        total.value = total.value?.plus(input)
    }

}