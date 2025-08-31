package com.github.muneebwanee.dash.utils.async

import android.os.AsyncTask

class AsyncTaskRunCommand : AsyncTask<String, Void, String>() {
    
    override fun doInBackground(vararg params: String?): String {
        // Simple implementation
        return "Success"
    }
}