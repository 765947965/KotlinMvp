package com.kotlinmvp.base

/**
 * <br></br> ClassName:   ${className}
 * <br></br> Description:
 * <br></br>
 * <br></br> @author:      谢文良
 * <br></br> Date:        2018/3/22 9:57
 */

open class NetWorPresenter<V : INetWorkContract.INetWorkView> : MvpPresenter<V>(), INetWorkContract.INetWorPresenter<V> {

    override fun onRequestStart() {
        getAttachView()?.displayStart()
    }

    override fun onFailure() {
        getAttachView()?.displaySuccess()
    }

    override fun onComplete() {

    }

    override fun onSuccess() {
        getAttachView()?.displaySuccess()
    }
}
