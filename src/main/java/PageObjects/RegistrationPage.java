package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    private final WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id = 'firstName']")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@id = 'lastName']")
    WebElement lastNameField;
    @FindBy(xpath = "//input[@id = 'userEmail']")
    WebElement emailField;
    @FindBy(xpath = "//label[@for = 'gender-radio-1']")
    WebElement manGenderRadioButton;
    @FindBy(xpath = "//label[@for = 'gender-radio-2']")
    WebElement womanGenderRadioButton;
    @FindBy(xpath = "//input[@id = 'userNumber']")
    WebElement numberField;



    public void fillFirstName(String name){
        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(firstNameField)).sendKeys(name);*/
        firstNameField.sendKeys(name);
    }


    public void fillLastname(String last_Name) {
        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf( )).sendKeys(last_Name);*/
        lastNameField.sendKeys(last_Name);
    }

    public void fillEmail(String email) {
        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(email);*/
        emailField.sendKeys(email);
    }

    public void clickManGender() {
        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(manGenderRadioButton)).click();*/
        manGenderRadioButton.click();
    }

    public void clickWomanGender() {
  /*      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(womanGenderRadioButton)).click();*/
        womanGenderRadioButton.click();
    }

    public void fillPhoneNumber(String number) {
        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(numberField)).sendKeys(number);*/
        numberField.sendKeys(number);
    }
}
