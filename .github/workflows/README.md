# GitHub Actions Workflow

## Android CI/CD Pipeline

This workflow automatically builds and releases APKs for the Dash app.

### Triggers

The workflow runs on:
- **Push** to `main` or `develop` branches
- **Pull Request** to `main` branch  
- **Release** creation (publishes APK)

### What it does

1. **Build Job:**
   - Sets up Java 17 and Android SDK
   - Caches Gradle dependencies for faster builds
   - Generates a keystore for signing release APKs
   - Builds both debug and release APKs
   - Uploads APKs as artifacts

2. **Release Job:**
   - Downloads the release APK artifact
   - Creates a GitHub release with the APK attached
   - Includes build information and installation instructions

### Manual Release

To create a release manually:

1. Go to your GitHub repository
2. Click "Releases" in the right sidebar
3. Click "Create a new release"
4. Choose a tag (e.g., `v1.0.0`)
5. Add release notes
6. Click "Publish release"

The workflow will automatically:
- Build the APK
- Attach it to the release
- Make it available for download

### Build Artifacts

After each build, you can download:
- **Debug APK**: For testing and development
- **Release APK**: For production distribution

### Keystore

The workflow generates a temporary keystore for signing release APKs. For production releases, you should:

1. Generate your own keystore
2. Add it as a GitHub secret
3. Update the workflow to use your keystore

### Firebase Configuration

The workflow uses the Firebase configuration from:
- `app/google-services.json`
- `local.properties` (for API keys)

Make sure these files are properly configured before running the workflow.