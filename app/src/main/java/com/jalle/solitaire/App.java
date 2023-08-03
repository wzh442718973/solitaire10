package com.jalle.solitaire;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.util.TypedValue;

import androidx.annotation.NonNull;

public class App extends Application {

    static App mApp;
    static int ROW = 7;

    static final int HIDDEN_SPACING = 5, V_SHOW_SPACE = 10;

    static int CARD_WIDTH, CARD_HEIGH, CARD_SPACE;


    public static final int DEF_CARD_WIDTH=80, DEF_CARD_HEIGH = 120;

    static float CARD_SCALE = 1.0f;

    static int SPACE_LEFT, SPACE_TOP, SPACE_RIGHT, SPACE_BOOTOM;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
        setType(0);
    }

    public static void setType(int type) {
        switch (type) {
            case Rules.SPIDER:
                ROW = 10;
                break;
            case Rules.FREECELL:
                ROW = 8;
                break;
            case Rules.FORTYTHIEVES:
                ROW = 10;
                break;
            case Rules.SOLITAIRE:
            default:
                ROW = 7;
                break;
        }

        DisplayMetrics dm = mApp.getResources().getDisplayMetrics();
        CARD_SPACE = 3;
        SPACE_LEFT = SPACE_RIGHT = 30;
        SPACE_TOP = 30;

        CARD_WIDTH = (dm.widthPixels - (SPACE_LEFT + SPACE_RIGHT) - ROW * CARD_SPACE * 2) / ROW;
        CARD_SCALE = CARD_WIDTH * 1.0f / DEF_CARD_WIDTH;
        CARD_HEIGH = (int) (CARD_SCALE * DEF_CARD_HEIGH);
    }


    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override
    public void registerComponentCallbacks(ComponentCallbacks callback) {
        super.registerComponentCallbacks(callback);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public AssetManager getAssets() {
        return super.getAssets();
    }
}
