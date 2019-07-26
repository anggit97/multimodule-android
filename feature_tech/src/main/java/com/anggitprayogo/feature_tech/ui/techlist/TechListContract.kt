package com.anggitprayogo.feature_tech.ui.techlist

import com.anggitprayogo.core.BaseView

/**
 * Created by Anggit Prayogo on 2019-07-26.
 */
interface TechListContract {

    interface View: BaseView{

        fun showLoading()

        fun hideLoading()
    }

    interface Presenter{

    }
}