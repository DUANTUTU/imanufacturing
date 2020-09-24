package com.lenovo.manufacture.Util;

import android.app.Application;

import org.litepal.LitePal;

public class InitApp extends Application {
    public static InitApp instance;

    public InitApp() {
        instance = this;
        LitePal.initialize(this);
    }
}
