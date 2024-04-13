package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    public static AndroidDriver driver;

    public static Config conf = Config.getInstance();

    public static void main(String[] args) throws MalformedURLException {

        setUp(); // ვქმნით დრაივერს.
        tearDown(); //ვხურავთ დრაივერს
    }

    // Setup
    @BeforeSuite
    public static void setUp() throws MalformedURLException {
        System.out.println("დავიწყე კავშირის დამყარება");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appium:automationName", "UiAutomator2"); // განვსაზღრეთ დრაივერის ტიპი.
        cap.setCapability("appium:udid", conf.read("udid")); // განვსაზღრეთ  მოწყობილობა
        cap.setCapability("appium:appPackage", conf.read("appPackage")); // განვსაზღრეთ აპლიკაციის ფექიჯის სახელი
        cap.setCapability("appium:appActivity", conf.read("appActivity")); // განვსაზღრეთ აპლიკაციის ექთივითი

        cap.setCapability("appium:skipUnlock", true); // მოვხსენით ბლოკი
        cap.setCapability("appium:noReset", true); // რესეთისგან თავის აცილება.
        cap.setCapability("appium:autoGrantPermissions", true); //  წვდომების მიცემა შესაბამის მოთხოვნებზე
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
        System.out.println("დავასრულე კავშირის დამყარება");
    }

    //Driver cancellation if it exists
    @AfterSuite
    public static void tearDown() {
        System.out.println("დავიწყე დრაივერის შემოწმება");
        if (driver != null) {
            System.out.println("დავიწყე დრივერის გაუქმება");
            driver.quit();
            System.out.println("დრაივერი გაუქმებულია");
        }
    }
}