
package com.reactlibrarynativetoast;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNModuleToastLibraryModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNModuleToastLibraryModule(ReactApplicationContext context) {
    super(context);
    this.reactContext = context;
  }

  @Override
  public String getName() {
    return "RNModuleToastLibrary";
  }

  @ReactMethod
  public void show(String text) {
    Toast.makeText(reactContext, text, Toast.LENGTH_LONG).show();
  }
}