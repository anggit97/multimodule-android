package com.anggitprayogo.feature_sports.data.remote

import com.anggitprayogo.feature_sports.data.entity.SportEntity
import io.reactivex.Observable
import retrofit2.Response
import javax.inject.Inject

class SportsRepositoryImpl @Inject constructor(
    private val sportService: SportsApi
) : SportsRepository {

    override fun getNewsSports(category: String, apiKey: String): Observable<Response<SportEntity>> {
        return sportService.getNewsSports(category, apiKey)
    }
}