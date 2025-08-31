package com.github.muneebwanee.dash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    
    private lateinit var recyclerView: RecyclerView
    private lateinit var fab: FloatingActionButton
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        recyclerView = findViewById(R.id.recyclerView)
        fab = findViewById(R.id.fab)
        
        setupRecyclerView()
        setupFab()
    }
    
    private fun setupRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        val features = listOf(
            "📞 Calls Monitoring",
            "💬 SMS Monitoring", 
            "🎤 Audio Recording",
            "📸 Photo Capture",
            "⌨️ Keylogger",
            "🔔 Notifications",
            "📱 Social Media",
            "⚙️ Settings"
        )
        
        val adapter = FeatureAdapter(features) { feature ->
            Snackbar.make(recyclerView, "Selected: $feature", Snackbar.LENGTH_SHORT).show()
        }
        recyclerView.adapter = adapter
    }
    
    private fun setupFab() {
        fab.setOnClickListener {
            Snackbar.make(it, "Monitoring features will be implemented here", Snackbar.LENGTH_LONG).show()
        }
    }
}

class FeatureAdapter(
    private val features: List<String>,
    private val onItemClick: (String) -> Unit
) : RecyclerView.Adapter<FeatureAdapter.ViewHolder>() {
    
    class ViewHolder(val textView: android.widget.TextView) : RecyclerView.ViewHolder(textView)
    
    override fun onCreateViewHolder(parent: android.view.ViewGroup, viewType: Int): ViewHolder {
        val textView = android.widget.TextView(parent.context).apply {
            layoutParams = android.view.ViewGroup.LayoutParams(
                android.view.ViewGroup.LayoutParams.MATCH_PARENT,
                android.view.ViewGroup.LayoutParams.WRAP_CONTENT
            )
            setPadding(32, 32, 32, 32)
            textSize = 16f
        }
        return ViewHolder(textView)
    }
    
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = features[position]
        holder.textView.setOnClickListener { onItemClick(features[position]) }
    }
    
    override fun getItemCount() = features.size
}