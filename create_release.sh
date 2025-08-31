#!/bin/bash

# KidSafe Release Creation Script
# This script helps create a GitHub release with APK files

echo "🎉 KidSafe v1.0.1 Release Creation Script"
echo "=========================================="

# Check if APK files exist
if [ ! -f "app/build/outputs/apk/debug/app-debug.apk" ]; then
    echo "❌ Debug APK not found!"
    exit 1
fi

if [ ! -f "app/build/outputs/apk/release/app-release.apk" ]; then
    echo "❌ Release APK not found!"
    exit 1
fi

echo "✅ APK files found:"
echo "   - Debug APK: $(ls -lh app/build/outputs/apk/debug/app-debug.apk | awk '{print $5}')"
echo "   - Release APK: $(ls -lh app/build/outputs/apk/release/app-release.apk | awk '{print $5}')"

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
echo "   - app/build/outputs/apk/debug/app-debug.apk"
echo "   - app/build/outputs/apk/release/app-release.apk"
echo "8. Click 'Publish release'"
echo ""
echo "🎯 The release will be available at:"
echo "   https://github.com/official-Arvind/KidSafe/releases/tag/v1.0.1"
echo ""
echo "📱 Users can then download and install the APK files directly!"