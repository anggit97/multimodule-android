package com.anggitprayogo.feature_sports.di

import com.anggitprayogo.feature_sports.data.AppDataManager
import com.anggitprayogo.feature_sports.data.DataManager
import com.anggitprayogo.feature_sports.data.remote.SportsApi
import com.anggitprayogo.feature_sports.data.remote.SportsRepository
import com.anggitprayogo.feature_sports.data.remote.SportsRepositoryImpl
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
@Module
class SportsModule {

    @SportsScope
    @Provides
    fun provideSportService(retrofit: Retrofit): SportsApi {
        return retrofit.create(SportsApi::class.java)
    }

    @SportsScope
    @Provides
    fun provideSportRepository(sportService: SportsApi): SportsRepository {
        return SportsRepositoryImpl(sportService)
    }

    @SportsScope
    @Provides
    fun provideDataManager(sportsRepository: SportsRepositoryImpl): DataManager {
        return AppDataManager(sportsRepository)
    }
}