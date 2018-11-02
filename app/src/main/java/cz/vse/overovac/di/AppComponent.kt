package cz.vse.overovac.di

import cz.vse.overovac.MainApplication
import cz.vse.overovac.di.modules.ActivityBuilder
import cz.vse.overovac.di.modules.ServiceModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivityBuilder::class,
        ServiceModule::class
    ]
)
interface AppComponent : AndroidInjector<MainApplication>