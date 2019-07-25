package com.anggitprayogo.multimodule.data

import com.anggitprayogo.multimodule.data.remote.SourceApi
import com.anggitprayogo.multimodule.model.Source
import io.reactivex.Observable
import retrofit2.Response
import javax.inject.Inject

class SourceRepositoryImpl @Inject constructor(
    private val sourceApi: SourceApi
) : SourceRepository {

    override fun getNewsSource(): Observable<Response<Source>> {
        return sourceApi.getNewsSources("26fc30b1feeb42c780ab1cf64002f3f4")
    }
}