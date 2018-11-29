package com.example.common.coroutines

import kotlin.coroutines.experimental.CoroutineContext

/**
 * Created by Festus Kiambi on 11/29/18.
 */

interface  ICoroutineDispatcherProvider {

    fun provideUiContext(): CoroutineContext

    fun provideBackgroundContext(): CoroutineContext
}