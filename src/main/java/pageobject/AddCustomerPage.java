package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
//import common.LoanAppHelper;

public class AddCustomerPage {
    LoanAppHelper aLoanAppHelper = new LoanAppHelper();
    public AddCustomerPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //locator
    @FindBy(how = How.NAME, using = "FirstName")
    private WebElement customerFirstName;

    @FindBy(how = How.NAME, using = "LastName")
    private WebElement customerLastName;

    //save button
    @FindBy(how = How.XPATH, using = "//div[5]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/div/div[2]/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/em/button")
    private WebElement buttonSave;
    //cancel
    @FindBy(how = How.XPATH, using = "//div[5]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/div/div[2]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/em/button")
    private WebElement buttonCancel;

    //button ok should there be error of invalid first or last name
    @FindBy(how = How.XPATH, using = "//div[2]/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/em/button")
    private WebElement buttonOK;

    //method

    public AddCustomerPage setCustomerFirstName(WebDriver driver, String firstname){
        customerFirstName.sendKeys(firstname);
        return this;
    }

    public AddCustomerPage setCustomerLastName(WebDriver driver, String lastname){
        customerLastName.sendKeys(lastname);
        return this;
    }

    public AddCustomerPage setCustomerFirstName1(WebDriver driver, String firstname){
        aLoanAppHelper.setText(driver, "FirstName", firstname);
        return this;
    }

    public AddCustomerPage setCustomerLastName1(WebDriver driver, String lastname){
        aLoanAppHelper.setText(driver, "LastName", lastname);
        return this;
    }



    public AddCustomerPage clickSaveButton (WebDriver driver) {
        // click Save button
        buttonSave.click();
        return this;
    }
    public AddCustomerPage clickCancelButton (WebDriver driver) {
        // click Cancel button
        buttonCancel.click();
        return this;
    }
    public AddCustomerPage clickOKButton (WebDriver driver) {
        // click OK  button on warning message pop up
        buttonOK.click();
        return this;
    }

}
