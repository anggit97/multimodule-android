package com.anggitprayogo.multimodule.di

import com.anggitprayogo.multimodule.di.main.MainModule
import com.anggitprayogo.multimodule.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
@Module
abstract class ActivityBuilderModule {

   @ContributesAndroidInjector(
       modules = [AppModule::class, MainModule::class]
   )
   abstract fun contributeMainActivity(): MainActivity
}