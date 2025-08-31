package com.github.muneebwanee.dash.ui.activities.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/github/muneebwanee/dash/ui/activities/base/InterfaceView;", "", "showError", "", "message", "", "showMessage", "", "app_debug"})
public abstract interface InterfaceView {
    
    public abstract void showError(@org.jetbrains.annotations.NotNull
    java.lang.String message);
    
    public abstract void showMessage(@org.jetbrains.annotations.NotNull
    java.lang.String message);
    
    public abstract void showMessage(int message);
}