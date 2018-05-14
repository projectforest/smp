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
        //Set Gecko.dirver property to interact to Firefox browser
        //System.setProperty("webdriver.firefox.marionette","C://Program Files/Mozilla Firefox/geckodriver.exe");
        // Create a new instance of the firefox driver
        //WebDriver driver = new FirefoxDriver();

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
//        WebElement element = driver.findElement(By.name("j_branch"));
//        element.sendKeys("Danville");
//        element = driver.findElement(By.name("j_username"));
//        element.sendKeys("admin");
//        element = driver.findElement(By.name("j_password"));
//        element.sendKeys("hlin1108");
//        element = driver.findElement(By.id("ext-gen38"));
//        element.click();
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        // Read the title of the page and output it into results - need it for debug purpose
        System.out.println("Page title is: " + driver.getTitle());
        // Verify the title of the page
        //Assert.assertEquals(driver.getTitle(), "Loan Management System - '" + branch + "' branch");
        //Assert.assertEquals(driver.getTitle(), "Loan Management System - 'Danville' branch");
        // close the browser
        //driver.close();
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

//public class Login {
//    public static void main(String[] args) {
//        //Set Gecko.dirver property to interact to Firefox browser
//        System.setProperty("webdriver.firefox.marionette","C://Program Files/Mozilla Firefox/geckodriver.exe");
//        // Create a new instance of the firefox driver
//        WebDriver driver = new FirefoxDriver();
//        // And now use this to visit LMS login page
//        driver.get("http://qa-hitekschool.com/lms/loans/2108");
//        //driver.get(" http://demo.borland.com/gmopost");
//        // Maximize window
//        driver.manage().window().maximize();
//        // Read the title of the page and put it into results
//        System.out.print("Page title is: " + driver.getTitle());
//        WebElement element = driver.findElement(By.name("j_branch"));
//        element.sendKeys("Danville");
//        element = driver.findElement(By.name("j_username"));
//        element.sendKeys("admin");
//        element = driver.findElement(By.name("j_password"));
//        element.sendKeys("hlin1108");
//        element = driver.findElement(By.id("ext-gen38"));
//        element.click();
//        try {
//            Thread.sleep(5000);
//        }
//        catch(InterruptedException e){
//            e.printStackTrace();
//        }
//        // Read the title of the page and output it into results - need it for debug purpose
//        System.out.println("Page title is: " + driver.getTitle());
//        // Verify the title of the pageAssert.assertEquals(driver.getTitle(), "Loan Management System - 'Danville' branch");
//        // close the browser
//        driver.close();
//
//    }
//}
