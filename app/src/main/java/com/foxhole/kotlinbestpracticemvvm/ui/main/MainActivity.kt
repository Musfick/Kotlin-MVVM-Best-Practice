package com.foxhole.kotlinbestpracticemvvm.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.foxhole.kotlinbestpracticemvvm.BaseApplication
import com.foxhole.kotlinbestpracticemvvm.R
import com.foxhole.kotlinbestpracticemvvm.base.BaseActivity
import com.foxhole.kotlinbestpracticemvvm.ui.second.SecondActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainViewModel>(), View.OnClickListener {


    //set activity layout
    override val getContentView: Int
        get() = R.layout.activity_main

    //this method will call when view is ready
    override fun onViewReady(savedInstanceState: Bundle?) {
        super.onViewReady(savedInstanceState)
        change_btn.setOnClickListener(this)
        toast_btn.setOnClickListener(this)
        (this.applicationContext as BaseApplication).appComponent.newMainSubComponent().inject(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.change_btn -> moveToSecondActivity()
            R.id.toast_btn -> showToast("This is Activity Main")
        }
    }

    private fun moveToSecondActivity() {
       startActivity(Intent(this, SecondActivity::class.java))
    }

}
