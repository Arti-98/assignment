package SimpleFormSteps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFormSteps {
    WebDriver driver;
    SimpleFormSteps form;

    @Given("the user is on the simple form page")
    public void openSimpleFormPage() {
        driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/simple-form");
        form = new SimpleFormSteps();
    }

    @When("the user enters {string} as first name")
    public void enterFirstName(String fname) {
        form.enterFirstName(fname);
    }

    @When("the user enters {string} as last name")
    public void enterLastName(String lname) {
        form.enterLastName(lname);
    }

    @When("the user enters {string} as email")
    public void enterEmail(String email) {
        form.enterEmail(email);
    }

    @When("the user enters {string} as contact number")
    public void enterContactNumber(String number) {
        form.enterContactNumber(number);
    }

    @When("the user clicks the submit button")
    public void clickSubmit() {
        form.clickSubmit();
    }

    @Then("the form should be submitted successfully")
    public void validateFormSubmission() {
        driver.quit();
    }
}

