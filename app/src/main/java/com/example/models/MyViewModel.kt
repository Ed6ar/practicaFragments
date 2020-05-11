package com.example.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    val userName: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    init {
        userName.value = "Juan"
    }

    fun getUserName(): LiveData<String>{
        return userName
    }

    fun updateUser(name: String){
        userName.value = name
    }

}