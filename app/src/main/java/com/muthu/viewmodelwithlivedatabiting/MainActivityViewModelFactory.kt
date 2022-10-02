package com.muthu.viewmodelwithlivedatabiting

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityViewModelFactory(private val int: Int) :ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return  MainActivityViewModel(int) as T
        }
        throw IllegalArgumentException("Unable to find the ViewModel")
    }


}