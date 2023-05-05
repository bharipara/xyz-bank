package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By openAccount = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]");
    By searchCustomer = By.xpath("//select[@id='userSelect']");
    By selectCurrency = By.xpath("//select[@id='currency']");
    By clickOnProcess = By.xpath("//button[contains(text(),'Process')]");
    By verifyAccount = By.xpath("");
    By clickOnOkButton = By.xpath("");



    public void clickOnOpenAccount(){
        clickOnElement(openAccount);
    }
    public void searchCustomer(){
        selectByContainsTextFromDropDown(searchCustomer,"Jessica Wright");
    }
    public void selectCurrency(){
        selectByVisibleTextFromDropDown(selectCurrency,"Pound");
    }
    public void clickOnProcess(){
        clickOnElement(clickOnProcess);
    }
    public String verifyTextFromAlert(){
        System.out.println(getTextFromAlert());
        return getTextFromAlert();
    }
    public void acceptThatAlert() {
        acceptAlert();
    }
    }

