package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.practice.databinding.ActivityMainBinding
import com.example.practice.factory.viewmodelmainActivityfactory
import com.example.practice.viewmodel.viewmodelmainActivity
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var view:viewmodelmainActivity
    lateinit var factory:viewmodelmainActivityfactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        factory = viewmodelmainActivityfactory(125)
        view = ViewModelProvider(this,factory)[viewmodelmainActivity::class.java]
        //binding.textView.text= view.getcurrentvalue().toString()
        binding.myviewmodel = view
        binding.lifecycleOwner = this

        view.total.observe(this, Observer {
            binding.textView.text=it.toString()
        })

        binding.btn.setOnClickListener {
            view.setcurrentvalue(binding.editTextno.text.toString().toInt())
           // binding.textView.text= view.getcurrentvalue().toString()
        }


    }
}