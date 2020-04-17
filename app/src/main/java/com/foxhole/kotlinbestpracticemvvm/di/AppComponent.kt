package com.foxhole.kotlinbestpracticemvvm.di

import com.foxhole.kotlinbestpracticemvvm.base.BaseActivity
import com.foxhole.kotlinbestpracticemvvm.di.main.MainSubComponent
import com.foxhole.kotlinbestpracticemvvm.di.second.SecondSubComponent
import dagger.Component

@AppScope
@Component(
    modules = [
    AppModule::class
    ]
)
interface AppComponent {
    fun newMainSubComponent() : MainSubComponent
    fun newSecondSubComponent() : SecondSubComponent
}