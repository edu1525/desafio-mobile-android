package com.example.test.domain.models

abstract class Item {
    abstract val name: String?
    abstract val resourceURI: String?
}

data class NormalItem(
    override val name: String?,
    override val resourceURI: String?
) : Item()

data class StoriesItem(
    override val name: String?,
    override val resourceURI: String?,
    val type: String?
) : Item()