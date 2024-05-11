package com.datamatrix.doglist

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

//crea el metodo por el que se accede a la API - Servicio
interface APIService {
    @GET
    suspend fun getDogsByBreeds(@Url url: String): Response<DogsResponse>
}