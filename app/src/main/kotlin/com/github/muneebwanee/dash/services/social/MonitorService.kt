package com.github.muneebwanee.dash.services.social

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.github.muneebwanee.dash.services.base.BaseService

class MonitorService : BaseService() {
    
    override fun onBind(intent: Intent): IBinder? = null
    
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Simple service implementation
        return START_STICKY
    }
}