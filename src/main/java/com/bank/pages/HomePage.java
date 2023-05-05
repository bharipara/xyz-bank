package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By clickOnHome = By.xpath("//button[contains(text(),'Home')]");


    public void clickOnHomeTab(){
        clickOnElement(clickOnHome);
    }
}
