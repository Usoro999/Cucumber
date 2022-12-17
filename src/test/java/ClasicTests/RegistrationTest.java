package ClasicTests;

import DriverConfig.Baseclass;
import PageObjects.RegistrationPage;
import UserData.Gender;
import UserDataProvider.LoginDataProvider;
import org.testng.annotations.Test;

public class RegistrationTest extends Baseclass {
    RegistrationPage registrationPage;

    @Test(dataProvider = "userData", dataProviderClass = LoginDataProvider.class)
    public void registrationTest(String name, String lastName, String email, Gender gender, String phoneNumber){
        registrationPage = new RegistrationPage(driver);
        Baseclass.setUp();
        driver.get("https://demoqa.com/automation-practice-form");
        System.out.println(driver.getTitle());

        registrationPage.fillFirstName(name);
        registrationPage.fillLastname(lastName);
        registrationPage.fillEmail(email);
        registrationPage.fillPhoneNumber(phoneNumber);

    }


}
