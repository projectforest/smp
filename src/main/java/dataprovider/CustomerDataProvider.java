package dataprovider;
import org.testng.annotations.DataProvider;
public class CustomerDataProvider {
    @DataProvider (name = "CreateCustomer")
    public static Object[][] CreateCustomer(){
        return new Object[][]{
                {"Danville", "admin", "hlin1108","steve", "rogers", ""},
                {"Danville", "admin", "hlin1108","", "lastnametwo", "Mandatory field 'First Name' is empty"},
                {"Danville", "admin", "hlin1108","firstnamethree", "", "Mandatory field 'Last Name' is empty"}
        };
    }
}
