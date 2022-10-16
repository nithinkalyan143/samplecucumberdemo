package com.cucumberdemo.stepdefinitions;

import com.cucumberdemo.pageobjects.loginpageobjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginstepdefi {
    public WebDriver driver;
    public  loginpageobjects lpo;
    @Given("user opened chrome browser and entered url")
    public void user_opened_chrome_browser_and_entered_url() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        lpo=new loginpageobjects(driver);
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
    }
    @When("user entered username and password")
    public void user_entered_username_and_password() {
          lpo.usernameset("chaitanya@gmail.com");
          lpo.passwordset("Vipparla@143");
    }
    @When("User clicked on login")
    public void user_clicked_on_login() {
        lpo.submitclick();
    }
    @Then("user needs to land on login page")
    public void user_needs_to_land_on_login_page() {
          String actualtitle=driver.getTitle();
          String Expectedtitle="My Account";
          if(actualtitle.equals(Expectedtitle))
          {
              System.out.println("Test is passed");
          }
    }
}
