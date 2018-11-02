package cz.vse.overovac.activity

import android.os.Bundle
import cz.vse.overovac.R
import cz.vse.overovac.service.DummyService
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var dummyService: DummyService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testButton.onClick {
            dummyService.showToast()
        }
    }
}
