package com.github.muneebwanee.dash.ui.activities.mainparent;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0014J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\b\u0010\u001c\u001a\u00020\tH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0002J\b\u0010\u001e\u001a\u00020\tH\u0002J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020!H\u0016J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/github/muneebwanee/dash/ui/activities/mainparent/MainParentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/github/muneebwanee/dash/ui/activities/mainparent/InterfaceViewMainParent;", "()V", "interactor", "Lcom/github/muneebwanee/dash/ui/activities/mainparent/InteractorMainParent;", "titleTextView", "Landroid/widget/TextView;", "loadFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "title", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onDestroy", "onErrorLogout", "message", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onSuccessLogout", "setupInteractor", "setupToolbar", "setupViews", "showError", "showMessage", "", "app_release"})
public final class MainParentActivity extends androidx.appcompat.app.AppCompatActivity implements com.github.muneebwanee.dash.ui.activities.mainparent.InterfaceViewMainParent {
    private android.widget.TextView titleTextView;
    private com.github.muneebwanee.dash.ui.activities.mainparent.InteractorMainParent<com.github.muneebwanee.dash.ui.activities.mainparent.InterfaceViewMainParent> interactor;
    
    public MainParentActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViews() {
    }
    
    private final void setupInteractor() {
    }
    
    private final void setupToolbar() {
    }
    
    private final void loadFragment(androidx.fragment.app.Fragment fragment, java.lang.String title) {
    }
    
    @java.lang.Override
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public void onSuccessLogout() {
    }
    
    @java.lang.Override
    public void onErrorLogout(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @java.lang.Override
    public void showError(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @java.lang.Override
    public void showMessage(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @java.lang.Override
    public void showMessage(int message) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}