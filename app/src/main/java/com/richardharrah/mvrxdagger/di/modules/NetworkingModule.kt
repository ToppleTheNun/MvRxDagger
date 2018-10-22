package com.richardharrah.mvrxdagger.di.modules

import androidx.annotation.NonNull
import com.richardharrah.mvrxdagger.data.PlaceholderApi
import dagger.Module
import dagger.Provides
import dagger.Reusable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import timber.log.Timber
import javax.inject.Singleton

@Module
object NetworkingModule {
    @JvmStatic
    @NonNull
    @Provides
    @Singleton
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
        val interceptor = HttpLoggingInterceptor {
            Timber.tag("OkHttps").d(it)
        }
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

    @JvmStatic
    @NonNull
    @Provides
    @Singleton
    fun provideOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()

    @JvmStatic
    @NonNull
    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://jsonplaceholder.typicode.com")
            .client(okHttpClient)
            .build()

    @JvmStatic
    @NonNull
    @Provides
    @Reusable
    fun providePlaceholderApi(retrofit: Retrofit): PlaceholderApi =
            retrofit.create(PlaceholderApi::class.java)
}