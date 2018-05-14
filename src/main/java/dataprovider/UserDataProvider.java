package dataprovider;

import org.testng.annotations.DataProvider;

public class UserDataProvider {
    @DataProvider(name = "CreateUser")
    public static Object[][] CreateUser() // there are 2 square brackets [] [] after word Object
    {

        return new Object[][]{
                {"Danville", "admin", "hlin1108", "bsample3", "password", ""}
        };

    }
}
