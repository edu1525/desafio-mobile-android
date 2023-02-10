package com.example.test.domain.models

data class Acting<T: Item>(
    val available: Int?,
    val collectionURI: String?,
    val items: List<T>?,
    val returned: Int?
)
