package cz.vse.overovac

import android.app.Activity
import android.app.Application
import cz.vse.overovac.di.AppComponent
import cz.vse.overovac.di.DaggerAppComponent
import cz.vse.overovac.di.modules.ContextModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


class MainApplication : Application(), HasActivityInjector {

    private val appComponent: AppComponent by lazy {
        DaggerAppComponent
            .builder()
            .contextModule(ContextModule(this))
            .build()
    }

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }
}
