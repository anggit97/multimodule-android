package com.anggitprayogo.multimodule.ui.main

import android.os.Bundle
import android.util.Log.e
import com.anggitprayogo.core.BaseActivity
import com.anggitprayogo.multimodule.R
import com.anggitprayogo.multimodule.model.Source
import javax.inject.Inject

class MainActivity : BaseActivity(), MainContract.View {

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.attachView(this)

        presenter.getNewsSources()
    }

    override fun showResponseSuccess(body: Source?) {
        e("DATA : ", body.toString())
    }

    override fun showError(throwable: Throwable) {
        e("DATA ERROR: ", throwable.message)
    }
}
