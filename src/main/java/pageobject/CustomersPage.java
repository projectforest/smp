package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage {

    public CustomersPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//td[1]/table/tbody/tr/td[2]/em/button")
    private WebElement buttonActions;

    @FindBy(how = How.LINK_TEXT, using = "Add Customer")
    private WebElement linkAddCustomer;

    @FindBy(how = How.XPATH, using = "//div[5]/div/div/div/div[2]/div[1]/div/div/div[1]/div/table/tbody/tr/td[5]/table/tbody/tr/td[2]/em/button")
    private WebElement buttonLogout;

    public CustomersPage clickActionsButton(WebDriver driver){

        buttonActions.click();
        return this;
    }

    public CustomersPage clickAddCustomerLink (WebDriver driver) {
        // click Add User link
        linkAddCustomer.click();
        return this;
    }

    public CustomersPage clickLogoutButton (WebDriver driver) {
        // click Logout button
        buttonLogout.click();
        return this;
    }


}
