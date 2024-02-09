package com.wheels.myapplication565.base.data

import android.util.Log
import retrofit2.Response
import javax.inject.Inject

class RepositoryImpl @Inject constructor(var apiServices: ApiServices) {

    suspend fun getcountries(){
        apiServices.getCountries().body()
    }


}