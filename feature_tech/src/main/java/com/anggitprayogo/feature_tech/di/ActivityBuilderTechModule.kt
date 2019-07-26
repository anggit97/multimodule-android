package com.anggitprayogo.feature_tech.di

import com.anggitprayogo.feature_tech.ui.techlist.TechListActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Anggit Prayogo on 2019-07-26.
 */
@Module
abstract class ActivityBuilderTechModule {

    @ContributesAndroidInjector(
        modules = [TechModule::class]
    )
    abstract fun contributeTechListActivity(): TechListActivity
}