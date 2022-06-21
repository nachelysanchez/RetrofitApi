package com.example.retrofitapi.data.repositorios

import com.example.retrofitapi.data.remote.dto.Exchange
import com.example.retrofitapi.data.remote.dto.ExchangeApi
import com.example.retrofitapi.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ExchangeRepository @Inject constructor(
    private val api: ExchangeApi
){

    fun getExchanges(): Flow<Resource<List<Exchange>>> = flow {
        try {
            emit(Resource.Loading()) //indicar que estamos cargando

            val exchange = api.getExchanges() //descarga las monedas de internet, se supone quedemora algo

            emit(Resource.Success(exchange)) //indicar que se cargo correctamente y pasarle las monedas
        } catch (e: HttpException) {
            //error general HTTP
            emit(Resource.Error(e.message ?: "Error HTTP GENERAL"))
        } catch (e: IOException) {
            //debe verificar tu conexion a internet
            emit(Resource.Error(e.message ?: "verificar tu conexion a internet"))
        }
    }
}