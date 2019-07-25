package com.anggitprayogo.core

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
interface Presenter<V : BaseView> {

    fun attachView(view: V)

    fun detachView()
}