package com.anggitprayogo.feature_sports.ui.sportslist

import com.anggitprayogo.core.BasePresenter
import com.anggitprayogo.feature_sports.data.AppDataManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
class SportListPresenter @Inject constructor(
    private val appDataManager: AppDataManager
) : BasePresenter<SportListContract.View>(), SportListContract.Presenter {

    override fun getNewsSports(category: String, apiKey: String) {
        compositeDisposable.addAll(
            appDataManager.getNewsSports(category, apiKey)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    { response ->
                        view?.showNewsSportSuccess(response.body())
                    },
                    { error ->
                        view?.showError(error)
                    }
                )
        )
    }
}