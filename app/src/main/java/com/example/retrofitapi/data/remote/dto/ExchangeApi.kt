package com.example.retrofitapi.data.remote.dto

import retrofit2.http.GET
import retrofit2.http.Path

interface ExchangeApi {
    @GET("/v1/exchanges")
    suspend fun getExchanges(): List<Exchanges>

    @GET("/v1/exchanges/{exchange_id}")
    suspend fun getCoin(@Path("exchangeId") exchangeId: String): Exchanges
}