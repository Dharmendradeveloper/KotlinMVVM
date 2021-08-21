package com.assignmentwzd.fetchcoronadetails.data.retrofitapi

import com.assignmentwzd.fetchcoronadetails.data.ServiceUrl
import com.assignmentwzd.fetchcoronadetails.data.model.Country
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitAPIService {

    @GET("summary")
    fun fetchData(): Call<Country>

    companion object{
        operator fun invoke():RetrofitAPIService{
            return Retrofit.Builder()
                .baseUrl(ServiceUrl.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RetrofitAPIService::class.java)
        }

    }
}