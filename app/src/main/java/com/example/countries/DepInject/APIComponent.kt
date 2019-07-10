package com.example.countries.DepInject

import com.example.countries.model.CountriesService
import com.example.countries.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [APIModule::class])
interface APIComponent {
    // According to available parameters, appropriate injection is applied
    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)
}