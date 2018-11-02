package cz.vse.overovac.activity

import android.app.Activity
import android.os.Bundle
import dagger.android.AndroidInjection

open class BaseActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

    }
}
