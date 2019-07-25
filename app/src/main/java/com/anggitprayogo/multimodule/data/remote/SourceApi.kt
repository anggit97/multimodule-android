package com.anggitprayogo.multimodule.data.remote

import com.anggitprayogo.multimodule.model.Source
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
interface SourceApi {

    @Headers("Accept: application/json")
    @GET("sources")
    fun getNewsSources(@Query("apiKey") apiKey: String) : Observable<Response<Source>>
}