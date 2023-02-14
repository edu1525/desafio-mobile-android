package com.example.test.data.datasources.network

import com.example.test.data.datasources.network.models.*

class MarvelMockApi : MarvelApi {
    override suspend fun getCharacters(
        offset: Int,
        limit: Int,
        orderBy: String
    ) = MarvelHeroesResponse(
        attributionHTML = "",
        attributionText = "",
        code = 200,
        copyright = "",
        data = DataResponse(
            count = 10,
            limit = 10,
            offset = 10,
            heroes = arrayListOf(
                HeroResponse(
                    comics = ActingResponse(
                        available = 0,
                        collectionURI = "",
                        items = arrayListOf(
                            NormalItemResponse(
                                name = "",
                                resourceURI = ""
                            )
                        ),
                        returned = 0
                    ),
                    description = "",
                    events = ActingResponse(
                        available = 0,
                        collectionURI = "",
                        items = arrayListOf(
                            NormalItemResponse(
                                name = "",
                                resourceURI = ""
                            )
                        ),
                        returned = 0
                    ),
                    id = 1,
                    modified = "",
                    name = "",
                    resourceURI = "",
                    series = ActingResponse(
                        available = 0,
                        collectionURI = "",
                        items = arrayListOf(
                            NormalItemResponse(
                                name = "",
                                resourceURI = ""
                            )
                        ),
                        returned = 0
                    ),
                    stories = ActingResponse(
                        available = 0,
                        collectionURI = "",
                        items = arrayListOf(
                            StoriesItemResponse(
                                name = "",
                                resourceURI = "",
                                type = ""
                            )
                        ),
                        returned = 0
                    ),
                    thumbnail = ThumbnailResponse(
                        extension = "",
                        path = ""
                    ),
                    urls = arrayListOf(
                        UrlResponse(
                            type = "",
                            url = ""
                        )
                    )
                )
            ),
            total = 10
        ),
        etag = "",
        status = ""
    )
}