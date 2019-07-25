package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginstepDefinition {

	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_home_page() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.crmpro.com/");
		
	}
		 @When("^title of login page is Free CRM$")
		 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
		 }
	
		
		 @Then("^user enters username and password$")
		 public void user_enters_username_and_password(){
		 driver.findElement(By.name("username")).sendKeys("bhimskr");
		 driver.findElement(By.name("password")).sendKeys("aadityapk");
		 }
		
		 @Then("^user clicks on login button$")
		 public void user_clicks_on_login_button() {
		 WebElement loginBtn =
		 driver.findElement(By.xpath("//input[@type='submit']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", loginBtn);
		 }
		
		 @Then("^user is on home page$")
		 public void user_is_on_home_page(){
		 String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
		 Assert.assertEquals("CRMPRO", title);
		 }
		 
}
		 
		 
		 
		 
	
	
