package com.kotlinmvp.base

/**
 * <br></br> ClassName:   ${className}
 * <br></br> Description:
 * <br></br>
 * <br></br> @author:      谢文良
 * <br></br> Date:        2018/3/22 9:52
 */

interface INetWorkContract {
    interface INetWorkView : IMvpContract.IMvpView {
        fun displayStart()

        fun displaySuccess()

        fun displayRequestFailure()

        fun displayNetworkError()

        fun displayRequestNotNet()
    }

    interface INetWorPresenter<V : INetWorkView> : IMvpContract.IMvpPresenter<V> {
        fun onRequestStart()

        fun onFailure()

        fun onComplete()

        fun onSuccess()
    }
}
