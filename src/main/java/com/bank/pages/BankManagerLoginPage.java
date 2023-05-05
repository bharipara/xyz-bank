package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By managerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    public void clickOnManagerBtn() {
        clickOnElement(managerLogin);
    }
}
