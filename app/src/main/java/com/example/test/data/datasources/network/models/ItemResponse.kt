package com.example.test.data.datasources.network.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

abstract class ItemResponse {
    abstract val name: String?
    abstract val resourceURI: String?
}

@JsonClass(generateAdapter = true)
data class NormalItemResponse(
    @Json(name = "name")
    override val name: String?,
    @Json(name = "resourceURI")
    override val resourceURI: String?
) : ItemResponse()

@JsonClass(generateAdapter = true)
data class StoriesItemResponse(
    @Json(name = "name")
    override val name: String?,
    @Json(name = "resourceURI")
    override val resourceURI: String?,
    @Json(name = "type")
    val type: String?
) : ItemResponse()