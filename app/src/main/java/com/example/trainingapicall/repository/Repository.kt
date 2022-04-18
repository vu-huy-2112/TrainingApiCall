package com.example.trainingapicall.repository

import com.example.trainingapicall.model.User
import retrofit2.Response

class Repository {
    suspend fun getUser() : Response<User>{
        return RetrofitInstance.apiWeb.getUser()
    }
}