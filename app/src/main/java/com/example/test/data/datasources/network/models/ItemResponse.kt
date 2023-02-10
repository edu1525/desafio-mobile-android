package com.example.test.data.datasources.network.models

import com.squareup.moshi.Json

abstract class ItemResponse {
    abstract val name: String?
    abstract val resourceURI: String?
}

data class NormalItemResponse(
    @Json(name = "name")
    override val name: String?,
    @Json(name = "resourceURI")
    override val resourceURI: String?
) : ItemResponse()

data class StoriesItemResponse(
    @Json(name = "name")
    override val name: String?,
    @Json(name = "resourceURI")
    override val resourceURI: String?,
    @Json(name = "type")
    val type: String?
) : ItemResponse()