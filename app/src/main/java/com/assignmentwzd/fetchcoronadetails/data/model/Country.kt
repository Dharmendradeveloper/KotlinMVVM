package com.assignmentwzd.fetchcoronadetails.data.model

import com.assignmentwzd.fetchcoronadetails.data.Premium

data class Country( val Countries:List<Country>,
    val Country: String,
    val CountryCode: String,
    val Date: String,
    val ID: String,
    val NewConfirmed: Int,
    val NewDeaths: Int,
    val NewRecovered: Int,
    val Premium: Premium,
    val Slug: String,
    val TotalConfirmed: Int,
    val TotalDeaths: Int,
    val TotalRecovered: Int
)