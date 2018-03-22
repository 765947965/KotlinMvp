package com.kotlinmvp.base

import android.widget.Toast

/**
 * <br></br> ClassName:   ${className}
 * <br></br> Description:
 * <br></br>
 * <br></br> @author:      谢文良
 * <br></br> Date:        2018/3/22 10:15
 */

abstract class AbstractNetWorkActivity<V : INetWorkContract.INetWorkView, P : INetWorkContract.INetWorPresenter<V>> : AbstractMvpActivity<V, P>(), INetWorkContract.INetWorkView {
    override fun displayStart() {
        Toast.makeText(this, "displayStart", Toast.LENGTH_SHORT).show()
    }

    override fun displaySuccess() {
        Toast.makeText(this, "displaySuccess", Toast.LENGTH_SHORT).show()
    }

    override fun displayRequestFailure() {

    }

    override fun displayNetworkError() {

    }

    override fun displayRequestNotNet() {

    }
}
