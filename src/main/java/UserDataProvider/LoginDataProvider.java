package UserDataProvider;

import UserData.Users;
import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name = "userData")
    public static Object[][] userData(){
        return new Object[][]{
                {Users.userAdmin.getFirstname(), Users.userAdmin.getLastname(), Users.userAdmin.getEmail(), Users.userAdmin.getGender(), Users.userAdmin.getPhoneNumber()},
                {Users.userSupport.getFirstname(), Users.userSupport.getLastname(), Users.userSupport.getEmail(), Users.userSupport.getGender(), Users.userSupport.getPhoneNumber()},
                {Users.userUser.getFirstname(), Users.userUser.getLastname(), Users.userUser.getEmail(), Users.userUser.getGender(), Users.userUser.getPhoneNumber()}


        };

    }

}
