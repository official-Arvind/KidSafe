package com.github.muneebwanee.dash.ui.activities.login

class InteractorLogin<V : InterfaceViewLogin> : InterfaceInteractorLogin<V> {
    
    private var view: V? = null
    
    override fun onAttach(view: V) {
        this.view = view
    }
    
    override fun onDetach() {
        this.view = null
    }
    
    override fun signInDisposable(email: String, pass: String) {
        // Simple validation
        if (email.isNotEmpty() && pass.isNotEmpty()) {
            view?.onSuccessLogin()
        } else {
            view?.onErrorLogin("Please fill all fields")
        }
    }
}