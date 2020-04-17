package com.foxhole.kotlinbestpracticemvvm.di.second

import com.foxhole.kotlinbestpracticemvvm.AppLogger
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by Musfick Jamil on 4/17/2020$.
 */
@Module
class SecondModule() {

    @SecondScope
    @Provides
    @Named("second_scope")
    fun provideLogger() : AppLogger {
        return AppLogger()
    }

}