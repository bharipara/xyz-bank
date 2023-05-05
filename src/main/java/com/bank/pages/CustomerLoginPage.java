package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");
    By searchCreatedCustomer = By.xpath("//select[@id='userSelect']");
    By clickOnLogin = By.xpath("//button[contains(text(),'Login')]");
    By logOutBtn = By.xpath("//button[@class='btn logout']");
    By clickOnLogOutBtn = By.xpath("//button[@class='btn logout']");
    By verifyYourName = By.xpath("//label[contains(text(),'Your Name :')]");

    public void clickOnCustomerLogin(){
        clickOnElement(customerLogin);
    }
    public void searchCreatedCustomer(){
        selectByContainsTextFromDropDown(searchCreatedCustomer,"Hermoine Granger");
    }
    public void clickOnLoginBtn(){
        clickOnElement(clickOnLogin);
    }
    public String verifyLogOutBtn(){
        return getTextFromElement(logOutBtn);
    }
    public void clickOnLogOutBtn(){
        clickOnElement(clickOnLogOutBtn);
    }
    public String verifyYourName(){
        return getTextFromElement(verifyYourName);
    }

}
