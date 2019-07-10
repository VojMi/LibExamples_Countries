package com.example.countries.model

import com.example.countries.DepInject.DaggerAPIComponent
import io.reactivex.Single
import javax.inject.Inject

class CountriesService {
    @Inject
    lateinit var api: CountriesAPI
    init {
        //  Last step of the Dagger dependency injection
        DaggerAPIComponent.create().inject(this)
    }

    fun getCountries(): Single<List<Country>> {
        return api.getCountries()
    }
}