package com.reactnativetest.network;

//  What do all of these do?
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Network Package
// This package gets exported to the react document. 
// This file just imports our module and instantiates it.
// How does it connect to the NetworkModule.java file? 
// See line 30...

// Found at: android/app/src/main/java/com/reactnativetest/network 
public class NetworkPackage implements ReactPackage {
    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
       return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        // We import the module file here
        // This is where our NetworkModule gets the reactContext
        modules.add(new NetworkModule(reactContext));
        return modules;
    }

    // Backward Compatibility.. not sure why this is needed
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return new ArrayList<>();
    }
}