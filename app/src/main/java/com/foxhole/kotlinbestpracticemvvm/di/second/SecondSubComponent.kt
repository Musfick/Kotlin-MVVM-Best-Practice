package com.foxhole.kotlinbestpracticemvvm.di.second

import com.foxhole.kotlinbestpracticemvvm.di.ViewModelFactoryModule
import com.foxhole.kotlinbestpracticemvvm.ui.second.SecondActivity
import dagger.Subcomponent

/**
 * Created by Musfick Jamil on 4/17/2020$.
 */
@SecondScope
@Subcomponent(
    modules = [
        SecondModule::class,
        ViewModelFactoryModule::class,
        SecondViewModelModule::class
    ]
)
interface SecondSubComponent {
    fun inject(secondActivity: SecondActivity)
}