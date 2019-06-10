package com.example.countries.model.model

import io.reactivex.Single
import retrofit2.http.GET

interface CountriesAPI {
    @GET("DevTides/countries/master/countriesV2.json")
    fun getCountries(): Single<List<Country>>

    @GET("endpoint2")
    fun getEndpoint2Data()
}