package org.example.tests;

import org.example.Base;
import org.example.pages.StepsPage;
import org.testng.annotations.Test;

public class NegativeTest extends Base {

    @Test (description = "Checks login with correct username and incorrect password")
    public void loginWithWrongPassword () {
        StepsPage page = new StepsPage (driver);
        page.fillUsernameWithPassword ("haivpmlhhlwrwkgplt@cazlp.com","test123",true);
        page.closeLoginError();
        page.clearFields();
    }

    @Test (description = "Checks login with phone number without country code and correct password")
    public void secondLoginWrongUser () {
        StepsPage page = new StepsPage(driver);
        page.fillUsernameWithPassword ("574054408", "Qatest123", true);
        page.closeLoginError();
        page.clearFields();
    }
}
