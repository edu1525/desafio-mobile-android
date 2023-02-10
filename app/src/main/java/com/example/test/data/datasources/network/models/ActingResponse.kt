package com.example.test.data.datasources.network.models

import com.squareup.moshi.Json

data class ActingResponse<T : ItemResponse>(
    @Json(name = "available")
    val available: Int?,
    @Json(name = "collectionURI")
    val collectionURI: String?,
    @Json(name = "items")
    val items: List<T>?,
    @Json(name = "returned")
    val returned: Int?
)