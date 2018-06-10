package com.reactnativetest.network;

// Do I need all these imports
// Get Java syntax working properly
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class NetworkModule extends ReactContextBaseJavaModule {

    public NetworkModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    // Mandatory function getName that specifies the module name
    @Override // look up @Override, what does it do?
    public String getName() {
        return "Network";
    }

    // Custom Functions for Export: //
    // https://facebook.github.io/react-native/docs/native-modules-android.html

    // This is a test function, remove
    @ReactMethod
    public void getDeviceName(Callback, cb) {
        try {
            cb.invoke(null, android.os.Build.MODEL)
        } catch (Exception e) {
            cb.invoke(e.toString(), null);
        }
    }
}