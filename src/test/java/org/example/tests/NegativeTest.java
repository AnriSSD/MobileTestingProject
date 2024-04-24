package org.example.tests;

import org.example.Base;
import org.example.pages.Selectors;
import org.example.pages.StepsPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NegativeTest extends Base {
    @Test (description = "Checks the ability to enter only first name without surname")
    public void test01_OnlyFirstName () {
        StepsPage page = new StepsPage(driver);
        page.clickRegisterButton();
        page.fillOnlyName("Anri",true);
    }
    @Test (description = "Checks the ability to enter special characters in the name and surname field")
    public void test02_SpecialChars () {
        StepsPage page = new StepsPage(driver);
        page.fillNameSurname("!@#", ",,,", true);
    }

    @Test (description = "Checks the ability to enter less than 9 digits in mobile number field")
    public void test03_ShortMobile () {
        StepsPage page = new StepsPage(driver);
        page.mobileNumber("5", true);
    }

    @Test (description = "Checks the ability to enter more than 9 digits in mobile number field")
    public void test04_mobileNumberLongCheck () {
        StepsPage page = new StepsPage(driver);
        page.mobileNumber("59999999999", true);
    }

    @Test (description = "Checks the ability to enter email address without domain name in email field")
    public void test05_emailDomainMissing () {
        StepsPage page = new StepsPage(driver);
        page.fillIncompleteEmail ("testappium", true);
    }

    @Test (description = "Checks the ability to enter mobile phone number in email field")
    public void test06_emailPhoneNumberCheck () {
        StepsPage page = new StepsPage(driver);
        page.fillEmail("593712302", true);
    }

    @Test (description = "Fill email address in email field")
    public void test07_emailFieldFill () {
        StepsPage page = new StepsPage(driver);
        page.fillEmail("testappium@gmail.com",true);
    }
    @Test (description = "Checks register with an incorrectly formatted birth year (3 digits instead of 4)")
    public void test08_wrongBirthYear () throws InterruptedException {
        StepsPage page = new StepsPage(driver);
        page.gestureClick(true);
        }
    @Test (description = "Checks register without birth year (0 digits instead of 4)")
    public void test09_noBirthYear () throws InterruptedException {
        StepsPage page = new StepsPage(driver);
        page.deleteBirth();
    }
    @Test (description = "Checks login with correct username and incorrect password")
    public void test10_WrongPassword () {
        StepsPage page = new StepsPage (driver);
        page.restart();
        page.fillUsernameWithPassword ("haivpmlhhlwrwkgplt@cazlp.com","Test123",true);
        page.closeLoginError();
        page.clearFields();
    }
    @Test (description = "Checks login with correct username and incorrect password")
    public void test11_RightPassword () {
        StepsPage page = new StepsPage (driver);
        page.restart();
        page.fillUsernameWithPassword ("haivpmlhhlwrwkgplt@cazlp.com","Qatest123",true);
        page.closeNotNow();
    }
    @Test (description = "Checks the possibility of publishing photos")
    public void test12_UploadPhoto () throws InterruptedException {
        StepsPage page = new StepsPage (driver);
        page.uploadPhotoPost();
    }

}


    /**
     * I'll temporarily comment out this code, because after many runs of test, Facebook no longer allows me to enter
     * the wrong password - it send me to account recovery.
     But it works, be sure :3
     **/

    /*
    @Test (description = "Checks login with phone number without country code and correct password")
    public void secondLoginWrongUser () {
        StepsPage page = new StepsPage(driver);
        page.fillUsernameWithPassword ("574054408", "Test123", true);
        page.closeLoginError();
        page.clearFields();
    }
     */

