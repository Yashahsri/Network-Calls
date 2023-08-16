package com.example.networkcalls

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface GetQuotesAPI {
    @GET("/quotes")
     fun getQuotes(): Call<QuoteList>
}