package com.github.muneebwanee.dash.ui.activities.login;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0014J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001bH\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/github/muneebwanee/dash/ui/activities/login/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/github/muneebwanee/dash/ui/activities/login/InterfaceViewLogin;", "()V", "emailEditText", "Landroid/widget/EditText;", "interactor", "Lcom/github/muneebwanee/dash/ui/activities/login/InteractorLogin;", "loginButton", "Landroid/widget/Button;", "passwordEditText", "signUpTextView", "Landroid/widget/TextView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onErrorLogin", "message", "", "onSuccessLogin", "setupClickListeners", "setupInteractor", "setupViews", "showError", "showMessage", "", "app_release"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity implements com.github.muneebwanee.dash.ui.activities.login.InterfaceViewLogin {
    private android.widget.EditText emailEditText;
    private android.widget.EditText passwordEditText;
    private android.widget.Button loginButton;
    private android.widget.TextView signUpTextView;
    private com.github.muneebwanee.dash.ui.activities.login.InteractorLogin<com.github.muneebwanee.dash.ui.activities.login.InterfaceViewLogin> interactor;
    
    public LoginActivity() {
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
    
    private final void setupClickListeners() {
    }
    
    @java.lang.Override
    public void onSuccessLogin() {
    }
    
    @java.lang.Override
    public void onErrorLogin(@org.jetbrains.annotations.NotNull
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