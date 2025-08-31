package com.github.muneebwanee.dash.ui.activities.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/github/muneebwanee/dash/ui/activities/base/InterfaceInteractor;", "V", "Lcom/github/muneebwanee/dash/ui/activities/base/InterfaceView;", "", "onAttach", "", "view", "(Lcom/github/muneebwanee/dash/ui/activities/base/InterfaceView;)V", "onDetach", "app_debug"})
public abstract interface InterfaceInteractor<V extends com.github.muneebwanee.dash.ui.activities.base.InterfaceView> {
    
    public abstract void onAttach(@org.jetbrains.annotations.NotNull
    V view);
    
    public abstract void onDetach();
}