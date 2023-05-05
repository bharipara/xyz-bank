package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By addCustomer = By.xpath("//button[normalize-space()='Add Customer']");
    By firstName = By.xpath("//input[@placeholder='First Name']");
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    By postCode = By.xpath("//input[@placeholder='Post Code']");
    By customerButton = By.xpath("//button[@type='submit']");

    public void clickOnAddCustomerTab(){
        clickOnElement(addCustomer);
    }
    public void enterFirstName(){
        sendTextToElement(firstName,"Hermoine");
    }
    public void enterLastName(){
        sendTextToElement(lastName,"Granger");

    }
    public void enterPostCode(){
        sendTextToElement(postCode,"wd197sp");
    }
    public void clickOnCustomerBtn(){
        clickOnElement(customerButton);
        switchToAlert();
    }
    public String verifyTextFromAlert() {
        System.out.println(getTextFromAlert());
        return getTextFromAlert();
    }
    public void acceptThatAlert() {
        acceptAlert();
    }

}
