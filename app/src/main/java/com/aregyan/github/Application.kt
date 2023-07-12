package com.aregyan.github

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class Application : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        var context: Context? = null
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}