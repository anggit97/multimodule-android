package com.anggitprayogo.feature_sports.data.remote

import com.anggitprayogo.feature_sports.data.entity.SportEntity
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
interface SportsApi {

    @Headers("Accept: application/json")
    @GET("top-headlines")
    fun getNewsSports(@Query("category") category: String,
                      @Query("apiKey") apiKey: String): Observable<Response<SportEntity>>
}