package com.github.muneebwanee.dash.ui.activities.login;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/github/muneebwanee/dash/ui/activities/login/InterfaceViewLogin;", "Lcom/github/muneebwanee/dash/ui/activities/base/InterfaceView;", "onErrorLogin", "", "message", "", "onSuccessLogin", "app_debug"})
public abstract interface InterfaceViewLogin extends com.github.muneebwanee.dash.ui.activities.base.InterfaceView {
    
    public abstract void onSuccessLogin();
    
    public abstract void onErrorLogin(@org.jetbrains.annotations.NotNull
    java.lang.String message);
}