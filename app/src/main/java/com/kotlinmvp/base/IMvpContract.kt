package com.kotlinmvp.base

/**
 * <br></br> ClassName:   ${className}
 * <br></br> Description:
 * <br></br>
 * <br></br> @author:      谢文良
 * <br></br> Date:        2018/3/22 9:49
 */

interface IMvpContract {
    interface IMvpView

    interface IMvpPresenter<V : IMvpView> {

        fun attachView(view: V?)

        fun detachView()

        fun getAttachView(): V?
    }
}
