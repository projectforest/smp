import common.LoanAppHelper;
import dataprovider.CustomerDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageobject.AddCustomerPage;
import pageobject.CustomersPage;
import pageobject.HomePage;

public class Customers {
    @Test(dataProvider = "CreateCustomer", dataProviderClass = CustomerDataProvider.class)
    public void AddCustomer(String branch, String branchAdmin, String branchPassword, String firstname, String lastname, String warning){
        System.setProperty("webdriver.firefox.marionette","C://Program Files/Mozilla Firefox/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        int numberOfMilliseconds = 5000;
        Login aLogin = new Login();
        HomePage aHomePage = new HomePage(driver);
        CustomersPage aCustomerPage = new CustomersPage(driver);
        AddCustomerPage aAddCustomerPage = new AddCustomerPage(driver);

        LoanAppHelper aLoanAppHelper = new LoanAppHelper();

        aLogin.LMSLogin(driver, branch, branchAdmin, branchPassword);

        //wait for 5 sec for site to load

        aLoanAppHelper.sleep(numberOfMilliseconds);

        aHomePage.clickCustomersButton(driver);

        aLoanAppHelper.sleep(numberOfMilliseconds);

        aCustomerPage.clickActionsButton(driver);

        aLoanAppHelper.sleep(numberOfMilliseconds);

        aCustomerPage.clickAddCustomerLink(driver);

        aAddCustomerPage.setCustomerFirstName(driver, firstname);
        aAddCustomerPage.setCustomerLastName(driver, lastname);

        //save
        aAddCustomerPage.clickSaveButton(driver);

        aLoanAppHelper.sleep(numberOfMilliseconds);

        if (warning != ""){
            //verify customer name exist
            aLoanAppHelper.doesTextExistOnPage(warning, driver);

            aAddCustomerPage.clickOKButton(driver);

            aAddCustomerPage.clickCancelButton(driver);

        }
        else {
            //verify customer name exist
            aLoanAppHelper.doesTextExistOnPage(lastname, driver);
        }

        aCustomerPage.clickLogoutButton(driver);

        // try to sleep (wait) for 5 sec (using exception handler)
        aLoanAppHelper.sleep(numberOfMilliseconds);

        // close the browser
        driver.close();
    }

    @Test(dataProvider = "CreateCustomer", dataProviderClass = CustomerDataProvider.class)
    public void AddCustomer1(String branch, String branchAdmin, String branchPassword, String firstname, String lastname, String warning){
        System.setProperty("webdriver.firefox.marionette","C://Program Files/Mozilla Firefox/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        int numberOfMilliseconds = 5000;
        Login aLogin = new Login();
        HomePage aHomePage = new HomePage(driver);
        CustomersPage aCustomerPage = new CustomersPage(driver);
        AddCustomerPage aAddCustomerPage = new AddCustomerPage(driver);

        LoanAppHelper aLoanAppHelper = new LoanAppHelper();

        aLogin.LMSLogin(driver, branch, branchAdmin, branchPassword);

        //wait for 5 sec for site to load

        aLoanAppHelper.sleep(numberOfMilliseconds);

        //customer button
        aLoanAppHelper.clickElementByID(driver, "ext-gen192");

        aLoanAppHelper.sleep(numberOfMilliseconds);

        aLoanAppHelper.clickElementByXPath(driver, "//td[1]/table/tbody/tr/td[2]/em/button");

        aLoanAppHelper.sleep(numberOfMilliseconds);

        aLoanAppHelper.clickElementByLinkName(driver, "Add Customer");

        aLoanAppHelper.setText(driver, "FirstName", firstname);
        aLoanAppHelper.setText(driver, "LastName", lastname);

        //save
        aLoanAppHelper.clickElementByXPath(driver, "//div[5]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/div/div[2]/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/em/button");

        aLoanAppHelper.sleep(numberOfMilliseconds);

        if (warning != ""){
            //verify customer name exist
            aLoanAppHelper.doesTextExistOnPage(warning, driver);
            aLoanAppHelper.clickElementByXPath(driver, "//div[2]/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/em/button");
            aLoanAppHelper.clickElementByXPath(driver, "//div[5]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/div/div[2]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/em/button");

        }
        else {
            //verify customer name exist
            aLoanAppHelper.doesTextExistOnPage(lastname, driver);
        }

        aLoanAppHelper.clickElementByXPath(driver, "//div[5]/div/div/div/div[2]/div[1]/div/div/div[1]/div/table/tbody/tr/td[5]/table/tbody/tr/td[2]/em/button");

        // try to sleep (wait) for 5 sec (using exception handler)
        aLoanAppHelper.sleep(numberOfMilliseconds);

        // close the browser
        driver.close();
    }


}
