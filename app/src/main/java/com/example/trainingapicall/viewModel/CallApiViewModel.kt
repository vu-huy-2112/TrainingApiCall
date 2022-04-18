package com.example.trainingapicall.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.trainingapicall.repository.Repository
import com.example.trainingapicall.model.User
import kotlinx.coroutines.launch
import retrofit2.Response

class CallApiViewModel(private val respons : Repository) : ViewModel() {
    val responsValue : MutableLiveData<Response<User>> = MutableLiveData()

    fun getUser(){
        viewModelScope.launch {
            responsValue.value = respons.getUser()
        }
    }
}