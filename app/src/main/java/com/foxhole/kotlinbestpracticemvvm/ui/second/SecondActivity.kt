package com.foxhole.kotlinbestpracticemvvm.ui.second

import android.os.Bundle
import android.util.Log
import com.foxhole.kotlinbestpracticemvvm.BaseApplication
import com.foxhole.kotlinbestpracticemvvm.R
import com.foxhole.kotlinbestpracticemvvm.base.BaseActivity
import com.foxhole.kotlinbestpracticemvvm.AppLogger
import kotlinx.android.synthetic.main.activity_second.*
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by Musfick Jamil on 4/17/2020$.
 */

class SecondActivity : BaseActivity<SecondViewModel>(){

    companion object {
        const val TAG = "LOGGER"
    }

    @Inject
    @Named("app_scope")
    lateinit var mainAppLogger: AppLogger
    @Inject
    @Named("second_scope")
    lateinit var secondAppLogger: AppLogger

    override val getContentView: Int
        get() = R.layout.activity_second

    override fun onViewReady(savedInstanceState: Bundle?) {
        super.onViewReady(savedInstanceState)

        (this.applicationContext as BaseApplication).appComponent.newSecondSubComponent().inject(this)
        click_btn.setOnClickListener {
            Log.d(TAG, "App Scope : $mainAppLogger")
            Log.d(TAG, "Second Scope : $secondAppLogger")
        }

    }

}