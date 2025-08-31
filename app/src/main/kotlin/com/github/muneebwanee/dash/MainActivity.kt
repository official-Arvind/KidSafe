package com.github.muneebwanee.dash

import android.os.Bundle
import android.widget.TextView
import android.widget.LinearLayout
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_simple)
        
        setupFeatureList()
    }
    
    private fun setupFeatureList() {
        val container = findViewById<LinearLayout>(R.id.featureContainer)
        
        val features = listOf(
            "📸 Photo Monitoring" to "Monitor and capture photos",
            "🎤 Audio Recording" to "Record audio conversations", 
            "📍 Location Tracking" to "Track device location",
            "📱 Social Media" to "Monitor social media activity",
            "🔔 Notifications" to "Monitor notifications",
            "⚙️ Settings" to "Configure monitoring settings"
        )
        
        features.forEach { (title, description) ->
            val featureView = createFeatureView(title, description)
            container.addView(featureView)
        }
    }
    
    private fun createFeatureView(title: String, description: String): View {
        val featureView = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(32, 24, 32, 24)
            setBackgroundColor(ContextCompat.getColor(context, R.color.colorWhite))
            
            // Add shadow effect
            elevation = 4f
        }
        
        val titleView = TextView(this).apply {
            text = title
            textSize = 18f
            setTextColor(ContextCompat.getColor(context, R.color.colorPrimary))
            setPadding(0, 0, 0, 8)
        }
        
        val descView = TextView(this).apply {
            text = description
            textSize = 14f
            setTextColor(ContextCompat.getColor(context, R.color.colorTextSecondary))
        }
        
        featureView.addView(titleView)
        featureView.addView(descView)
        
        // Add click listener
        featureView.setOnClickListener {
            when (title) {
                "📸 Photo Monitoring" -> showFeatureInfo("Photo Monitoring", "This feature will allow you to monitor and capture photos from the device camera.")
                "🎤 Audio Recording" -> showFeatureInfo("Audio Recording", "This feature will record audio conversations and ambient sounds.")
                "📍 Location Tracking" -> showFeatureInfo("Location Tracking", "This feature will track the device's location in real-time.")
                "📱 Social Media" -> showFeatureInfo("Social Media Monitoring", "This feature will monitor social media activity and messages.")
                "🔔 Notifications" -> showFeatureInfo("Notification Monitoring", "This feature will capture and monitor all device notifications.")
                "⚙️ Settings" -> showFeatureInfo("Settings", "Configure monitoring preferences and app settings.")
            }
        }
        
        return featureView
    }
    
    private fun showFeatureInfo(title: String, message: String) {
        Toast.makeText(this, "$title: $message", Toast.LENGTH_LONG).show()
    }
}