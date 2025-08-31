package com.github.muneebwanee.dash.data.preference

import android.content.Context
import android.content.SharedPreferences

object DataSharePreference {
    private const val PREF_NAME = "KidSafePrefs"
    
    private fun getPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    }
    
    var Context.childSelected: String
        get() = getPrefs(this).getString("childSelected", "") ?: ""
        set(value) = getPrefs(this).edit().putString("childSelected", value).apply()
    
    var Context.deviceChildSelected: String
        get() = getPrefs(this).getString("deviceChildSelected", "") ?: ""
        set(value) = getPrefs(this).edit().putString("deviceChildSelected", value).apply()
    
    var Context.childPhoto: String
        get() = getPrefs(this).getString("childPhoto", "") ?: ""
        set(value) = getPrefs(this).edit().putString("childPhoto", value).apply()
}