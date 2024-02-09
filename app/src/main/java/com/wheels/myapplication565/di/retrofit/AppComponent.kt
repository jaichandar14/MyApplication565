package com.wheels.myapplication565.di.retrofit

import com.wheels.myapplication565.ui.MainActivity
import dagger.Component

import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    fun inject(activity:MainActivity)

}