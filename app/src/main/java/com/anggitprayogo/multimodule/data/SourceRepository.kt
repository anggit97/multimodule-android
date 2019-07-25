package com.anggitprayogo.multimodule.data

import com.anggitprayogo.multimodule.model.Source
import io.reactivex.Observable
import retrofit2.Response

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
interface SourceRepository {

    fun getNewsSource() : Observable<Response<Source>>
}