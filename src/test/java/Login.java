import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobject.LoginPage;

public class Login {
    @Test
    public void LMSLogin(WebDriver driver, String branch, String branchAdmin, String branchPassword){
        

        //create object required for this test
        LoginPage aLoginPage = new LoginPage(driver);

        // And now use this to visit LMS login page
        driver.get("http://qa-hitekschool.com/lms/loans/2108");
        //driver.get(" http://demo.borland.com/gmopost");
        // Maximize window
        driver.manage().window().maximize();
        // Read the title of the page and put it into results
        System.out.print("Page title is: " + driver.getTitle());

        //enter branch name
        aLoginPage.setBranchName(driver, branch);

        //enter branch admin username
        aLoginPage.setBranchAdminUsername(driver, branchAdmin);

        //enter branch admin password
        aLoginPage.setBranchAdminPassword(driver, branchPassword);

        //click login
        aLoginPage.clickLoginButton(driver);

        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        // Read the title of the page and output it into results - need it for debug purpose
        System.out.println("Page title is: " + driver.getTitle());
        
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

