package ORG.orghrm;

import java.io.IOException;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage extends BaseClass{
	
	@Given("Open Url")
	public void open_Url() throws InterruptedException {
	    BaseClass.browser();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    Thread.sleep(3000);
	}

	@When("Enter {string} and {string} and click login button")
	public void enter_and_and_click_login_button(String Username, String Password) throws InterruptedException {
	    driver.findElement(By.id("txtUsername")).sendKeys(Username);
	    driver.findElement(By.id("txtPassword")).sendKeys(Password);
	    Thread.sleep(2000);
	    driver.findElement(By.id("btnLogin")).click();
	    Thread.sleep(2000);
	}

	@When("Take screenshot")
	public void take_screenshot() throws IOException {
	    BaseClass.screenshot("./Screenshot/loginpage.png");
	}

	@Then("Quit Browser")
	public void quit_Browser() {
	    BaseClass.quit();
	}



}
