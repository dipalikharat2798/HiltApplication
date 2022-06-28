package com.androdevdk.hiltapplication

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class HiltApplication : Application() {
//    @Inject
//    lateinit var repo: UserRepo

    override fun onCreate() {
        super.onCreate()
        //repo.send()
    }
}