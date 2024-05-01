package org.example.tests;

import org.example.Base;
import org.example.pages.StepsPage;
import org.testng.annotations.Test;

public class NegativeTest extends Base {
    @Test(description = "Checks the ability to enter only first name without surname")
    public void test01_OnlyFirstName() {
        StepsPage page = new StepsPage(driver);
        page.clickRegisterButton();
        page.fillOnlyName("Anri", true);
    }

    @Test(description = "Checks the ability to enter special characters in the name and surname field")
    public void test02_SpecialChars() {
        StepsPage page = new StepsPage(driver);
        page.fillNameSurname("!@#", ",,,", true);
    }

    @Test(description = "Checks the ability to enter less than 9 digits in mobile number field")
    public void test03_ShortMobile() {
        StepsPage page = new StepsPage(driver);
        page.mobileNumber("5", true);
    }

    @Test(description = "Checks the ability to enter more than 9 digits in mobile number field")
    public void test04_mobileNumberLongCheck() {
        StepsPage page = new StepsPage(driver);
        page.mobileNumber("59999999999", true);
    }

    @Test(description = "Checks the ability to enter email address without domain name in email field")
    public void test05_emailDomainMissing() {
        StepsPage page = new StepsPage(driver);
        page.fillIncompleteEmail("testappium", true);
    }

    @Test(description = "Checks the ability to enter mobile phone number in email field")
    public void test06_emailPhoneNumberCheck() {
        StepsPage page = new StepsPage(driver);
        page.fillEmail("593712302", true);
    }

    @Test(description = "Fill email address in email field")
    public void test07_emailFieldFill() {
        StepsPage page = new StepsPage(driver);
        page.fillEmail("testappium@gmail.com", true);
    }

    @Test(description = "Checks register with an incorrectly formatted birth year (3 digits instead of 4)")
    public void test08_wrongBirthYear() throws InterruptedException {
        StepsPage page = new StepsPage(driver);
        page.gestureClick(true);
    }

    @Test(description = "Checks register without birth year (0 digits instead of 4)")
    public void test09_noBirthYear() throws InterruptedException {
        StepsPage page = new StepsPage(driver);
        page.deleteBirth();
    }

    @Test(description = "Checks login with correct username and incorrect password")
    public void test10_WrongPassword() throws InterruptedException {
        StepsPage page = new StepsPage(driver);
        page.restart();
        page.fillUsernameWithPassword("haivpmlhhlwrwkgplt@cazlp.com", "Test123", true);
        page.closeLoginError();
        page.clearFields();
    }

    @Test(description = "Fill correct username and correct password")
    public void test11_RightPassword() throws InterruptedException {
        StepsPage page = new StepsPage(driver);
        page.restart();
        page.fillUsernameWithPassword("haivpmlhhlwrwkgplt@cazlp.com", "Qatest123", true);
        page.closeNotNow();
    }

    @Test(description = "Checks the possibility of publishing photos")
    public void test12_UploadPhoto() throws InterruptedException {
        StepsPage page = new StepsPage(driver);
        page.uploadPhotoPost();
    }

    @Test(description = "Checks the possibility of friends tagging")
    public void test13_TagFriend() throws InterruptedException {
        StepsPage page = new StepsPage(driver);
        page.restart();
        page.tagFriend();
    }

    @Test(description = "Checks the possibility of geolocation posting")
    public void test14_PostGeolocation() throws InterruptedException {
        StepsPage page = new StepsPage(driver);
        page.restart();
        page.postGeolocation();
    }
    @Test(description = "Checks the possibility of feelings/actions posting")
    public void test15_PostFeelings() throws InterruptedException {
        StepsPage page = new StepsPage(driver);
        page.restart();
        page.postFeelings();
    }
    @Test(description = "Checks the possibility of events posting")
    public void test16_PostEvent() throws InterruptedException {
        StepsPage page = new StepsPage(driver);
        page.restart();
        page.postEvent("123");
    }

    @Test(description = "Checks the possibility of posting text in stories")
    public void test17_PostTextStories() {
        StepsPage page = new StepsPage(driver);
        page.textStories("testtest");
    }

    @Test(description = "Checks the possibility of posting music in stories")
    public void test18_PostMusicStories() throws InterruptedException {
        StepsPage page = new StepsPage(driver);
        page.musicStories();
    }

    @Test(description = "Checks the possibility of posting photo with brush stroke in stories")
    public void test19_DrawingStories() throws InterruptedException {
        StepsPage page = new StepsPage(driver);
        page.restart();
        page.drawingInStories();
    }

    @Test (description = "Checks the possibility of posting photo in stories")
    public void test20_PostPhotoStories() throws InterruptedException {
        StepsPage page = new StepsPage(driver);
        page.photoStories();
    }

    @Test (description = "Checks the possibility of deleting stories")
    public void test21_DeleteStories() {
        StepsPage page = new StepsPage(driver);
        page.deleteStories();
    }

    @Test (description = "Checks the ability to open a profile photo")
    public void test22_CheckPhoto() {
        StepsPage page = new StepsPage(driver);
        page.back();
        page.checkPhoto();
    }
    @Test (description = "Checks the ability to update profile frame")
    public void test23_UpdateFrame() {
        StepsPage page = new StepsPage(driver);
        page.back();
        page.addFrame();
    }
    @Test (description = "Checks the ability to save post in favorites")
    public void test24_SavePost() throws InterruptedException {
        StepsPage page = new StepsPage(driver);
        page.restart();
        page.addToFav();
    }

}

    /*
    I'll temporarily comment out this code, because after many runs of test, Facebook no longer allows me to enter
    the wrong password - it send me to account recovery.
    But it works, be sure :3

    @Test (description = "Checks login with phone number without country code and correct password")
    public void secondLoginWrongUser () {
        StepsPage page = new StepsPage(driver);
        page.fillUsernameWithPassword ("574054408", "Test123", true);
        page.closeLoginError();
        page.clearFields();
    }
     */

