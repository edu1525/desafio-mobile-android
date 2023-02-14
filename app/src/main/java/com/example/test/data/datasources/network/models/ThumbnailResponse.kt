package com.example.test.data.datasources.network.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ThumbnailResponse(
    @Json(name = "extension")
    val extension: String?,
    @Json(name = "path")
    val path: String?
)