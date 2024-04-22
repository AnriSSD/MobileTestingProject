package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Utils {


    protected AndroidDriver driver;
    public Utils (AndroidDriver driver) {
        this.driver = driver;
    }
    public void androidBack() {
        driver.pressKey (new KeyEvent(AndroidKey.BACK));
    }
    public void closeApp() {
        driver.terminateApp("com.facebook.lite");
    }
}
