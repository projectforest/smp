import common.LoanAppHelper;
import dataprovider.UserDataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobject.AddUserPage;
import pageobject.HomePage;
import pageobject.UsersPage;

public class Users {
//    @Test(dataProvider = "CreateUser", dataProviderClass = UserDataProvider.class)
//    public void addUser(String branch, String branchAdmin, String branchPassword, String user, String password, String warning){
//        System.setProperty("webdriver.firefox.marionette","C://Program Files/Mozilla Firefox/geckodriver.exe");
//
//        WebDriver driver = new FirefoxDriver();
//        int numberOfMilliseconds = 5000;
//        Login aLogin = new Login();
//        HomePage aHomePage = new HomePage(driver);
//        UsersPage aUsersPage = new UsersPage(driver);
//        AddUserPage aAddUserPage = new AddUserPage(driver);
//        LoanAppHelper aLoanAppHelper = new LoanAppHelper();
//
//        aLogin.LMSLogin(driver, branch, branchAdmin, branchPassword);
//
//
//        aLoanAppHelper.sleep(numberOfMilliseconds);
//
//        aHomePage.clickUsersButton(driver);
//
//        aLoanAppHelper.sleep(numberOfMilliseconds);
//
//        aUsersPage.clickActionsButton(driver);
//
//        aLoanAppHelper.sleep(numberOfMilliseconds);
//
//        aUsersPage.clickAddUserLink(driver);
//
//        aAddUserPage.setUsername(driver, user);
//        aAddUserPage.setPassword(driver, password);
//        aAddUserPage.clickSaveButton(driver);
//
//        aLoanAppHelper.sleep(numberOfMilliseconds);
//
//        if (warning != "") {
//
//            aLoanAppHelper.doesTextExistOnPage(warning, driver);
//
//            // click ok button to close pop up
//            aAddUserPage.clickOKButton(driver);
//
//            // click button 'Cancel'
//            aAddUserPage.clickCancelButton(driver);
//
//        } else {
//
//            // verify the results by parsing html page and making sure it contain just created username
//            aLoanAppHelper.doesTextExistOnPage(user, driver);
//
//        }
//        // Click button 'Logout'
//        aUsersPage.clickLogoutButton(driver);
//
//        // try to sleep (wait) for 5 sec (using exception handler)
//        aLoanAppHelper.sleep(numberOfMilliseconds);
//        // close the browser
//        driver.close();
//
//
////        WebElement element = driver.findElement(By.id("ext-gen185"));
////
////        element.click();
////
////        element = driver.findElement(By.xpath("//td[1]/table/tbody/tr/td[2]/em/button"));
////
////        element.click();
//
//
//
////        element = driver.findElement(By.linkText("Add User"));
////        element.click();
////
////        //find text input element 'username' by its name
////        element = driver.findElement(By.name("Username"));
////        element.sendKeys("testuserten");
////        element = driver.findElement(By.name("Password"));
////        element.sendKeys("password01");
////
////        element = driver.findElement(By.xpath("//div[5]/div/div[2]/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/em/button"));
////        element.click();
////
////        try {
////            Thread.sleep(5000);
////        } catch (InterruptedException e){
////            e.printStackTrace();
////        }
////
////        //verify result by parsing html page and check it contain newly created username
////
////        WebElement body = driver.findElement(By.tagName("body"));
////        boolean ret = body.getText().contains("testuserten");
////        System.out.println(ret);
////
////
////        // Find button 'Logout' by its xpath
////        element = driver.findElement(By.xpath("//div[5]/div/div/div/div[2]/div[1]/div/div/div[1]/div/table/tbody/tr/td[5]/table/tbody/tr/td[2]/em/button"));
////
////        // Click button 'Logout'
////        element.click();
////
////        // try to sleep (wait) for 5 sec (using exception handler)
////        try {
////            Thread.sleep(5000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
////        driver.close();
//
//
//
//    }

    @Test(dataProvider = "CreateUser", dataProviderClass = UserDataProvider.class)
    public void addUser1(String branch, String branchAdmin, String branchPassword, String user, String password, String warning){
        System.setProperty("webdriver.firefox.marionette","C://Program Files/Mozilla Firefox/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        int numberOfMilliseconds = 5000;
        Login aLogin = new Login();
        HomePage aHomePage = new HomePage(driver);
        UsersPage aUsersPage = new UsersPage(driver);
        AddUserPage aAddUserPage = new AddUserPage(driver);
        LoanAppHelper aLoanAppHelper = new LoanAppHelper();

        aLogin.LMSLogin(driver, branch, branchAdmin, branchPassword);


        aLoanAppHelper.sleep(numberOfMilliseconds);

        //click button user
        aLoanAppHelper.clickElementByID(driver, "ext-gen185");

        aLoanAppHelper.sleep(numberOfMilliseconds);

        //click button action
        aLoanAppHelper.clickElementByXPath(driver, "//td[1]/table/tbody/tr/td[2]/em/button");

        aLoanAppHelper.sleep(numberOfMilliseconds);


        aLoanAppHelper.clickElementByLinkName(driver, "Add User");

        aLoanAppHelper.setText(driver, "Username", user);
        aLoanAppHelper.setText(driver, "Password", password);
        aLoanAppHelper.clickElementByXPath(driver, "//div[5]/div/div[2]/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/em/button");

        aLoanAppHelper.sleep(numberOfMilliseconds);

        if (warning != "") {

            aLoanAppHelper.doesTextExistOnPage(warning, driver);

            // click ok button to close pop up
            aLoanAppHelper.clickElementByXPath(driver,"//div[2]/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td[2]");

            // click button 'Cancel'
            aLoanAppHelper.clickElementByXPath(driver, "//div[5]/div/div[2]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/em/button");

        } else {

            // verify the results by parsing html page and making sure it contain just created username
            aLoanAppHelper.doesTextExistOnPage(user, driver);

        }
        // Click button 'Logout'
        aLoanAppHelper.clickElementByXPath(driver, "//div[5]/div/div/div/div[2]/div[1]/div/div/div[1]/div/table/tbody/tr/td[5]/table/tbody/tr/td[2]/em/button");

        // try to sleep (wait) for 5 sec (using exception handler)
        aLoanAppHelper.sleep(numberOfMilliseconds);
        // close the browser
        driver.close();




    }

    private boolean doesTextExistOnPage(String warning, WebDriver driver) {
        WebElement body = driver.findElement(By.tagName("body"));
        boolean ret = body.getText().contains(warning);
        System.out.println(ret);
        return ret;
    }

    private void sleep(int numberOfMilliseconds) {
        try{
            Thread.sleep(numberOfMilliseconds);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
