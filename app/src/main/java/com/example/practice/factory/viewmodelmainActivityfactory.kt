package com.example.practice.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.practice.viewmodel.viewmodelmainActivity

class viewmodelmainActivityfactory(private val input:Int): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(viewmodelmainActivity::class.java)){
            return viewmodelmainActivity(input) as T
        }
        throw IllegalArgumentException("Unknown class")
    }




}