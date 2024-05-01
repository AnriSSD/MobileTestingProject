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
import java.util.HashMap;

public class StepsPage {

    AndroidDriver driver;
    WebDriverWait wait;
    private Utils utils;

    public StepsPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait
        PageFactory.initElements(driver, this);
        utils = new Utils(driver);
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
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
    private WebElement post;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[2]")
    private WebElement publish;
    @FindBy(xpath = "//android.widget.Toast[@text=\"Добавьте что-нибудь и повторите попытку\"]")
    private WebElement textAfterEmptyPublish;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[4]")
    private WebElement choosePhotoForPost;
    @FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.facebook.lite:id/gallery_item_image\"])[1]")
    private WebElement firstPhotoForPost;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[2]")
    private WebElement publishPhotoForPost;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[5]")
    private WebElement tagFriends;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[5]")
    private WebElement tagFriendsSecond;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[3]")
    private WebElement chooseFriend;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[4]")
    private WebElement doneBtn;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[6]")
    private WebElement addGeolocation;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[6]")
    private WebElement addGeolocationSecond;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup")
    private WebElement chooseGeolocation;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[7]")
    private WebElement feelingsOrActions;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[1]")
    private WebElement chooseFeelingsOrActions;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[2]")
    private WebElement chooseFeeling;


    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[8]")
    private WebElement createEvent;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[8]")
    private WebElement createEventSecond;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[2]")
    private WebElement confidentiality;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
    private WebElement chooseConfidentiality;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView[1]")
    private WebElement eventName;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.View[4]")
    private WebElement eventStart;
    @FindBy(xpath = "//android.view.View[@content-desc=\"31 мая 2024\"]")
    private WebElement eventSelectDate;
    @FindBy(id = "android:id/button1")
    private WebElement okBtn;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.View[5]")
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
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup")
    private WebElement chooseBackgroundForStories;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[11]")
    private WebElement publishMusicForStories;

    @FindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.facebook.lite:id/gallery_item_image\"])[1]")
    private WebElement firstPhotoForStories;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[8]")
    private WebElement drawing;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[6]")
    private WebElement doneBtnSecond;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[11]")
    private WebElement publishDrawingForStories;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[12]")
    private WebElement publishPhotoForStories;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup[2]")
    private WebElement yourStories;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[5]")
    private WebElement threeDotsStories;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")
    private WebElement deleteStories;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")
    private WebElement approveDelete;
    @FindBy(xpath = "//android.widget.Toast[@text=\"Фото удалено\"]")
    private WebElement textAfterDeletePhoto;


    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[4]/android.view.View")
    private WebElement goToMenu;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup")
    private WebElement goToProfile;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup[2]")
    private WebElement editProfile;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.View")
    private WebElement editProfilePhoto;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]")
    private WebElement checkProfilePhoto;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")
    private WebElement addFrame;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[2]")
    private WebElement frame;
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[4]/android.view.ViewGroup[4]")
    private WebElement updateFrame;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.View")
    private WebElement threeDotsPost;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.view.ViewGroup")
    private WebElement savePost;
    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup[8]")
    private WebElement favorites;


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
    /**
     * Waits for an element to be clickable and then clicks it.
     * @param element The web element to be clicked.
     */
    public void clickToBtn(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    /**
     * Waits for an element to be visible and then sends the specified text to it.
     * @param txt The text to be entered.
     * @param element The web element that will receive the text.
     */
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
    // Clear input fields (username and password)
    public void clearFields() {
        wait.until(ExpectedConditions.visibilityOf(username));
        clearField(username);
        wait.until(ExpectedConditions.visibilityOf(passwordFieldAfterLogin));
        passwordFieldAfterLogin.click();
        clearField(password);
    }
    /**
     * Clears the text from a specified web element.
     * @param element The web element whose text will be cleared.
     */
    public void clearField(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
    }

    public void clickRegisterButton() {
        clickToBtn(createAccount);
        clickToBtn(nextButton);
    }
    /**
     * Fills in only the name field and optionally clicks the next button.
     * @param firstField The name to be entered.
     * @param clickToBtn If true, the next button will be clicked.
     */
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
    /**
     * Performs a gesture click on the year of birth element and optionally clicks the next button.
     * @param clickToBtn If true, the next button will be clicked after the gesture.
     * @throws InterruptedException If the thread is interrupted while sleeping.
     */
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

    public void restart() throws InterruptedException {
        utils.restartApp();
    }

    public void back() {
        utils.androidBack();
    }

    public void uploadPhotoPost() throws InterruptedException {
        Thread.sleep(1000);
        clickToBtn(post);
        clickToBtn(choosePhotoForPost);
        clickToBtn(firstPhotoForPost);
        clickToBtn(publishPhotoForPost);
        Thread.sleep(2000);
    }
    /**
     * Tags a friend in a post. The method waits before each action to ensure that the UI has time to update.
     * It attempts to click the 'tag friends' button, and if not found, tries an alternative button.
     * After successfully tagging, it finalizes the action by clicking the 'done' and 'publish' buttons.
     */
    public void tagFriend() throws InterruptedException {
        Thread.sleep(2000);
        clickToBtn(post);
        Thread.sleep(2000);
        boolean isTagged = false;
        try {
            tagFriends.click();
            isTagged = true;
        } catch (Exception e) {
            System.out.println("tagFriends not found, trying tagFriendsSecond.");
        }
        if (!isTagged) {
            tagFriendsSecond.click();
        }
        clickToBtn(chooseFriend);
        clickToBtn(doneBtn);
        clickToBtn(publish);
        Thread.sleep(2000);
    }

    public void postGeolocation() throws InterruptedException {
        Thread.sleep(2000);
        clickToBtn(post);
        Thread.sleep(2000);
        boolean isTagged = false;
        try {
            addGeolocation.click();
            isTagged = true;
        } catch (Exception e) {
            System.out.println("addGeolocation not found, trying addGeolocationSecond");
        }
        if (!isTagged) {
            addGeolocationSecond.click();
        }
        clickToBtn(chooseGeolocation);
        clickToBtn(publish);
    }

    public void postFeelings() throws InterruptedException {
        Thread.sleep(2000);
        clickToBtn(post);
        clickToBtn(feelingsOrActions);
        clickToBtn(chooseFeelingsOrActions);
        clickToBtn(chooseFeeling);
        clickToBtn(publish);
        Thread.sleep(2000);
    }

    public void postEvent(String name) throws InterruptedException {
        Thread.sleep(2000);
        clickToBtn(post);
        Thread.sleep(2000);
        boolean isTagged = false;
        try {
            createEvent.click();
            isTagged = true;
        } catch (Exception e) {
            System.out.println("createEvent not found, trying createEventSecond");
        }
        if (!isTagged) {
            createEventSecond.click();
        }
        clickToBtn(confidentiality);
        clickToBtn(chooseConfidentiality);
        sendkey(name, eventName);
        clickToBtn(eventStart);
        clickToBtn(eventSelectDate);
        clickToBtn(okBtn);
        clickToBtn(eventEnd);
        clickToBtn(saveEvent);
        Thread.sleep(2000);
        clickToBtn(saveEvent);
    }

    public void textStories(String txt) {
        clickToBtn(addStories);
        clickToBtn(textForStories);
        sendkey(txt, fillTextInStories);
        clickToBtn(publishTextForStories);
    }

    public void musicStories() throws InterruptedException {
        Thread.sleep(2000);
        clickToBtn(addStories);
        clickToBtn(musicForStories);
        clickToBtn(chooseMusicForStories);
        clickToBtn(chooseBackgroundForStories);
        clickToBtn(publishMusicForStories);
        Thread.sleep(2000);
    }
    /**
     * Adds a drawing to a story. This method opens the story creation interface, selects the first photo,
     * initiates the drawing tool, and performs a swipe gesture to create a drawing. After a delay for the drawing
     * to be processed, it finalizes the action by publishing the drawing to the stories.
     */
    public void drawingInStories() throws InterruptedException {
        Thread.sleep(2000);
        clickToBtn(addStories);
        clickToBtn(firstPhotoForStories);
        clickToBtn(drawing);
        Thread.sleep(2000);
        WebElement swipeElement = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"com.facebook.lite:id/main_layout\"]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.View"));
        String elementId = ((RemoteWebElement) swipeElement).getId();
        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", elementId,
                "direction", "left",
                "percent", 0.75 //
        ));
        clickToBtn(doneBtnSecond);
        Thread.sleep(2000);
        clickToBtn(publishDrawingForStories);
    }

    public void photoStories() throws InterruptedException {
        Thread.sleep(3000);
        clickToBtn(addStories);
        clickToBtn(firstPhotoForStories);
        Thread.sleep(2000);
        clickToBtn(publishPhotoForStories);
    }

    public void deleteStories() {
        clickToBtn(yourStories);
        clickToBtn(threeDotsStories);
        clickToBtn(deleteStories);
        clickToBtn(approveDelete);
    }

    public void checkPhoto() {
        clickToBtn(goToMenu);
        clickToBtn(goToProfile);
        clickToBtn(editProfile);
        clickToBtn(editProfilePhoto);
        clickToBtn(checkProfilePhoto);
    }

    public void addFrame() {
        clickToBtn(editProfilePhoto);
        clickToBtn(addFrame);
        clickToBtn(frame);
        clickToBtn(updateFrame);
    }

    public void addToFav() {
        clickToBtn(threeDotsPost);
        clickToBtn(savePost);
        back();
        clickToBtn(goToMenu);
        clickToBtn(favorites);
        System.out.println("It's all, thank u!");
    }
}

