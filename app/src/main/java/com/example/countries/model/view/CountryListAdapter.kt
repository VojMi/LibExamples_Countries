package com.example.countries.model.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.countries.R
import com.example.countries.model.model.Country
import com.example.countries.model.util.loadImage
import kotlinx.android.synthetic.main.item_country.view.*
import com.example.countries.model.util.getProgressDrawable as getProgressDrawable1

class CountryListAdapter(var countries: ArrayList<Country>) :
    RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>() {
    fun updateCountries(newCountries: List<Country>) {
        countries.clear()
        countries.addAll(newCountries)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = CountryViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
    )


    override fun getItemCount() = countries.size

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countries[position])
    }

    class CountryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imageView = view.image_view
        private val countryCapital = view.capital
        private val countryName = view.country_name
        private val progressDrawable = getProgressDrawable1(view.context)
        fun bind(country: Country) {
            countryName.text = country.countryName
            countryCapital.text = country.capital
            imageView.loadImage(country.flag, progressDrawable)
        }
    }
}