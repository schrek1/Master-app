package cz.vse.overovac.di.modules

import android.content.Context
import cz.vse.overovac.service.DummyService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    includes = [ContextModule::class]
)
class ServiceModule {

    @Singleton
    @Provides
    fun provideDummyService(context: Context): DummyService {
        return DummyService(context)
    }
}