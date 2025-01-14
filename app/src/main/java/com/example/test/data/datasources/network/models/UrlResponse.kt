package com.example.test.data.datasources.network.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UrlResponse(
    @Json(name = "type")
    val type: String?,
    @Json(name = "url")
    val url: String?
)