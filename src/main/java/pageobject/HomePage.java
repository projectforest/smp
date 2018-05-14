package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;

public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //locator

    @FindBy(how = How.ID, using ="ext-gen185")
    private WebElement buttonUsers;

    @FindBy(how = How.ID, using ="ext-gen192")
    private WebElement buttonCustomers;

    //methods

    public HomePage clickUsersButton(WebDriver driver){
        buttonUsers.click();
        return this;
    }

    public HomePage clickCustomersButton(WebDriver driver){
        buttonCustomers.click();
        return this;
    }

}
