package com.example.test.data.datasources.network.models

import com.squareup.moshi.Json

data class ThumbnailResponse(
    @Json(name = "extension")
    val extension: String?,
    @Json(name = "path")
    val path: String?
)