package com.kotlinmvp

import com.kotlinmvp.base.INetWorkContract

/**
 * <br></br> ClassName:   ${className}
 * <br></br> Description:
 * <br></br>
 * <br></br> @author:      谢文良
 * <br></br> Date:        2018/3/20 16:37
 */

interface ITestContract {
    interface ITestView : INetWorkContract.INetWorkView

    interface ITestPresenter<V : ITestView> : INetWorkContract.INetWorPresenter<V> {
        fun cc()
    }
}
