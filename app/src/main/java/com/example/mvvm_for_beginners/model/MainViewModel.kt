package com.example.mvvm_for_beginners.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm_for_beginners.data.User

class MainViewModel : ViewModel() {
    private val userLiveData = MutableLiveData<List<User>>()
    private var userList : MutableList<User> = mutableListOf()

    init {
        populateList()
    }

    private fun populateList(){

        userList = mutableListOf(
            User("Rustam","Email"),
            User("Rustam","Email"),
            User("Rustam","Email"),
            User("Rustam","Email"),
            User("Rustam","Email"),
            User("Rustam","Email")
        )

        userLiveData.value = userList
    }

    fun getMutableLiveData() : MutableLiveData<List<User>>{
        return userLiveData
    }
}