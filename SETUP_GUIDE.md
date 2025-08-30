# 🚀 Dash App Setup Guide

## ✅ Firebase Configuration Complete!

Your Firebase setup is now configured with:
- **Project ID:** `kids-monitoring-app-c6667`
- **Package Name:** `com.github.muneebwanee.dash`
- **Google Maps API Key:** `AIzaSyBALDod2xfPVsIOI8WgGP1OOmz92C064GA`

## 🔧 Next Steps to Complete Setup

### 1. Apply Firebase Security Rules

**Firestore Database Rules:**
1. Go to [Firebase Console](https://console.firebase.google.com/project/kids-monitoring-app-c6667/firestore/rules)
2. Copy and paste the rules from `firebase-rules.md` file
3. Click "Publish"

**Cloud Storage Rules:**
1. Go to [Firebase Console](https://console.firebase.google.com/project/kids-monitoring-app-c6667/storage/rules)
2. Copy and paste the storage rules from `firebase-rules.md` file
3. Click "Publish"

### 2. Enable Firebase Services (if not already done)

1. **Authentication:**
   - Go to Authentication → Sign-in method
   - Enable "Email/Password"

2. **Firestore Database:**
   - Go to Firestore Database
   - Click "Create database" if not already created
   - Choose "Start in test mode"

3. **Cloud Storage:**
   - Go to Storage
   - Click "Get started" if not already created
   - Choose "Start in test mode"

### 3. Build the App

**Option A: Using Android Studio**
1. Open the project in Android Studio
2. Sync project with Gradle files
3. Build → Make Project (Ctrl+F9)
4. Run → Run 'app' (Shift+F10)

**Option B: Using Command Line**
```bash
# If you have Android SDK and Gradle installed
./gradlew assembleDebug

# Or build release version
./gradlew assembleRelease
```

### 4. Install and Test

1. **Install the APK** on your target device
2. **Grant Permissions:**
   - Location permissions
   - Camera permissions
   - Microphone permissions
   - Storage permissions
   - Phone permissions
   - SMS permissions
   - Contacts permissions

3. **Enable Special Permissions (via Settings):**
   - Accessibility Service
   - Notification Listener Service
   - Usage Access
   - Draw Over Other Apps
   - Disable Battery Optimization

### 5. App Usage

**Target Mode (Monitoring):**
- Install on the device you want to monitor
- Use `MainChildActivity` for monitoring setup
- Grant all required permissions

**Parent Mode (Dashboard):**
- Use `MainParentActivity` to view monitoring data
- Login with Firebase authentication
- View calls, messages, locations, photos, etc.

## 📱 App Features

### Monitoring Capabilities:
- 📞 **Call Logging:** Incoming, outgoing, missed calls
- 💬 **SMS Monitoring:** Incoming and outgoing messages
- 📍 **Location Tracking:** Real-time GPS coordinates
- 📸 **Photo Capture:** Front/rear camera photos
- 🎤 **Audio Recording:** Ambient and call recordings
- 📱 **App Usage:** Track which apps are used
- ⌨️ **Keystroke Logging:** Text input monitoring
- 🔔 **Notification Monitoring:** App notifications
- 🌐 **Social Media:** WhatsApp, Instagram, etc.

### Dashboard Features:
- 📊 **Real-time Data:** Live monitoring data
- 🗺️ **Location Map:** Interactive location tracking
- 📸 **Photo Gallery:** Captured photos
- 🎵 **Audio Player:** Recorded audio files
- 📈 **Usage Analytics:** App usage statistics
- 🔒 **Security:** PIN lock protection

## ⚠️ Important Notes

1. **Legal Compliance:** This app is for educational/research purposes only
2. **Consent Required:** Always obtain proper consent before monitoring
3. **Privacy Laws:** Follow applicable privacy regulations (GDPR, CCPA, etc.)
4. **Blaze Plan:** Monitor your Firebase usage to avoid unexpected charges

## 🛠️ Troubleshooting

**Build Issues:**
- Ensure Android SDK is properly installed
- Check that all dependencies are resolved
- Verify Firebase configuration files are in place

**Permission Issues:**
- Some permissions require manual enabling in device settings
- Root access may be needed for certain features
- Modern Android versions have stricter permission requirements

**Firebase Issues:**
- Verify security rules are properly applied
- Check Firebase console for any error messages
- Ensure all required services are enabled

## 📞 Support

If you encounter any issues:
1. Check the Firebase console for error messages
2. Review Android logs for debugging information
3. Ensure all permissions are properly granted
4. Verify Firebase services are enabled and configured

---

**Your Dash app is now ready for research and educational use! 🎉**