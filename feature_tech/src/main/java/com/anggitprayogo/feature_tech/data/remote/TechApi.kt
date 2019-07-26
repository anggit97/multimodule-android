package com.anggitprayogo.feature_tech.data.remote

import com.anggitprayogo.feature_tech.data.entity.TechEntity
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

/**
 * Created by Anggit Prayogo on 2019-07-26.
 */
interface TechApi {

    @Headers("Accept: application/json")
    @GET("top-headlines")
    fun getNewsSports(
        @Query("category") category: String,
        @Query("apiKey") apiKey: String
    ): Observable<Response<TechEntity>>
}