package com.richardharrah.mvrxdagger

import android.app.Application
import com.richardharrah.mvrxdagger.di.components.DaggerApplicationComponent
import timber.log.Timber
import javax.inject.Inject

class MvRxDaggerApplication : Application() {

    @Inject
    lateinit var timberTree: Timber.Tree

    override fun onCreate() {
        super.onCreate()

        DaggerApplicationComponent.builder().build().inject(this)

        Timber.plant(timberTree)

        Timber.d("#onCreate(%s : %d)", BuildConfig.VERSION_NAME, BuildConfig.VERSION_CODE)
    }
}