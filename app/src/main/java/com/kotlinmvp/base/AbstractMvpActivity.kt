package com.kotlinmvp.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * <br></br> ClassName:   ${className}
 * <br></br> Description:
 * <br></br>
 * <br></br> @author:      谢文良
 * <br></br> Date:        2018/3/22 10:11
 */

abstract class AbstractMvpActivity<V : IMvpContract.IMvpView, P : IMvpContract.IMvpPresenter<V>> : AppCompatActivity(), IMvpContract.IMvpView {
    protected var presenter: P? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createPresenter()
        if (presenter != null) {
            presenter!!.attachView(this as V)
        }
    }

    protected abstract fun createPresenter(): P
}
