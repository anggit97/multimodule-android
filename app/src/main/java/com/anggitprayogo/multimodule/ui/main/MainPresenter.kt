package com.anggitprayogo.multimodule.ui.main

import com.anggitprayogo.core.BasePresenter
import com.anggitprayogo.multimodule.data.SourceRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
class MainPresenter @Inject constructor(private val repository: SourceRepository) : BasePresenter<MainContract.View>(),
    MainContract.Presenter {

    override fun getNewsSources() {
        compositeDisposable.addAll(
            repository.getNewsSource()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    { response ->
                        view?.showResponseSuccess(response.body())
                    },
                    { error ->
                        view?.showError(error)
                    }
                )
        )
    }
}