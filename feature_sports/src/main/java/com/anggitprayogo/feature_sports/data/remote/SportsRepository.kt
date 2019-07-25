package com.anggitprayogo.feature_sports.data.remote

import com.anggitprayogo.feature_sports.data.entity.SportEntity
import io.reactivex.Observable
import retrofit2.Response

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
interface SportsRepository {

    fun getNewsSports(category: String, apiKey: String): Observable<Response<SportEntity>>
}