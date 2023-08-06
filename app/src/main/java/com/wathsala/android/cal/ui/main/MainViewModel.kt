package com.wathsala.android.cal.ui.main

import android.util.Log
import android.util.MutableDouble
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    var result=MutableLiveData<Double>(0.0)

    fun add(number1:Double,number2:Double){
        result.value= number1.plus(number2)
        Log.d("Add Result",result.value.toString())
    }

    fun min(number1:Double,number2:Double){
        result.value= number1.minus(number2)
        Log.d("Add Result",result.value.toString())
    }

    fun multiply(number1:Double,number2:Double){
        result.value= number1*number2
        Log.d("Add Result",result.value.toString())
    }

    fun divide(number1:Double,number2:Double){
        result.value= number1/number2
        Log.d("Add Result",result.value.toString())
    }

//    fun addAntiFunction(number1: Double,number2: Double): Double {
//        return number1.plus(number2)
//    }
}