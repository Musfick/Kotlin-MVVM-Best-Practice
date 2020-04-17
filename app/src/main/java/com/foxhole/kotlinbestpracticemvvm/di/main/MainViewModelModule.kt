package com.foxhole.kotlinbestpracticemvvm.di.main

import androidx.lifecycle.ViewModel
import com.foxhole.kotlinbestpracticemvvm.ui.main.MainViewModel
import com.foxhole.kotlinbestpracticemvvm.viewmodelfactory.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun bindMainViewModel(mainViewModel: MainViewModel) : ViewModel
}