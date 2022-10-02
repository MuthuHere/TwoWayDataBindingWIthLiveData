package com.muthu.viewmodelwithlivedatabiting

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(initialValue: Int) : ViewModel() {

    private val countLiveData = MutableLiveData<Int>()

    val countLive: LiveData<Int> get() = countLiveData
    val strNUmber = MutableLiveData<String>()


    init {
        this.countLiveData.value = initialValue
    }

    fun increment() {

        this.countLiveData.value = (this.countLiveData.value)?.plus(strNUmber.value.toString().toInt())
    }
}