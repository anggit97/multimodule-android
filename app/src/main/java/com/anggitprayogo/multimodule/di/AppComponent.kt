package com.anggitprayogo.multimodule.di

import android.app.Application
import com.anggitprayogo.feature_sports.di.ActivityBuilderSportsModule
import com.anggitprayogo.multimodule.BaseApplication
import com.anggitprayogo.network.di.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        NetworkModule::class,
        ActivityBuilderModule::class,
        ActivityBuilderSportsModule::class
    ]
)
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}