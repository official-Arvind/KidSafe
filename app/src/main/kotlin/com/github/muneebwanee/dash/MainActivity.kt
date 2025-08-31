package com.github.muneebwanee.dash

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    
    private lateinit var recyclerView: RecyclerView
    private lateinit var fab: FloatingActionButton
    private lateinit var adapter: MonitoringFeaturesAdapter
    
    private val PERMISSIONS = arrayOf(
        Manifest.permission.READ_EXTERNAL_STORAGE,
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.CAMERA,
        Manifest.permission.RECORD_AUDIO,
        Manifest.permission.ACCESS_FINE_LOCATION,
        Manifest.permission.READ_PHONE_STATE,
        Manifest.permission.READ_SMS,
        Manifest.permission.READ_CALL_LOG,
        Manifest.permission.READ_CONTACTS
    )
    
    private val PERMISSION_REQUEST_CODE = 123
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        setupViews()
        setupRecyclerView()
        checkPermissions()
    }
    
    private fun setupViews() {
        recyclerView = findViewById(R.id.recyclerView)
        fab = findViewById(R.id.fab)
        
        fab.setOnClickListener {
            showMonitoringOptions()
        }
    }
    
    private fun setupRecyclerView() {
        adapter = MonitoringFeaturesAdapter(getMonitoringFeatures()) { feature ->
            when (feature.type) {
                FeatureType.PHOTOS -> openPhotoMonitoring()
                FeatureType.RECORDINGS -> openRecordingMonitoring()
                FeatureType.LOCATION -> openLocationMonitoring()
                FeatureType.SOCIAL -> openSocialMonitoring()
                FeatureType.SETTINGS -> openSettings()
                FeatureType.NOTIFICATIONS -> openNotificationMonitoring()
            }
        }
        
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
    
    private fun getMonitoringFeatures(): List<MonitoringFeature> {
        return listOf(
            MonitoringFeature("📸 Photo Monitoring", "Monitor and capture photos", FeatureType.PHOTOS),
            MonitoringFeature("🎤 Audio Recording", "Record audio conversations", FeatureType.RECORDINGS),
            MonitoringFeature("📍 Location Tracking", "Track device location", FeatureType.LOCATION),
            MonitoringFeature("📱 Social Media", "Monitor social media activity", FeatureType.SOCIAL),
            MonitoringFeature("🔔 Notifications", "Monitor notifications", FeatureType.NOTIFICATIONS),
            MonitoringFeature("⚙️ Settings", "Configure monitoring settings", FeatureType.SETTINGS)
        )
    }
    
    private fun checkPermissions() {
        val permissionsToRequest = mutableListOf<String>()
        
        for (permission in PERMISSIONS) {
            if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
                permissionsToRequest.add(permission)
            }
        }
        
        if (permissionsToRequest.isNotEmpty()) {
            ActivityCompat.requestPermissions(this, permissionsToRequest.toTypedArray(), PERMISSION_REQUEST_CODE)
        }
    }
    
    private fun showMonitoringOptions() {
        val options = arrayOf("Start Monitoring", "Stop Monitoring", "View Logs", "Settings")
        AlertDialog.Builder(this)
            .setTitle("Monitoring Options")
            .setItems(options) { _, which ->
                when (which) {
                    0 -> startMonitoring()
                    1 -> stopMonitoring()
                    2 -> viewLogs()
                    3 -> openSettings()
                }
            }
            .show()
    }
    
    private fun startMonitoring() {
        Snackbar.make(recyclerView, "Monitoring started", Snackbar.LENGTH_SHORT).show()
        // Here you would implement the actual monitoring logic
    }
    
    private fun stopMonitoring() {
        Snackbar.make(recyclerView, "Monitoring stopped", Snackbar.LENGTH_SHORT).show()
        // Here you would implement the actual monitoring stop logic
    }
    
    private fun viewLogs() {
        Snackbar.make(recyclerView, "Viewing monitoring logs", Snackbar.LENGTH_SHORT).show()
        // Here you would implement the logs viewing logic
    }
    
    private fun openPhotoMonitoring() {
        if (checkPermission(Manifest.permission.CAMERA)) {
            Snackbar.make(recyclerView, "Opening photo monitoring", Snackbar.LENGTH_SHORT).show()
            // Implement photo monitoring
        } else {
            requestPermission(Manifest.permission.CAMERA)
        }
    }
    
    private fun openRecordingMonitoring() {
        if (checkPermission(Manifest.permission.RECORD_AUDIO)) {
            Snackbar.make(recyclerView, "Opening audio recording monitoring", Snackbar.LENGTH_SHORT).show()
            // Implement audio recording monitoring
        } else {
            requestPermission(Manifest.permission.RECORD_AUDIO)
        }
    }
    
    private fun openLocationMonitoring() {
        if (checkPermission(Manifest.permission.ACCESS_FINE_LOCATION)) {
            Snackbar.make(recyclerView, "Opening location monitoring", Snackbar.LENGTH_SHORT).show()
            // Implement location monitoring
        } else {
            requestPermission(Manifest.permission.ACCESS_FINE_LOCATION)
        }
    }
    
    private fun openSocialMonitoring() {
        Snackbar.make(recyclerView, "Opening social media monitoring", Snackbar.LENGTH_SHORT).show()
        // Implement social media monitoring
    }
    
    private fun openNotificationMonitoring() {
        Snackbar.make(recyclerView, "Opening notification monitoring", Snackbar.LENGTH_SHORT).show()
        // Implement notification monitoring
    }
    
    private fun openSettings() {
        Snackbar.make(recyclerView, "Opening settings", Snackbar.LENGTH_SHORT).show()
        // Implement settings
    }
    
    private fun checkPermission(permission: String): Boolean {
        return ContextCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED
    }
    
    private fun requestPermission(permission: String) {
        ActivityCompat.requestPermissions(this, arrayOf(permission), PERMISSION_REQUEST_CODE)
    }
    
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        
        if (requestCode == PERMISSION_REQUEST_CODE) {
            val deniedPermissions = mutableListOf<String>()
            
            for (i in permissions.indices) {
                if (grantResults[i] != PackageManager.PERMISSION_GRANTED) {
                    deniedPermissions.add(permissions[i])
                }
            }
            
            if (deniedPermissions.isNotEmpty()) {
                showPermissionExplanationDialog(deniedPermissions)
            }
        }
    }
    
    private fun showPermissionExplanationDialog(permissions: List<String>) {
        AlertDialog.Builder(this)
            .setTitle("Permissions Required")
            .setMessage("This app needs the following permissions to function properly: ${permissions.joinToString(", ")}")
            .setPositiveButton("Grant Permissions") { _, _ ->
                val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                intent.data = Uri.fromParts("package", packageName, null)
                startActivity(intent)
            }
            .setNegativeButton("Cancel", null)
            .show()
    }
    
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                openSettings()
                true
            }
            R.id.action_about -> {
                showAboutDialog()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
    
    private fun showAboutDialog() {
        AlertDialog.Builder(this)
            .setTitle("About KidSafe")
            .setMessage("KidSafe v1.0.4\n\nA comprehensive monitoring application for parental control and device tracking.")
            .setPositiveButton("OK", null)
            .show()
    }
}

// Data classes for the monitoring features
data class MonitoringFeature(
    val title: String,
    val description: String,
    val type: FeatureType
)

enum class FeatureType {
    PHOTOS, RECORDINGS, LOCATION, SOCIAL, SETTINGS, NOTIFICATIONS
}

// RecyclerView Adapter
class MonitoringFeaturesAdapter(
    private val features: List<MonitoringFeature>,
    private val onFeatureClick: (MonitoringFeature) -> Unit
) : RecyclerView.Adapter<MonitoringFeaturesAdapter.ViewHolder>() {
    
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleView: android.widget.TextView = view.findViewById(R.id.featureTitle)
        val descriptionView: android.widget.TextView = view.findViewById(R.id.featureDescription)
    }
    
    override fun onCreateViewHolder(parent: android.view.ViewGroup, viewType: Int): ViewHolder {
        val view = android.view.LayoutInflater.from(parent.context)
            .inflate(R.layout.item_monitoring_feature, parent, false)
        return ViewHolder(view)
    }
    
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val feature = features[position]
        holder.titleView.text = feature.title
        holder.descriptionView.text = feature.description
        
        holder.itemView.setOnClickListener {
            onFeatureClick(feature)
        }
    }
    
    override fun getItemCount() = features.size
}