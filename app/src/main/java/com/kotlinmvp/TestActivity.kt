package com.kotlinmvp

import android.os.Bundle
import com.kotlinmvp.base.AbstractNetWorkActivity

/**
 * <br></br> ClassName:   ${className}
 * <br></br> Description:
 * <br></br>
 * <br></br> @author:      谢文良
 * <br></br> Date:        2018/3/20 16:39
 */

class TestActivity : AbstractNetWorkActivity<ITestContract.ITestView, ITestContract.ITestPresenter<ITestContract.ITestView>>(), ITestContract.ITestView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter?.cc()
    }

    override fun createPresenter(): ITestContract.ITestPresenter<ITestContract.ITestView> {
        return TestPresenter()
    }
}
