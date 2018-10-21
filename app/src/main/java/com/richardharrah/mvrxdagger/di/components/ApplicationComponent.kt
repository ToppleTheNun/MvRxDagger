package com.richardharrah.mvrxdagger.di.components

import com.richardharrah.mvrxdagger.MvRxDaggerApplication
import com.richardharrah.mvrxdagger.di.modules.NetworkingModule
import com.richardharrah.mvrxdagger.di.modules.BaseModule
import com.squareup.moshi.Moshi
import dagger.Component
import retrofit2.Retrofit
import timber.log.Timber
import javax.inject.Singleton

@Component(
    modules = [
        NetworkingModule::class,
        BaseModule::class
    ]
)
@Singleton
interface ApplicationComponent {
    fun inject(application: MvRxDaggerApplication)

    fun moshi(): Moshi
    fun retrofit(): Retrofit
    fun timberTree(): Timber.Tree
}