package com.example.trainingapicall.repository

import com.example.trainingapicall.CmmVariable.Companion.BASE_URL
import com.example.trainingapicall.api.APIWeb
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiWeb : APIWeb by lazy {
        retrofit.create(APIWeb::class.java)
    }

}