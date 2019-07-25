package com.anggitprayogo.feature_sports.ui.sportslist

import android.os.Bundle
import android.util.Log.e
import com.anggitprayogo.core.BaseActivity
import com.anggitprayogo.feature_sports.R
import com.anggitprayogo.feature_sports.data.entity.SportEntity
import javax.inject.Inject

class SportListActivity : BaseActivity(), SportListContract.View {

    @Inject
    lateinit var presenter: SportListPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport_list)

        presenter.attachView(this)

        presenter.getNewsSports("sports", "26fc30b1feeb42c780ab1cf64002f3f4")
    }

    override fun showNewsSportSuccess(body: SportEntity?) {
        e("DATA SPORT: ", body.toString())
    }

    override fun showError(throwable: Throwable) {
        e("DATA SPORT: ", throwable.message)
    }
}
