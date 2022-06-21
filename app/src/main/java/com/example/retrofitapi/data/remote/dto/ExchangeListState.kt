package com.example.retrofitapi.data.remote.dto

data class ExchangeListState(
    val isLoading : Boolean = false,
    val exchange : List<Exchange> = emptyList(),
    val error : String = ""
)