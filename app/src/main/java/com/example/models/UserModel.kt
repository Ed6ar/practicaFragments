package com.example.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserModel : ViewModel() {
    val name: MutableLiveData<String> by lazy {
        MutableLiveData<String>("Dato pregrabado")
    }

    fun updateName(name: String) {
        this.name.value = name
    }

    val lastname: MutableLiveData<String> by lazy {
        MutableLiveData<String>("Mayen")
    }
    val city: MutableLiveData<String> by lazy {
        MutableLiveData<String>("My hard <3")
    }

}