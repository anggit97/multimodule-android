package com.anggitprayogo.feature_tech.data.remote

import com.anggitprayogo.feature_tech.data.entity.TechEntity
import io.reactivex.Observable
import retrofit2.Response

/**
 * Created by Anggit Prayogo on 2019-07-26.
 */
interface TechRepository {

    fun getNewsSports(
        category: String,
        apiKey: String
    ): Observable<Response<TechEntity>>
}