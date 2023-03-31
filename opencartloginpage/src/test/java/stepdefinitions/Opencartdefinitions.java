package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;




public class Opencartdefinitions {
	WebDriver driver;
	@Given("user open loginpage")
	public void user_open_loginpage() {
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	}

	@When("enter valid username and password")
	public void enter_valid_username_and_password()  {
		driver.findElement(By.id("email")).sendKeys("shastiram");
		driver.findElement(By.id("pass")).sendKeys("shasti1993@");
	    
	}

	@When("click on login button")
	public void click_on_login_button()  {
		driver.findElement(By.name("login")).click();
	    
	}

	@Then("verify userloginpage is displayed")
	public void verify_userloginpage_is_displayed()  {
		System.out.println("Worked");
		
	  
}
}