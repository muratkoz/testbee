package com.etsy.step_definitions;


import com.etsy.pages.DashboardPage;
import com.etsy.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_stepdefinitions {

    LoginPage loginPage = new LoginPage();

    @When("user clicks on Get Started button")
    public void user_clicks_on_Get_Started_button() {
        loginPage.getStarted.click();
    }

    @When("user enters valid {string} and {string}")
    public void user_enters_valid_and(String string, String string2) throws InterruptedException {
        loginPage.usernameBox.sendKeys(string);
        loginPage.passwordBox.sendKeys(string2);
        loginPage.signInButton.click();
        //Initialize.driver.getKeyboard().sendKeys(Keys.ENTER);
    }

    @Then("main page should be opened")
    public void main_page_should_be_opened() {
        Assert.assertTrue(new DashboardPage().homeButton.isDisplayed());
    }

    @When("user enters invalid {string} and valid or invalid {string}")
    public void user_enters_invalid_and_valid_or_invalid(String string, String string2) throws InterruptedException {
        loginPage.usernameBox.sendKeys(string);
        loginPage.passwordBox.sendKeys(string2);
        Thread.sleep(2000);
        loginPage.signInButton.click();
        //Initialize.driver.getKeyboard().sendKeys(Keys.ENTER);
    }

    @Then("{string} message should appear")
    public void message_should_appear(String string) {
        Assert.assertEquals(string,loginPage.errorMessage.getText());
        System.out.println(loginPage.errorMessage.getText());
    }

    @When("user enters valid {string} and invalid {string}")
    public void user_enters_valid_and_invalid(String string, String string2) throws InterruptedException {
        loginPage.usernameBox.sendKeys(string);
        loginPage.passwordBox.sendKeys(string2);
        Thread.sleep(2000);
        loginPage.signInButton.click();
        //Initialize.driver.getKeyboard().sendKeys(Keys.ENTER);
    }

}
