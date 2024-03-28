package tn.ksoftwares.example.news

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NewsApplication : Application() {

    companion object {
        const val TAG = "NewsApplication"
    }

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "Application has been created.")
    }
}