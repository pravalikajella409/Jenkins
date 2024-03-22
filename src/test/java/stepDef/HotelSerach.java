package stepDef;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class HotelSerach {
	WebDriver driver;
	@Given("I am on the Hotel App login page")
	public void i_am_on_the_hotel_app_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
	    //throw new io.cucumber.java.PendingException();
	}
 
	@When("I enter  username as {string}")
	public void i_enter_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(string);
	    //throw new io.cucumber.java.PendingException();
	}
 
	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(string);
	    //throw new io.cucumber.java.PendingException();
	}
 
	@When("I click Login")
	public void i_click_login() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login")).click();
	    //throw new io.cucumber.java.PendingException();
	}
 
	@Then("I am Logged in successfully")
	public void i_am_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
 
	@Given("I am on Hotel App Login page")
	public void i_am_on_hotel_app_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
	    //throw new io.cucumber.java.PendingException();
	}
 
	@Then("I Select location as {string}")
	public void i_select_location_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("location")).sendKeys(string);
	    //throw new io.cucumber.java.PendingException();
	}
 
	@Then("Click on the search button")
	public void click_on_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Submit")).click();
	    //throw new io.cucumber.java.PendingException();
	}
 
	@Then("I can see the hotel")
	public void i_can_see_the_hotel() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
 
 
}