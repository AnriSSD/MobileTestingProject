package org.example.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class StepsPage {

    AndroidDriver driver;
    WebDriverWait wait;

    public StepsPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait (driver, Duration.ofSeconds(10)); // 10 seconds wait
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.MultiAutoCompleteTextView")
    private WebElement username;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]")
    private WebElement passwordField;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.View[4]")
    private WebElement passwordFieldAfterLogin;
    @FindBy (xpath = "//android.widget.EditText[@resource-id=\"com.facebook.lite:id/inline_textbox_edittext\"]")
    private WebElement password;
    @FindBy (xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]")
    private WebElement loginBtn;
    @FindBy (xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
    private WebElement closeLoginErrorMessage;



    /**
     * The function `fillUsernameWithPassword` fills the username and password fields and with provided values and
     * *optionally clicks a login button.
     *
     * @param user       The `user` parameter is a String that represents the username.
     * @param pass       The `pass` parameter is a String that represents the password.
     * @param clickToBtn is a boolean flag that determines whether to click a login button after filling in the
     *                   username and password fields.
     **/

    //ეს მეთოდი ავსებს ინფორმაციას - მომხამრებელს და პაროლს")
    public void fillUsernameWithPassword (String user, String pass, boolean clickToBtn) {
        sendkey(user,username);
        try {
            passwordField.click();
        } catch (Exception e) {
            System.out.println("passwordField not found, skip it.");
        }
        password.click();
        sendkey(pass, password);

        if (clickToBtn) {
            // clickToLogin();
            clickToBtn (loginBtn);
        }
    }
    public void clickToBtn (WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void sendkey (String txt, WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(txt);
        }
    public void closeLoginError() {
        wait.until(ExpectedConditions.visibilityOf(closeLoginErrorMessage));
        closeLoginErrorMessage.click();
    }


    public void clearFields() {
        wait.until(ExpectedConditions.visibilityOf(username));
        clearField(username);
        wait.until(ExpectedConditions.visibilityOf(passwordFieldAfterLogin));
        passwordFieldAfterLogin.click();
        clearField(password);
    }

    private void clearField(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
    }
}
