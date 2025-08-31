package com.github.muneebwanee.dash.utils

import android.content.Context
import android.widget.Toast

object Dialogs {
    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}