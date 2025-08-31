package com.github.muneebwanee.dash.ui.activities.mainchild

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.github.muneebwanee.dash.R

class MainChildActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_child)
        
        val titleTextView = findViewById<TextView>(R.id.titleTextView)
        titleTextView.text = "Child Device Active"
    }
}
