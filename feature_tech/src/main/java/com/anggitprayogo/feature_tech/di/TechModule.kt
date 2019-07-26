package com.anggitprayogo.feature_tech.di

import com.anggitprayogo.feature_tech.data.AppDataManager
import com.anggitprayogo.feature_tech.data.DataManager
import com.anggitprayogo.feature_tech.data.remote.TechApi
import com.anggitprayogo.feature_tech.data.remote.TechRepository
import com.anggitprayogo.feature_tech.data.remote.TechRepositoryImpl
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by Anggit Prayogo on 2019-07-26.
 */
@Module
class TechModule {

    @TechScope
    @Provides
    fun provideTechApi(retrofit: Retrofit): TechApi {
        return retrofit.create(TechApi::class.java)
    }

    @TechScope
    @Provides
    fun provideTechRepository(techService: TechApi): TechRepository {
        return TechRepositoryImpl(techService)
    }

    @TechScope
    @Provides
    fun provideAppDataManager(techRepositoryImpl: TechRepositoryImpl): DataManager {
        return AppDataManager(techRepositoryImpl)
    }
}