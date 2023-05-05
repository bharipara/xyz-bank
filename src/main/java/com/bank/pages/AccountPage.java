package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By depositTab = By.xpath("//button[normalize-space()='Deposit']");
    By addAmount = By.xpath("//input[@placeholder='amount']");
    By depositBtn = By.xpath("(//button[text()='Deposit']");
    By verifyDepositMsg = By.xpath("//span[contains(text(),'Deposit Successful')]");

    public void clickOnDepositTab(){
        clickOnElement(depositTab);
    }
    public void enterAmount(){
        sendTextToElement(addAmount,"100");
    }
    public void clickOnDepositBtn(){
        clickOnElement(depositBtn);
    }
    public String verifyDepositMsg(){
       return getTextFromElement(verifyDepositMsg);
    }

}
