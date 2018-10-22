package com.richardharrah.mvrxdagger.data.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Todo(
    val id: Int,
    val userId: Int,
    val title: String,
    val completed: Boolean
)