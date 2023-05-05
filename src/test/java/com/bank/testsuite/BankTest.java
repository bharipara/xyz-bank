package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
AddCustomerPage addcustomerPage = new AddCustomerPage();
OpenAccountPage openAccountPage = new OpenAccountPage();
CustomersPage customersPage = new CustomersPage();
CustomerLoginPage customerLoginPage = new CustomerLoginPage();
AccountPage accountPage =new AccountPage();
BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
HomePage homePage = new HomePage();
@Test
    public void bankManagerShouldAddCustomerSuccessfully(){
//        click On "Bank Manager Login" Tab
        bankManagerLoginPage.clickOnManagerBtn();
//        click On "Add Customer"
        addcustomerPage.clickOnAddCustomerTab();
//        enter FirstName
        addcustomerPage.enterFirstName();
//        enter LastName
        addcustomerPage.enterLastName();
//        enter PostCode
        addcustomerPage.enterPostCode();
//        click On "Add Customer" Button

        addcustomerPage.clickOnCustomerBtn();
//        popup display
//        verify message "Customer added successfully"
    Assert.assertEquals(addcustomerPage.verifyTextFromAlert(),"Customer added successfully with customer id :6","Message not found");
    addcustomerPage.acceptAlert();
//        click on "ok" button on popup.

    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully(){

    bankManagerShouldAddCustomerSuccessfully();
//        click On "Bank Manager Login" Tab
        bankManagerLoginPage.clickOnManagerBtn();
//        click On "Open Account" Tab
        openAccountPage.clickOnOpenAccount();
//        Search customer that created in first test
        openAccountPage.searchCustomer();
//        Select currency "Pound"
        openAccountPage.selectCurrency();
//        click on "process" button
        openAccountPage.clickOnProcess();
//        popup displayed
//        verify message "Account created successfully"
        Assert.assertEquals(openAccountPage.verifyTextFromAlert(),"Account created successfully with account Number :1017");
        openAccountPage.acceptAlert();
//        click on "ok" button on popup.
    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully(){
      bankManagerShouldAddCustomerSuccessfully();
      homePage.clickOnHomeTab();
//        click on "Customer Login" Tab
        customerLoginPage.clickOnCustomerLogin();
//        search customer that you created.
        customerLoginPage.searchCreatedCustomer();
//                click on "Login" Button
        customerLoginPage.clickOnLoginBtn();
//        verify "Logout" Tab displayed.
        Assert.assertEquals(customerLoginPage.verifyLogOutBtn(),"Logout","Message not found");
//        click on "Logout"
        customerLoginPage.clickOnLogOutBtn();
//        verify "Your Name" text displayed.
        Assert.assertEquals(customerLoginPage.verifyYourName(),"Your Name :");
    }

    @Test
    public void  customerShouldDepositMoneySuccessfully() throws InterruptedException {

       //bankManagerShouldAddCustomerSuccessfully();
        homePage.clickOnHomeTab();
//        click on "Customer Login" Tab
        customerLoginPage.clickOnCustomerLogin();
//        search customer that you created.
        customerLoginPage.searchCreatedCustomer();
//                click on "Login" Button
        customerLoginPage.clickOnLoginBtn();
//        click on "Deposit" Tab
        accountPage.clickOnDepositTab();
//        Enter amount 100
        accountPage.enterAmount();
        Thread.sleep(2000);
//        click on "Deposit" Button
        accountPage.clickOnDepositBtn();
//        verify message "Deposit Successful"
        Assert.assertEquals(accountPage.verifyDepositMsg(),"Deposit Successful");
    }

    @Test
    public void  customerShouldWithdrawMoneySuccessfully(){
    //bankManagerShouldAddCustomerSuccessfully();
    homePage.clickOnHomeTab();
//        click on "Customer Login" Tab
        customerLoginPage.clickOnCustomerLogin();

//        search customer that you created.
        customerLoginPage.searchCreatedCustomer();
//                click on "Login" Button
        customerLoginPage.clickOnLoginBtn();
//        click on "Withdrawl" Tab
        customersPage.clickOnWithdrawTab();
//        Enter amount 50
        customersPage.entreWithdrawAmount();
//        click on "Deposit" Button
        customersPage.clickOnWithdrawBtn();
//        verify message "Transaction Successful"
        Assert.assertEquals(customersPage.verifyTransaction(),"Transaction successful");

    }
}
