package com.example.test.data.datasources.network.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DataResponse(
    @Json(name = "count")
    val count: Int?,
    @Json(name = "limit")
    val limit: Int?,
    @Json(name = "offset")
    val offset: Int?,
    @Json(name = "results")
    val heroes: List<HeroResponse>?,
    @Json(name = "total")
    val total: Int?
)