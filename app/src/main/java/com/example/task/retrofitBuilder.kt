package com.example.task

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object retrofitBuilder {

  val baseUrl = "https://klinq.com/"
    fun getInstance():Retrofit{
      return  Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).build()
    }

}