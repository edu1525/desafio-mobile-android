package com.example.test.data.datasources.network.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class HeroResponse(
    @Json(name = "comics")
    val comics: ActingResponse<NormalItemResponse>?,
    @Json(name = "description")
    val description: String?,
    @Json(name = "events")
    val events: ActingResponse<NormalItemResponse>?,
    @Json(name = "id")
    val id: Int?,
    @Json(name = "modified")
    val modified: String?,
    @Json(name = "name")
    val name: String?,
    @Json(name = "resourceURI")
    val resourceURI: String?,
    @Json(name = "series")
    val series: ActingResponse<NormalItemResponse>?,
    @Json(name = "stories")
    val stories: ActingResponse<StoriesItemResponse>?,
    @Json(name = "thumbnail")
    val thumbnail: ThumbnailResponse?,
    @Json(name = "urls")
    val urls: List<UrlResponse>?
)