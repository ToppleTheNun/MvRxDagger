package com.richardharrah.mvrxdagger.data.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class User(
    val id: Int,
    val name: String,
    val username: String,
    val address: Address,
    val phone: String,
    val website: String,
    val company: Company
)