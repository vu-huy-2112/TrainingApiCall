package com.example.trainingapicall.api

import com.example.trainingapicall.model.User
import retrofit2.Response
import retrofit2.http.GET

interface APIWeb {

    @GET("/posts/1")
    suspend fun getUser() : Response<User>
}