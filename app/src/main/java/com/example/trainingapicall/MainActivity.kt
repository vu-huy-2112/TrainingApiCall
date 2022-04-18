package com.example.trainingapicall

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.trainingapicall.repository.Repository
import com.example.trainingapicall.viewModel.CalApiViewModelFractory
import com.example.trainingapicall.viewModel.CallApiViewModel

class MainActivity :  AppCompatActivity(){

    private lateinit var viewModel : CallApiViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vmFractory = CalApiViewModelFractory(Repository())
        viewModel = ViewModelProvider(this, vmFractory)
            .get(CallApiViewModel::class.java)

        viewModel.getUser()
        viewModel.responsValue.observe(this, { res ->
            if (res.isSuccessful) {
                val resulString = res.body().toString()
                Log.d("TAG",resulString)
                Toast.makeText(this, resulString,Toast.LENGTH_LONG).show()
            } else {

            }
        })
    }
}