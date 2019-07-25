package com.anggitprayogo.core

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
open class BasePresenter<T : BaseView>: Presenter<T>{

    protected lateinit var compositeDisposable: CompositeDisposable

    protected var schedulerAndroid = AndroidSchedulers.mainThread()

    protected var schedulerProcess = Schedulers.io()

    var view: T? = null

    override fun attachView(view: T) {
        this.compositeDisposable = CompositeDisposable()
        this.view = view
    }

    override fun detachView() {
        this.view = null
        compositeDisposable.clear()
    }

    protected fun isViewAttached() = view != null

    protected class BaseViewNotAttachedException internal constructor() : RuntimeException("Please call Presenter.attachView(MvpView) before" + " requesting data to the Presenter")
}