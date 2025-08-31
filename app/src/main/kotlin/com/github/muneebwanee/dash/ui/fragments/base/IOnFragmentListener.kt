package com.github.muneebwanee.dash.ui.fragments.base

interface IOnFragmentListener {
    fun onChangeHeight()
    fun onHideFragment()
    fun onBackPressed(): Boolean
}