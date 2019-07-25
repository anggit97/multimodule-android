package com.anggitprayogo.multimodule.di

import com.anggitprayogo.multimodule.data.remote.SourceApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
@Module
class AppModule {

    @AppScope
    @Provides
    fun provideApiClient(retrofit: Retrofit): SourceApi {
        return retrofit.create(SourceApi::class.java)
    }
}