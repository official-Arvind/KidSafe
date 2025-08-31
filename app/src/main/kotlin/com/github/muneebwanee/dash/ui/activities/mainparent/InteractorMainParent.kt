package com.github.muneebwanee.dash.ui.activities.mainparent

class InteractorMainParent<V : InterfaceViewMainParent> : InterfaceInteractorMainParent<V> {
    
    private var view: V? = null
    
    override fun onAttach(view: V) {
        this.view = view
    }
    
    override fun onDetach() {
        this.view = null
    }
    
    override fun signOut() {
        view?.onSuccessLogout()
    }
}

