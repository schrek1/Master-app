package cz.vse.overovac.di.modules

import cz.vse.overovac.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun contributeInjectorMainActivty(): MainActivity
}