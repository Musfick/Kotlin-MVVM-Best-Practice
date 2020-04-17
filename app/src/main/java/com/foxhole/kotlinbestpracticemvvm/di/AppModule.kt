package com.foxhole.kotlinbestpracticemvvm.di

import android.app.Application
import com.foxhole.kotlinbestpracticemvvm.AppLogger
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class AppModule(private val application: Application) {

    @AppScope
    @Provides
    @Named("app_scope")
    fun provideLogger() : AppLogger {
        return AppLogger()
    }
}