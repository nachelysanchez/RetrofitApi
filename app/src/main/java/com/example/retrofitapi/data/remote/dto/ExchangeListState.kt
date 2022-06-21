package com.example.retrofitapi.data.remote.dto

data class ExchangeListState (
        val isLoading : Boolean = false,
        val exchanges : List<Exchanges> = emptyList(),
        val error : String = ""
)