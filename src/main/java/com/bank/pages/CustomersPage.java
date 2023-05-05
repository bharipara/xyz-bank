package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {
   By withdrawTab = By.xpath("//button[normalize-space()='Withdrawl']");
   By enterWithdrawAmount = By.xpath("//input[@placeholder='amount']");
   By clickOnWithdraw = By.xpath("//button[normalize-space()='Withdraw']");
   By verifyTransaction = By.xpath("//span[@class='error ng-binding']");

   public void clickOnWithdrawTab() {
       clickOnElement(withdrawTab);
   }
   public void entreWithdrawAmount(){
       sendTextToElement(enterWithdrawAmount,"50");
   }
   public void clickOnWithdrawBtn(){
       clickOnElement(clickOnWithdraw);
   }
   public String verifyTransaction(){
       return getTextFromElement(verifyTransaction);



}
//    public void clickOnAddCustomerTab(){
//        clickOnElement(addCustomer);
//    }
//    public void enterFirstName(){
//        sendTextToElement(firstName,"Jessica");
//    }
//    public void enterLastName(){
//        sendTextToElement(lastName,"Wright");
//
//    }
//    public void enterPostCode(){
//        sendTextToElement(postCode,"wd197sp");
//    }
//    public void clickOnCustomerBtn(){
//        clickOnElement(customerButton);
//        switchToAlert();
//    }
//    public String verifyTextFromAlert() {
//        System.out.println(getTextFromAlert());
//        return getTextFromAlert();
//    }
//    public void acceptAlert() {
//        acceptAlert();
//    }

    }

