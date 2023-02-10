package com.example.core.base

import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
abstract class UseCaseWithParams<Request, Response> {
    protected abstract fun performAction(requestData: Request): Response
}