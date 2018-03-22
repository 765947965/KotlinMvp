package com.kotlinmvp

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import com.kotlinmvp.base.NetWorPresenter
import java.util.concurrent.TimeUnit

/**
 * <br></br> ClassName:   ${className}
 * <br></br> Description:
 * <br></br>
 * <br></br> @author:      谢文良
 * <br></br> Date:        2018/3/20 16:38
 */

class TestPresenter : NetWorPresenter<ITestContract.ITestView>(), ITestContract.ITestPresenter<ITestContract.ITestView> {
    override fun cc() {
        getAttachView()?.displayStart()
        Observable.timer(4000, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread()).subscribe({
            getAttachView()?.displaySuccess()
        })
    }
}
