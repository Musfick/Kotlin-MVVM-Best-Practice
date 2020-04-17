package com.foxhole.kotlinbestpracticemvvm.di.main

import com.foxhole.kotlinbestpracticemvvm.di.ViewModelFactoryModule
import com.foxhole.kotlinbestpracticemvvm.ui.main.MainActivity
import dagger.Subcomponent

@MainScope
@Subcomponent(
    modules = [
        MainModule::class,
        MainViewModelModule::class,
        ViewModelFactoryModule::class
    ]
)
interface MainSubComponent {
    fun inject(mainActivity: MainActivity)
}