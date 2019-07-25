package com.anggitprayogo.feature_sports.di.sportlist

import com.anggitprayogo.feature_sports.data.AppDataManager
import com.anggitprayogo.feature_sports.di.SportsScope
import com.anggitprayogo.feature_sports.ui.sportslist.SportListPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
@Module
class SportListModule {

    @SportsScope
    @Provides
    fun provideSportPresenter(appDataManager: AppDataManager): SportListPresenter {
        return SportListPresenter(appDataManager)
    }
}