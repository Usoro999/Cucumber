package CucumberSteps;

import DriverConfig.Baseclass;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.RegistrationPage;

public class RegistrationPageSteps extends Baseclass {
    RegistrationPage registrationPage;



    @Given("The user on the site")
    public void navigateToTheSite(){
        Baseclass.setUp();
        driver.get("https://demoqa.com/automation-practice-form");
        System.out.println(driver.getTitle());
    }

    @When("He fills First Name {string} field")
    public void heFillsFirstNameField(String name) {
        registrationPage = new RegistrationPage(driver);
        registrationPage.fillFirstName(name);
    }

    @When("He fills Last Name {string} field")
    public void heFillsLastNameField(String lastName) {
        registrationPage = new RegistrationPage(driver);
        registrationPage.fillLastname(lastName);
    }

    @When("He fills {string} email")
    public void heFillsEmail(String email) {
        registrationPage = new RegistrationPage(driver);
        registrationPage.fillEmail(email);
    }



    @When("He fills phoneNumber {string}")
    public void heFillsPhoneNumber(String number) {
        registrationPage = new RegistrationPage(driver);
        registrationPage.fillPhoneNumber(number);
    }

    @Then("End the test")
    public void endTheTest() {
        System.out.println("Test is finished");
    }


    @AfterAll
    public static void tearDown(){
        Baseclass.tearDown();
    }
}

