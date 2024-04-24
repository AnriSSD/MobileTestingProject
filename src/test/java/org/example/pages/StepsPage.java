package org.example.pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.example.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class StepsPage {

    AndroidDriver driver;
    WebDriverWait wait;
    private Utils utils;
    private Selectors selectors;
    public StepsPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait
        PageFactory.initElements(driver, this);
        utils = new Utils(driver);
        selectors = new Selectors(driver);
    }

    //Selectors for login
    @FindBy(xpath = "//android.widget.MultiAutoCompleteTextView")
    private WebElement username;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]")
    private WebElement passwordField;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.View[4]")
    private WebElement passwordFieldAfterLogin;
    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.facebook.lite:id/inline_textbox_edittext\"]")
    private WebElement password;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]")
    private WebElement loginBtn;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[1]")
    private WebElement notNowBtn;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
    private WebElement closeLoginErrorMessage;

    //Selectors for registration
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.view.View")
    private WebElement createAccount;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View")
    private WebElement nextButton;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[1]")
    private WebElement nameField;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.View[7]")
    private WebElement nameFieldSecond;
    @FindBy(id = "com.facebook.lite:id/inline_textbox_edittext")
    private WebElement name;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]")
    private WebElement surnameField;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[1]")
    private WebElement surnameFieldSecond;
    @FindBy(id = "com.facebook.lite:id/inline_textbox_edittext")
    private WebElement surname;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.View")
    private WebElement nextButtonFirst;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.View")
    private WebElement nextButtonSecond;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.View[6]")
    private WebElement mobilePhoneField;
    @FindBy(id = "com.facebook.lite:id/inline_textbox_edittext")
    private WebElement mobilePhone;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[2]")
    private WebElement registerWithEmail;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.View[6]")
    private WebElement emailField;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.View[5]")
    private WebElement secondEmailField;
    @FindBy(id = "com.facebook.lite:id/inline_textbox_edittext")
    private WebElement email;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup")
    private WebElement nextButtonThird;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View[5]")
    private WebElement yearOfBirth;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[9]/android.view.View")
    private WebElement birthNumber;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[5]/android.view.ViewGroup[10]")
    private WebElement deleteBirthNumber;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.View[5]")
    private WebElement incorrectBirthNumber;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
    private WebElement nextButtonFourth;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
    private WebElement nextButtonFifth;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.view.ViewGroup")
    private WebElement nextButtonSixth;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.view.View[2]")
    private WebElement chooseGender;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[1]")
    private WebElement newPasswordField;
    @FindBy(id = "com.facebook.lite:id/inline_textbox_edittext")
    private WebElement newPassword;
    //Selectors for main functionality
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[10]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View")
    private WebElement post;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[2]")
    private WebElement publish;
    @FindBy(xpath = "//android.widget.Toast[@text=\"Добавьте что-нибудь и повторите попытку\"]")
    private WebElement textAfterEmptyPublish;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[4]")
    private WebElement choosePhotoForPost;
    @FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.facebook.lite:id/gallery_item_image\"])[1]")
    private WebElement firstPhotoForPost;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[2]")
    private WebElement publishPhotoForPost;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[5]")
    private WebElement tagFriends;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[3]")
    private WebElement chooseFriend;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[4]")
    private WebElement doneBtn;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[6]")
    private WebElement addGeolocation;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup")
    private WebElement chooseGeolocation;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[7]")
    private WebElement feelingsOrActions;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[1]")
    private WebElement chooseFeelingsOrActions;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[2]")
    private WebElement chooseFeeling;


    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[8]")
    private WebElement createEvent;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup[1]")
    private WebElement confidentiality;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[5]/android.view.View[2]")
    private WebElement chooseConfidentiality;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.widget.MultiAutoCompleteTextView[1]")
    private WebElement eventName;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.View[5]")
    private WebElement eventStart;
    @FindBy(xpath = "//android.view.View[@content-desc=\"30 апреля 2024\"]")
    private WebElement eventSelectDate;
    @FindBy(id = "android:id/button1")
    private WebElement okBtn;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.View[6]")
    private WebElement eventEnd;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[2]")
    private WebElement saveEvent;

    @FindBy(xpath = "//android.widget.ImageView")
    private WebElement addStories;
    @FindBy(xpath = "//android.widget.GridView[@resource-id=\"com.facebook.lite:id/header_recycler_view\"]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[1]")
    private WebElement textForStories;
    @FindBy(xpath = "//android.widget.EditText[@text=\"Начните вводить текст\"]")
    private WebElement fillTextInStories;
    @FindBy(xpath = "//android.view.View[@text=\"Поделиться\"]")
    private WebElement publishTextForStories;

    @FindBy(xpath = "//android.widget.GridView[@resource-id=\"com.facebook.lite:id/header_recycler_view\"]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]")
    private WebElement musicForStories;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.view.ViewGroup")
    private WebElement chooseMusicForStories;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[11]")
    private WebElement publishMusicForStories;

    @FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.facebook.lite:id/gallery_item_image\"])[1]")
    private WebElement firstPhotoForStories;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[8]/android.view.View[2]")
    private WebElement drawing;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[6]")
    private WebElement doneBtnSecond;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[11]")
    private WebElement publishPhotoForStories;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup[2]")
    private WebElement yourStories;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[5]/android.view.View[2]")
    private WebElement threeDotsStories;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")
    private WebElement deletePhoto;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")
    private WebElement approveDelete;
    @FindBy(xpath = "//android.widget.Toast[@text=\"Фото удалено\"]")
    private WebElement textAfterDeletePhoto;


    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[4]/android.view.View")
    private WebElement goToMenu;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup")
    private WebElement goToProfile;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup[2]")
    private WebElement editProfile;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.View")
    private WebElement editProfilePhoto;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")
    private WebElement addFrame;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[2]")
    private WebElement frame;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[4]")
    private WebElement updateFrame;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.View[3]")
    private WebElement makePhoto;
    @FindBy(id = "com.android.camera2:id/shutter_button")
    private WebElement shutterBtn;
    @FindBy(id = "com.android.camera2:id/done_button")
    private WebElement doneBtnThird;

    /**
     * The function `fillUsernameWithPassword` fills the username and password fields and with provided values and
     * *optionally clicks a login button.
     *
     * @param user       The `user` parameter is a String that represents the username.
     * @param pass       The `pass` parameter is a String that represents the password.
     * @param clickToBtn is a boolean flag that determines whether to click a login button after filling in the
     *                   username and password fields.
     **/
    public void fillUsernameWithPassword(String user, String pass, boolean clickToBtn) {
        sendkey(user, username);

        try {
            passwordField.click();
        } catch (Exception e) {
            System.out.println("passwordField not found, skip it.");
        }
        password.click();
        sendkey(pass, password);

        if (clickToBtn) {
            // clickToLogin();
            clickToBtn(loginBtn);
        }
    }
    public void clickToBtn(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void sendkey(String txt, WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(txt);
    }
    public void closeNotNow() {
        wait.until(ExpectedConditions.visibilityOf(notNowBtn));
        clickToBtn(notNowBtn);
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
    public void clearField(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
    }

    public void clickRegisterButton() {
        clickToBtn(createAccount);
        clickToBtn(nextButton);
    }
    public void fillOnlyName(String firstField, boolean clickToBtn) {
        nameField.click();
        sendkey(firstField, name);
        if (clickToBtn) {
            // clickToNext();
            clickToBtn(nextButtonFirst);
        }
    }
    public void fillNameSurname(String firstName, String lastName, boolean clickToBtn) {
        nameFieldSecond.click();
        clearField(name);
        sendkey(firstName, name);
        surnameFieldSecond.click();
        sendkey(lastName, surname);
        if (clickToBtn) {
            // clickToNext();
            clickToBtn(nextButtonSecond);
        }
    }
    public void mobileNumber(String number, boolean clickToBtn) {
        mobilePhoneField.click();
        clearField(mobilePhone);
        sendkey(number, mobilePhone);
        if (clickToBtn) {
            // clickToNext();
            clickToBtn(nextButtonThird);
        }
    }
    public void fillIncompleteEmail(String mail, boolean clickToBtn) {
        if (clickToBtn) {
            // clickToSignUp();
            clickToBtn(registerWithEmail);
            wait.until(ExpectedConditions.visibilityOf(emailField));
            emailField.click();
            clearField(email);
            sendkey(mail, email);
            clickToBtn(nextButtonThird);
        }
    }
    public void fillEmail(String number, boolean clickToBtn) {
        if (clickToBtn) {
            clickToBtn(secondEmailField);
            clearField(email);
            sendkey(number, email);
            clickToBtn(nextButtonThird);
        }
    }
    public void gestureClick(boolean clickToBtn) throws InterruptedException {
        yearOfBirth.click();
        WebElement wrongDateBirth = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[1]"));
        driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) wrongDateBirth).getId()
        ));
        Thread.sleep(2000);
        wrongDateBirth.click();
        if (clickToBtn) {
            // clickToNext();
            clickToBtn(nextButtonFourth);
        }
    }
    public void deleteBirth() throws InterruptedException {
        clickToBtn(incorrectBirthNumber);
            Thread.sleep(1000);
            clickToBtn(deleteBirthNumber);
            Thread.sleep(1000);
            clickToBtn(nextButtonFifth);
            clickToBtn(nextButtonSixth);
            }
    public void restart() {
        utils.restartApp();
            }

    public void uploadPhotoPost () throws InterruptedException {
        clickToBtn(post);
    }

    }



