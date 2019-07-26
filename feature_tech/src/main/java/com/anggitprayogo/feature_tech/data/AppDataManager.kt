package com.anggitprayogo.feature_tech.data

import com.anggitprayogo.feature_tech.data.entity.TechEntity
import com.anggitprayogo.feature_tech.data.remote.TechRepository
import io.reactivex.Observable
import retrofit2.Response
import javax.inject.Inject

/**
 * Created by Anggit Prayogo on 2019-07-26.
 */
class AppDataManager @Inject constructor(
    private val techRepository: TechRepository
) : DataManager {

    override fun getNewsSports(category: String, apiKey: String): Observable<Response<TechEntity>> {
        return techRepository.getNewsSports(category, apiKey)
    }
}