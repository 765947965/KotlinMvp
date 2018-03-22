package com.kotlinmvp.base

import java.lang.ref.Reference
import java.lang.ref.WeakReference

/**
 * <br></br> ClassName:   ${className}
 * <br></br> Description:
 * <br></br>
 * <br></br> @author:      谢文良
 * <br></br> Date:        2018/3/22 9:54
 */

open class MvpPresenter<V : IMvpContract.IMvpView> : IMvpContract.IMvpPresenter<V> {
    override fun getAttachView(): V? {
        return if (mViewRef != null) mViewRef!!.get() else null
    }

    private var mViewRef: Reference<V>? = null

    override fun attachView(view: V?) {
        if (view != null) {
            detachView()
            mViewRef = WeakReference(view)
        }
    }

    override fun detachView() {
        if (mViewRef != null) {
            mViewRef!!.clear()
            mViewRef = null
        }
    }
}
