package com.anggitprayogo.multimodule.ui.main

import com.anggitprayogo.core.BaseView
import com.anggitprayogo.multimodule.model.Source

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
interface MainContract {

    interface View: BaseView{

        fun showResponseSuccess(body: Source?)
    }

    interface Presenter{

        fun getNewsSources()
    }
}