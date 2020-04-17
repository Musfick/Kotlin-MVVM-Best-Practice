package com.foxhole.kotlinbestpracticemvvm.di.second

import androidx.lifecycle.ViewModel
import com.foxhole.kotlinbestpracticemvvm.ui.second.SecondViewModel
import com.foxhole.kotlinbestpracticemvvm.viewmodelfactory.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by Musfick Jamil on 4/17/2020$.
 */

@Module
abstract class SecondViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(SecondViewModel::class)
    internal abstract fun bindSecondViewModule(secondViewModel: SecondViewModel) : ViewModel
}