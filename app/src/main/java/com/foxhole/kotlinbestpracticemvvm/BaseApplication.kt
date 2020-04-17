package com.foxhole.kotlinbestpracticemvvm

import android.app.Application
import com.foxhole.kotlinbestpracticemvvm.di.AppComponent
import com.foxhole.kotlinbestpracticemvvm.di.AppModule
import com.foxhole.kotlinbestpracticemvvm.di.DaggerAppComponent

class BaseApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        this.appComponent = this.initDagger()
    }

    private fun initDagger() = DaggerAppComponent.builder()
        .appModule(AppModule(this))
        .build()
}