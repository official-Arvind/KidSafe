package com.github.muneebwanee.dash.services.base

import android.app.Service
import android.content.Intent
import android.os.IBinder

abstract class BaseService : Service() {
    
    override fun onCreate() {
        super.onCreate()
    }
    
    override fun onBind(intent: Intent): IBinder? = null
    
    override fun onDestroy() {
        super.onDestroy()
    }
}
