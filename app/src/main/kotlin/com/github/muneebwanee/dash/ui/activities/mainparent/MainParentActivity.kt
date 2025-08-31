package com.github.muneebwanee.dash.ui.activities.mainparent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.muneebwanee.dash.R

class MainParentActivity : AppCompatActivity() {
    
    private lateinit var recyclerView: RecyclerView
    private lateinit var titleTextView: TextView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_parent)
        
        setupViews()
        setupRecyclerView()
    }
    
    private fun setupViews() {
        recyclerView = findViewById(R.id.recyclerView)
        titleTextView = findViewById(R.id.titleTextView)
        titleTextView.text = "KidSafe Parent Dashboard"
    }
    
    private fun setupRecyclerView() {
        val features = listOf(
            "📍 Location Tracking",
            "📞 Call Monitoring", 
            "💬 SMS Monitoring",
            "🎤 Audio Recording",
            "📸 Photo Monitoring",
            "🔑 Keylogger",
            "📱 Social Media",
            "🔔 Notifications",
            "⚙️ Settings"
        )
        
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SimpleAdapter(features)
    }
    
    class SimpleAdapter(private val items: List<String>) : RecyclerView.Adapter<SimpleAdapter.ViewHolder>() {
        
        class ViewHolder(view: android.view.View) : RecyclerView.ViewHolder(view) {
            val textView: TextView = view.findViewById(android.R.id.text1)
        }
        
        override fun onCreateViewHolder(parent: android.view.ViewGroup, viewType: Int): ViewHolder {
            val textView = TextView(parent.context)
            textView.layoutParams = android.view.ViewGroup.LayoutParams(
                android.view.ViewGroup.LayoutParams.MATCH_PARENT,
                android.view.ViewGroup.LayoutParams.WRAP_CONTENT
            )
            textView.setPadding(32, 24, 32, 24)
            textView.textSize = 16f
            return ViewHolder(textView)
        }
        
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.textView.text = items[position]
        }
        
        override fun getItemCount() = items.size
    }
}
