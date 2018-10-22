package com.richardharrah.mvrxdagger.data.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Geo(
    val lat: String,
    val lng: String
)