package com.anggitprayogo.feature_tech.data.remote

import com.anggitprayogo.feature_tech.data.entity.TechEntity
import io.reactivex.Observable
import retrofit2.Response
import javax.inject.Inject

class TechRepositoryImpl @Inject constructor(
    private val techService: TechApi
) : TechRepository {

    override fun getNewsSports(category: String, apiKey: String): Observable<Response<TechEntity>> {
        return techService.getNewsSports(category, apiKey)
    }
}