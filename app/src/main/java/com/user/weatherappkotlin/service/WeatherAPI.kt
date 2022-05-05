package com.user.weatherappkotlin.service

import com.user.weatherappkotlin.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

//https://api.openweathermap.org/data/2.5/weather?q=malatya&APPID=f88babcce41a4fa00bccef195bc4bf91
interface WeatherAPI {

    @GET("data/2.5/weather&units=metric&APPID=f88babcce41a4fa00bccef195bc4bf91")
    fun getData(
        @Query("q") cityName:String
    ):Single<WeatherModel>
}