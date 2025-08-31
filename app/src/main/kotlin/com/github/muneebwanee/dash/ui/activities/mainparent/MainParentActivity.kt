package com.github.muneebwanee.dash.ui.activities.mainparent

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.github.muneebwanee.dash.R
import com.github.muneebwanee.dash.ui.fragments.maps.MapsFragment
import com.github.muneebwanee.dash.ui.fragments.calls.CallsFragment
import com.github.muneebwanee.dash.ui.fragments.message.MessageFragment
import com.github.muneebwanee.dash.ui.fragments.recording.RecordingFragment
import com.github.muneebwanee.dash.ui.fragments.photo.PhotoFragment
import com.github.muneebwanee.dash.ui.fragments.keylog.KeysFragment
import com.github.muneebwanee.dash.ui.fragments.notifications.NotifyMessageFragment
import com.github.muneebwanee.dash.ui.fragments.social.SocialFragment
import com.github.muneebwanee.dash.ui.fragments.setting.SettingFragment

class MainParentActivity : AppCompatActivity(), InterfaceViewMainParent {
    
    private lateinit var titleTextView: TextView
    private lateinit var interactor: InteractorMainParent<InterfaceViewMainParent>
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_parent)
        
        setupViews()
        setupInteractor()
        setupToolbar()
        
        // Start with location fragment
        loadFragment(MapsFragment(), "Location")
    }
    
    private fun setupViews() {
        titleTextView = findViewById(R.id.titleTextView)
    }
    
    private fun setupInteractor() {
        interactor = InteractorMainParent()
        interactor.onAttach(this)
    }
    
    private fun setupToolbar() {
        supportActionBar?.title = "KidSafe Monitoring"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    
    private fun loadFragment(fragment: Fragment, title: String) {
        titleTextView.text = title
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
    
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            R.id.action_logout -> {
                interactor.signOut()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
    
    override fun onSuccessLogout() {
        finish()
    }
    
    override fun onErrorLogout(message: String) {
        // Handle logout error
    }
    
    override fun showError(message: String) {
        // Handle error
    }
    
    override fun showMessage(message: String) {
        // Handle message
    }
    
    override fun showMessage(message: Int) {
        // Handle message
    }
    
    override fun onDestroy() {
        interactor.onDetach()
        super.onDestroy()
    }
}
