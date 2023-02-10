package com.example.test.domain.models

data class Hero(
    val comics: Acting<NormalItem>?,
    val description: String?,
    val events: Acting<NormalItem>?,
    val id: Int?,
    val modified: String?,
    val name: String?,
    val resourceURI: String?,
    val series: Acting<NormalItem>?,
    val stories: Acting<StoriesItem>?,
    val thumbnail: Thumbnail?,
    val urls: List<Url>?
)