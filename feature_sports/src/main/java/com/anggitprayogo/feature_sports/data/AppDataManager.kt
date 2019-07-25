package com.anggitprayogo.feature_sports.data

import com.anggitprayogo.feature_sports.data.entity.SportEntity
import com.anggitprayogo.feature_sports.data.remote.SportsRepository
import io.reactivex.Observable
import retrofit2.Response
import javax.inject.Inject

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
class AppDataManager @Inject constructor(
    private val sportsRepository: SportsRepository
) : DataManager {

    override fun getNewsSports(category: String, apiKey: String): Observable<Response<SportEntity>> {
        return sportsRepository.getNewsSports(category, apiKey)
    }
}