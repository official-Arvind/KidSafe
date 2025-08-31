package com.github.muneebwanee.dash.ui.activities.login;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/github/muneebwanee/dash/ui/activities/login/InteractorLogin;", "V", "Lcom/github/muneebwanee/dash/ui/activities/login/InterfaceViewLogin;", "Lcom/github/muneebwanee/dash/ui/activities/login/InterfaceInteractorLogin;", "()V", "view", "Lcom/github/muneebwanee/dash/ui/activities/login/InterfaceViewLogin;", "onAttach", "", "(Lcom/github/muneebwanee/dash/ui/activities/login/InterfaceViewLogin;)V", "onDetach", "signInDisposable", "email", "", "pass", "app_debug"})
public final class InteractorLogin<V extends com.github.muneebwanee.dash.ui.activities.login.InterfaceViewLogin> implements com.github.muneebwanee.dash.ui.activities.login.InterfaceInteractorLogin<V> {
    @org.jetbrains.annotations.Nullable
    private V view;
    
    public InteractorLogin() {
        super();
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    V view) {
    }
    
    @java.lang.Override
    public void onDetach() {
    }
    
    @java.lang.Override
    public void signInDisposable(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String pass) {
    }
}