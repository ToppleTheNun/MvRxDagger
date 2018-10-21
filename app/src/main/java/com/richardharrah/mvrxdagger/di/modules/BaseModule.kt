package com.richardharrah.mvrxdagger.di.modules

import androidx.annotation.NonNull
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import timber.log.Timber
import javax.inject.Singleton

@Module
object BaseModule {
    @JvmStatic
    @Provides
    @NonNull
    @Singleton
    fun provideMoshi(): Moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    @JvmStatic
    @Provides
    @NonNull
    @Singleton
    fun provideTimberTree(): Timber.Tree = Timber.DebugTree()
}