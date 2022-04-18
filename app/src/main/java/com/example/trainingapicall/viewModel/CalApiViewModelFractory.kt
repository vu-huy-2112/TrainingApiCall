package com.example.trainingapicall.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.trainingapicall.Repository

class CalApiViewModelFractory(private val repository : Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CallApiViewModel(repository) as T
    }
}