package stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.nl.Stel;

public class ParameterizationSteps {
	WebDriver driver;
	
	@Given("user login to orangehrmlive url")
	public void user_login_to_orangehrmlive_url() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty( "webdriver.chrome.driver",
				  "C:\\Users\\91984\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	
	//this step is for both values passed from step and examples
	@When("he enters the user name as {string} and password as {string}")
	public void he_enters_the_user_name_as_and_password_as(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("password")).sendKeys(password);
		  driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	
	//this step is for Datatable with header
	@When("he enters the following credentials")
	public void he_enters_the_following_credentials(DataTable dataTable) {
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
		List<Map<String,String>> data_retrived = dataTable.asMaps(String.class,String.class);
		for (Map<String, String> value : data_retrived) {
			String username = value.get("user name");
			String password = value.get("password");
			System.out.println("the user name is: "+username);
			System.out.println("the password is "+password);
			driver.findElement(By.name("username")).sendKeys(username);
			  driver.findElement(By.name("password")).sendKeys(password);
			  driver.findElement(By.xpath("//*[@type='submit']")).click();
			  driver.findElement(By.name("username")).clear();
			  driver.findElement(By.name("password")).clear();
		}
		
	}
	
	//this step is for data table without header
	@When("he enters the following user name")
	public void he_enters_the_following_user_name(DataTable dataTable) {
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
		List<String> datagotList = dataTable.asList(String.class);
		for (String valueInList : datagotList) {
			System.out.println(valueInList);
		}
	}
	
	@Then("he sees the error message")
	public void he_sees_the_error_message() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[text()='Invalid credentials']")).isDisplayed();
	    driver.quit();
	}
	
	
}
