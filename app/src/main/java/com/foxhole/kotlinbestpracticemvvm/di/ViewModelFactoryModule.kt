package com.foxhole.kotlinbestpracticemvvm.di

import androidx.lifecycle.ViewModelProvider
import com.foxhole.kotlinbestpracticemvvm.viewmodelfactory.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory) : ViewModelProvider.Factory
}