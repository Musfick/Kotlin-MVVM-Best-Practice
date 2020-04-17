package com.foxhole.kotlinbestpracticemvvm.ui.second

import android.util.Log
import com.foxhole.kotlinbestpracticemvvm.base.BaseViewModel
import javax.inject.Inject

/**
 * Created by Musfick Jamil on 4/17/2020$.
 */

class SecondViewModel @Inject constructor() : BaseViewModel() {

    companion object {
        const val TAG = "SecondViewModel"
    }

    init {
        Log.d(TAG, "SecondViewModel Created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "SecondViewModel Cleared")
    }
}