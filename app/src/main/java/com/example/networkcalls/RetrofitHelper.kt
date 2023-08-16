package com.example.networkcalls

import com.google.gson.Gson
import okio.GzipSource
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    val baseURL = "https://quotable.io"

   fun  getinstance(): Retrofit {
       return Retrofit.Builder().baseUrl(baseURL).
           addConverterFactory(GsonConverterFactory.create()).build()
   }
}