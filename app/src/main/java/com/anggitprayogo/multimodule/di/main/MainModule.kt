package com.anggitprayogo.multimodule.di.main

import com.anggitprayogo.multimodule.data.SourceRepositoryImpl
import com.anggitprayogo.multimodule.di.AppScope
import com.anggitprayogo.multimodule.ui.main.MainPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
@Module
class MainModule {

    @AppScope
    @Provides
    fun provideMainPresenter(repositoryImpl: SourceRepositoryImpl): MainPresenter {
        return MainPresenter(repositoryImpl)
    }
}