package com.reactnativetest.network;

// Do I need all these imports
// Get the syntax working properly.
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class NetworkModule extends ReactContextBaseJavaModule {

    public  NetworkModule(ReactApplicationContext reactContext) {
        super(reactContext)
    }
}