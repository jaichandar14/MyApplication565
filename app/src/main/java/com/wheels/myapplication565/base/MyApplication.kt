package com.wheels.myapplication565.base

import android.app.Application
import com.wheels.myapplication565.di.retrofit.ApplicationComponent
import com.wheels.myapplication565.di.retrofit.DaggerApplicationComponent


class MyApplication:Application() {
    companion object {
        lateinit var appContext: MyApplication
    lateinit var appComponent: ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()
      appComponent=DaggerApplicationComponent.builder().build()
    }
}