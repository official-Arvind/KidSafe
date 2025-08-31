#!/bin/bash

# KidSafe Release Creation Script
# This script helps create a GitHub release with APK files

echo "🎉 KidSafe v1.0.1 Release Creation Script"
echo "=========================================="

# Check if APK files exist
if [ ! -f "releases/KidSafe-v1.0.1-debug.apk" ]; then
    echo "❌ Debug APK not found!"
    exit 1
fi

if [ ! -f "releases/KidSafe-v1.0.1-release.apk" ]; then
    echo "❌ Release APK not found!"
    exit 1
fi

echo "✅ APK files found:"
echo "   - Debug APK: $(ls -lh releases/KidSafe-v1.0.1-debug.apk | awk '{print $5}')"
echo "   - Release APK: $(ls -lh releases/KidSafe-v1.0.1-release.apk | awk '{print $5}')"

echo ""
echo "📋 To create the GitHub release, follow these steps:"
echo ""
echo "1. Go to your GitHub repository: https://github.com/official-Arvind/KidSafe"
echo "2. Click on 'Releases' in the right sidebar"
echo "3. Click 'Create a new release'"
echo "4. Select tag: v1.0.1"
echo "5. Title: KidSafe v1.0.1 - Fixed Build Issues"
echo "6. Copy the content from RELEASE_NOTES.md for the description"
echo "7. Upload the APK files:"
echo "   - releases/KidSafe-v1.0.1-debug.apk"
echo "   - releases/KidSafe-v1.0.1-release.apk"
echo "8. Click 'Publish release'"
echo ""
echo "🎯 The release will be available at:"
echo "   https://github.com/official-Arvind/KidSafe/releases/tag/v1.0.1"
echo ""
echo "📱 Users can then download and install the APK files directly!"
echo ""
echo "💡 Alternative: You can also download the APK files directly from the repository:"
echo "   - Debug: https://github.com/official-Arvind/KidSafe/blob/main/releases/KidSafe-v1.0.1-debug.apk"
echo "   - Release: https://github.com/official-Arvind/KidSafe/blob/main/releases/KidSafe-v1.0.1-release.apk"