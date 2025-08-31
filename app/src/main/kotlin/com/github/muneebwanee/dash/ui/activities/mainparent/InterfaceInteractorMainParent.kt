package com.github.muneebwanee.dash.ui.activities.mainparent

import com.github.muneebwanee.dash.ui.activities.base.InterfaceInteractor

interface InterfaceInteractorMainParent<V : InterfaceViewMainParent> : InterfaceInteractor<V> {
    fun signOut()
}