package com.github.muneebwanee.dash.ui.activities.base

interface InterfaceInteractor<V : InterfaceView> {
    fun onAttach(view: V)
    fun onDetach()
}