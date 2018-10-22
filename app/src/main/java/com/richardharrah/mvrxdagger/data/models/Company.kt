package com.richardharrah.mvrxdagger.data.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Company(
    val name: String,
    val catchPhrase: String,
    val bs: String
)
