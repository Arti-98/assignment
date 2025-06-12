package SimpleForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimpleFormPage {
    WebDriver driver;

    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By email = By.id("email");
    By number = By.id("number");
    By submitBtn = By.cssSelector("input[type='submit']");

    public SimpleFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String fName) {
        driver.findElement(firstName).sendKeys(fName);
    }

    public void enterLastName(String lName) {
        driver.findElement(lastName).sendKeys(lName);
    }

    public void enterEmail(String emailAddr) {
        driver.findElement(email).sendKeys(emailAddr);
    }

    public void enterNumber(String num) {
        driver.findElement(number).sendKeys(num);
    }

    public void clickSubmit() {
        driver.findElement(submitBtn).click();
    }
}

