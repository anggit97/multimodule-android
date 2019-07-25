package com.anggitprayogo.feature_sports.di

import com.anggitprayogo.feature_sports.di.sportlist.SportListModule
import com.anggitprayogo.feature_sports.ui.sportslist.SportListActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
@Module
abstract class ActivityBuilderSportsModule {

    @ContributesAndroidInjector(
        modules = [
            SportsModule::class,
            SportListModule::class
        ]
    )
    abstract fun contributeSportListActivity(): SportListActivity
}