package com.assignmentwzd.fetchcoronadetails.data.model

data class CoronaUpdates(
    val Countries: List<Country>,
    val Date: String,
    val Global: Global,
    val ID: String,
    val Message: String
)