package com.example.test.core

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow

@ExperimentalCoroutinesApi
abstract class UseCase<Request, Response> {
    protected abstract fun performAction(requestData: Request?): Flow<Response>
}