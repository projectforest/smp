package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //constructor
    public LoginPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.NAME, using = "j_branch")
    private WebElement branchName;

    @FindBy(how = How.NAME, using = "j_username")
    private WebElement branchAdminUsername;

    @FindBy(how = How.NAME, using = "j_password")
    private WebElement branchAdminPassword;

    @FindBy(how = How.ID, using = "ext-gen38")
    private WebElement buttonLogin;


    //methods

    public LoginPage setBranchName(WebDriver driver, String branch){
        //WebElement element = driver.findElement(By.name("j_branch"));

        branchName.sendKeys(branch);

        return this;
    }

    public LoginPage setBranchAdminUsername(WebDriver driver, String branchAdmin){
        //find text input element username
        //WebElement element = driver.findElement(By.name("j_username"));

        branchAdminUsername.sendKeys((branchAdmin));

        return this;
    }

    public LoginPage setBranchAdminPassword(WebDriver driver, String branchPassword){
        //WebElement element = driver.findElement(By.name("j_password"));
        branchAdminPassword.sendKeys((branchPassword));
        return this;
    }

    public LoginPage clickLoginButton(WebDriver driver){
        //find button login by its id
        //WebElement element = driver.findElement(By.id("ext-gen38"));

        buttonLogin.click();
        return this;
    }

}
