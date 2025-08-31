package com.github.muneebwanee.dash.ui.activities.login

import com.github.muneebwanee.dash.ui.activities.base.InterfaceView

interface InterfaceViewLogin : InterfaceView {
    fun onSuccessLogin()
    fun onErrorLogin(message: String)
}