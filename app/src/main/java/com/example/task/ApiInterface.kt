package com.example.task

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("rest/V1/productdetails/6701/253620?lang=en&store=KWD")
    fun getData(): Call<Data>
}