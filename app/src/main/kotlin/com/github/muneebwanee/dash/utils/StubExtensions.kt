package com.github.muneebwanee.dash.utils

import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// Stub implementations for missing functions

fun Activity.runDelayedOnUiThread(delay: Long, action: () -> Unit) {
    CoroutineScope(Dispatchers.Main).launch {
        kotlinx.coroutines.delay(delay)
        action()
    }
}

fun Fragment.runDelayedOnUiThread(delay: Long, action: () -> Unit) {
    activity?.runDelayedOnUiThread(delay, action)
}

fun Activity.runOnUiThread(action: () -> Unit) {
    runOnUiThread(action)
}

fun Fragment.runOnUiThread(action: () -> Unit) {
    activity?.runOnUiThread(action)
}

fun Context.longToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Context.longToast(messageResId: Int) {
    Toast.makeText(this, messageResId, Toast.LENGTH_LONG).show()
}

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Context.toast(messageResId: Int) {
    Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show()
}

// Stub for SweetAlertDialog
class SweetAlertDialog(context: Context, alertType: Int) {
    fun setTitleText(title: String): SweetAlertDialog = this
    fun setContentText(content: String): SweetAlertDialog = this
    fun setConfirmText(text: String): SweetAlertDialog = this
    fun setCancelText(text: String): SweetAlertDialog = this
    fun setConfirmClickListener(listener: (SweetAlertDialog) -> Unit): SweetAlertDialog = this
    fun setCancelClickListener(listener: (SweetAlertDialog) -> Unit): SweetAlertDialog = this
    fun show() {}
    fun hide() {}
    fun dismiss() {}
    fun setCustomView(view: View): SweetAlertDialog = this
    fun hideConfirmButton(): SweetAlertDialog = this
    fun changeAlertType(alertType: Int): SweetAlertDialog = this
}

// Stub for Anko functions
object Anko {
    fun Context.inflateLayout(layoutId: Int): View {
        return android.view.LayoutInflater.from(this).inflate(layoutId, null)
    }
    
    fun Context.start(intent: android.content.Intent) {
        startActivity(intent)
    }
    
    fun Context.IntentFor(activityClass: Class<*>): android.content.Intent {
        return android.content.Intent(this, activityClass)
    }
    
    fun Context.vibrator(): android.os.Vibrator {
        return getSystemService(Context.VIBRATOR_SERVICE) as android.os.Vibrator
    }
    
    fun Context.powerManager(): android.os.PowerManager {
        return getSystemService(Context.POWER_SERVICE) as android.os.PowerManager
    }
    
    fun Context.isPermissionGranted(permission: String): Boolean {
        return checkSelfPermission(permission) == android.content.pm.PackageManager.PERMISSION_GRANTED
    }
}

// Stub for KotterKnife
object KotterKnife {
    fun bind(target: Any, source: View) {
        // Stub implementation
    }
}

// Stub for RxJava functions
object RxView {
    fun clicks(view: View) = io.reactivex.Observable.never<Any>()
}

object Schedulers {
    val io = io.reactivex.schedulers.Schedulers.io()
    val mainThread = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
}

object AndroidSchedulers {
    fun mainThread() = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
}

// Stub for missing string resources
object StringResources {
    const val error_database_connection = "Database connection error"
    const val not_have_key_text = "No keys available"
    const val failed_keys_text = "Failed to load keys"
    const val disable_keylogger = "Disable Keylogger"
    const val search_notify = "Search notifications"
    const val not_have_sms_yet = "No SMS messages yet"
    const val failed_sms = "Failed to load SMS"
    const val selected = "Selected"
    const val search_sms = "Search SMS"
    const val enable_notification_message = "Enable notifications"
    const val disable_notification_message = "Disable notifications"
    const val not_have_notifications_text = "No notifications available"
    const val failed_notifications_text = "Failed to load notifications"
    const val search_photos = "Search photos"
    const val search_photos_date = "Search photos by date"
    const val not_have_photo_yet = "No photos available"
    const val failed_photo = "Failed to load photos"
    const val message_permission_photo_disable = "Photo permission disabled"
    const val enable_photo = "Enable photo"
    const val disable_photo = "Disable photo"
    const val search_records = "Search recordings"
    const val search_records_date = "Search recordings by date"
    const val msj_snackbar_record = "Recording"
    const val msj_snackbar_current_record = "Current recording"
    const val not_have_audios_yet = "No audio recordings available"
    const val failed_record_audios = "Failed to load recordings"
    const val enable_recording = "Enable recording"
    const val disable_recording = "Disable recording"
    const val failed_social = "Failed to load social data"
    const val message_permission_social_disable = "Social permission disabled"
    const val enable_social = "Enable social"
    const val disable_social = "Disable social"
    const val title_dialog = "Dialog"
    const val message_dialog_delete_sms = "Delete SMS?"
    const val message_dialog_delete_photo = "Delete photo?"
    const val message_dialog_delete_notify = "Delete notification?"
    const val message_dialog_delete_record_audio = "Delete recording?"
    const val message_dialog_record_audio = "Record audio"
    const val submit = "Submit"
    const val message_permission_storage = "Storage permission required"
    const val message_permission_never_ask_again_storage = "Storage permission denied permanently"
    const val failed_delete_file = "Failed to delete file"
    const val failed_delete_files = "Failed to delete files"
    const val maps_installed = "Maps installed"
    const val check_root_access = "Check root access"
    const val error_current_code_access = "Current code access error"
    const val error_code_access = "Code access error"
    const val error_not_match_code_access = "Code access mismatch"
    const val ten_minute = "10 minutes"
    const val fifteen_minute = "15 minutes"
    const val thirty_minute = "30 minutes"
    const val one_hour = "1 hour"
    const val enabled_gps = "GPS enabled"
    const val disabled_gps = "GPS disabled"
    const val message_permission_location_disable = "Location permission disabled"
}

// Stub for missing classes
class Dash : android.app.Application() {
    companion object {
        lateinit var instance: Dash
            private set
    }
    
    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}

class DataRepository {
    // Stub implementation
}

// Extension functions for View visibility
fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.GONE
}

// Extension functions for SweetAlertDialog
fun SweetAlertDialog.show() {}
fun SweetAlertDialog.hide() {}

// Stub for missing imports
object pawegio {
    // Stub implementation
}

object kotterknife {
    // Stub implementation
}

object de {
    // Stub implementation
}

// Stub for missing classes
class CircleImageView(context: Context) : View(context) {
    // Stub implementation
}

class DataSnapshot {
    // Stub implementation
}

class DatabaseError {
    // Stub implementation
}

class Query {
    // Stub implementation
}

class Gson {
    // Stub implementation
}

class TypeToken<T> {
    // Stub implementation
}

class CoroutineWorker {
    // Stub implementation
}

class Timber {
    companion object {
        fun d(message: String) {}
        fun e(message: String) {}
    }
}