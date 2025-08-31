package com.github.muneebwanee.dash.ui.activities.mainparent

import com.github.muneebwanee.dash.ui.activities.base.InterfaceView

interface InterfaceViewMainParent : InterfaceView {
    fun onSuccessLogout()
    fun onErrorLogout(message: String)
}