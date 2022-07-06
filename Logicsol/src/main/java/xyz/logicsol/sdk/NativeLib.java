package xyz.logicsol.sdk;

public class NativeLib {

    // Used to load the 'sdk' library on application startup.
    static {
        System.loadLibrary("sdk");
    }

    /**
     * A native method that is implemented by the 'sdk' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}