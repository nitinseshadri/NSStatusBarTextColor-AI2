package com.nitinseshadri.aix.NSStatusBarTextColor;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.app.Activity;

import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.runtime.util.*;

@DesignerComponent(version = NSStatusBarTextColor.VERSION,
    description = "by nitinseshadri",
    category = ComponentCategory.EXTENSION,
    nonVisible = true)

@SimpleObject(external = true)

public class NSStatusBarTextColor extends AndroidNonvisibleComponent
implements Component {
    public static final int VERSION = 1;
    private ComponentContainer container;
    private Context context;
    private final Activity activity;
    private static final String LOG_TAG = "NSStatusBarTextColor";
    public NSStatusBarTextColor(ComponentContainer container) {
        super(container.$form());
        this.container = container;
        activity = (Activity) container.$context();
        context = (Context) container.$context();
        Log.d(LOG_TAG, "NSStatusBarTextColor Created");
    }
    
    @SimpleFunction(description = "Change Status Bar Text Color to Dark")
    public void StatusBarTextColorDark() {
      try {
        View v1 = activity.getWindow().getDecorView().getRootView();
        v1.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_‌​BAR);
        Log.d(LOG_TAG, "Status bar text color changed to Dark");
      } catch (Throwable e) {
        Log.e(LOG_TAG, e.getMessage(), e);
        e.printStackTrace();
      }
    }
}