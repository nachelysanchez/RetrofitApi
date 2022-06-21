package com.example.retrofitapi.data.remote.dto

import retrofit2.http.GET
import retrofit2.http.Path

interface ExchangeApi {
    @GET("/v1/exchanges")
    suspend fun getExchanges(): List<Exchange>

    @GET("/v1/exchanges/{exchangeId}")
    suspend fun getExchanges(@Path("exchangeId") exchangeId: String): Exchange
}