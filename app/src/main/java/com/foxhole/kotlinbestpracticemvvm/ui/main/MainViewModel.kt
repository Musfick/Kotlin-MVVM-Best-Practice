package com.foxhole.kotlinbestpracticemvvm.ui.main

import android.util.Log
import com.foxhole.kotlinbestpracticemvvm.base.BaseViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor() : BaseViewModel() {

    companion object {
         const val TAG  = "MainViewModel"
    }

    init {
        Log.d(TAG, "ViewModel Created...")
    }

    override fun onCleared() {
        super.onCleared()

        Log.d(TAG, "ViewModel Cleared...")
    }

}