package com.anggitprayogo.feature_sports.ui.sportslist

import com.anggitprayogo.core.BaseView
import com.anggitprayogo.feature_sports.data.entity.SportEntity

/**
 * Created by Anggit Prayogo on 2019-07-25.
 */
interface SportListContract {

    interface View : BaseView {

        fun showNewsSportSuccess(body: SportEntity?)
    }

    interface Presenter {

        fun getNewsSports(category: String, apiKey: String)
    }
}