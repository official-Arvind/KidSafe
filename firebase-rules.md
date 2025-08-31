# Firebase Security Rules

## Firestore Database Rules
Copy and paste these rules into your Firebase Console → Firestore Database → Rules:

```javascript
rules_version = '2';
service cloud.firestore {
  match /databases/{database}/documents {
    // Allow authenticated users to read/write their own data
    match /users/{userId} {
      allow read, write: if request.auth != null && request.auth.uid == userId;
    }
    
    // Allow access to device data for authenticated users
    match /devices/{deviceId} {
      allow read, write: if request.auth != null;
    }
    
    // Allow access to monitoring data for authenticated users
    match /calls/{callId} {
      allow read, write: if request.auth != null;
    }
    
    match /messages/{messageId} {
      allow read, write: if request.auth != null;
    }
    
    match /locations/{locationId} {
      allow read, write: if request.auth != null;
    }
    
    match /photos/{photoId} {
      allow read, write: if request.auth != null;
    }
    
    match /recordings/{recordingId} {
      allow read, write: if request.auth != null;
    }
    
    match /notifications/{notificationId} {
      allow read, write: if request.auth != null;
    }
    
    match /keystrokes/{keystrokeId} {
      allow read, write: if request.auth != null;
    }
    
    // Allow access to app usage data
    match /appUsage/{usageId} {
      allow read, write: if request.auth != null;
    }
    
    // Allow access to social media data
    match /social/{socialId} {
      allow read, write: if request.auth != null;
    }
  }
}
```

## Cloud Storage Rules
Copy and paste these rules into your Firebase Console → Storage → Rules:

```javascript
service firebase.storage {
  match /b/{bucket}/o {
    // Allow authenticated users to upload/download files
    match /users/{userId}/{allPaths=**} {
      allow read, write: if request.auth != null && request.auth.uid == userId;
    }
    
    // Allow access to monitoring files for authenticated users
    match /photos/{photoId} {
      allow read, write: if request.auth != null;
    }
    
    match /recordings/{recordingId} {
      allow read, write: if request.auth != null;
    }
    
    match /calls/{callId} {
      allow read, write: if request.auth != null;
    }
    
    // Allow access to any file for authenticated users (for research purposes)
    match /{allPaths=**} {
      allow read, write: if request.auth != null;
    }
  }
}
```

## How to Apply These Rules:

1. **For Firestore Database:**
   - Go to Firebase Console → Firestore Database → Rules
   - Replace existing rules with the Firestore rules above
   - Click "Publish"

2. **For Cloud Storage:**
   - Go to Firebase Console → Storage → Rules
   - Replace existing rules with the Storage rules above
   - Click "Publish"

## Notes:
- These rules allow any authenticated user to access all data (suitable for research/personal use)
- For production use, you would want more restrictive rules
- The rules are designed to work with the Dash app's data structure