package stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions {

	WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/ashu/eclipse-workspace/uiFrameworkCogmento/src/main/resources/driver/chromedriver");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		//driver.manage().deleteAllCookies();

	}
	
	
	@Given("^User is already on LoginPage$")
	public void user_is_already_on_LoginPage() throws InterruptedException {
		
		driver.get("https://ui.cogmento.com/");
		Thread.sleep(8000);
	}

	@When("^Title of the Page is CogmentoCRM$")
	public void title_of_the_page_is_CogmentoCRM() {
		String title = driver.getTitle();
		Assert.assertEquals("Failed! Not on login Page", "Cogmento CRM", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("aakash.er@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("lucknow_1000");
	}

	@And("^clicks on Submit loginButton$")
	public void clicks_on_submit_loginButton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@class,'submit')]")).click();
	}

	@Then("^verify user is on HomePage$")
	public void verify_user_is_on_HomePage() throws InterruptedException {
		Thread.sleep(4000);
		WebElement userName = driver.findElement(By.xpath("//*[@class ='user-display']"));
		Assert.assertEquals("Failed! to login in the application", "Aakash Srivastava", userName.getText());
	}

	@And("^close the browser$")
	public void close_the_browser() {
		driver.close();
	}

	@Then("^clicks on forgetPassword link$")
	public void clicks_on_forgetPassword_link() throws Throwable {
		Thread.sleep(4000);
		WebElement forgetLink = driver.findElement(By.xpath("//a[contains(@href,'reset')]"));
		forgetLink.click();
	}

	@Then("^verify the forgetPassword page$")
	public void verify_the_forgetPassword_page() throws Throwable {
	   Thread.sleep(5000);
	   WebElement resetbtn = driver.findElement(By.xpath("//*[contains(text(),'Reset')]"));
	   Assert.assertTrue("Failed to load forgot password page", resetbtn.isDisplayed());	}
	
	@Then("^logout from the application$")
	public void logout_from_the_application() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(@class,'floating')]/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Log')]")).click();
		Thread.sleep(10000);
		WebElement email = driver.findElement(By.name("email"));
		Assert.assertTrue("Failed! To logout from the application", email.isDisplayed());
	}
	
	@Then("^user enters the \"(.*)\" and \"(.*)\"$")
	public void user_enters_the_username_and_password(String username , String password) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@Then("^navigate to the createContactPage$")
	public void navigate_to_the_createContactPage() throws Throwable {
	   WebElement user = driver.findElement(By.xpath("//a[@href='/contacts']/i"));
	   Actions action = new Actions(driver);
	   action.moveToElement(user).build().perform();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//a[@href='/contacts']/following-sibling::button")).click();
	   WebElement userName = driver.findElement(By.xpath("//*[@class ='user-display']"));
	   action.moveToElement(userName).build().perform();
	   Thread.sleep(2000);
	}
	
	@Then("^create a new contact providing \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void create_a_new_contact_providing_and_and(String fName, String lName, String cmpName) throws Throwable {
	    driver.findElement(By.name("first_name")).sendKeys(fName);
	    driver.findElement(By.name("last_name")).sendKeys(lName);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@name='company']/input")).sendKeys(cmpName);
	    driver.findElement(By.xpath("//*[@class='save icon']")).click();
	}
	
	@Then("^user enters the username and password$")
	public void user_enters_the_username_and_password(DataTable credentials) throws Throwable {
	    List<List<String>> data = credentials.raw();
	    Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}

	@Then("^navigate to the createDealsPage$")
	public void navigate_to_the_createDealsPage() throws Throwable {
		   WebElement user = driver.findElement(By.xpath("//a[@href='/deals']/i"));
		   Actions action = new Actions(driver);
		   action.moveToElement(user).build().perform();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//a[@href='/deals']/following-sibling::button")).click();
		   WebElement userName = driver.findElement(By.xpath("//*[@class ='user-display']"));
		   action.moveToElement(userName).build().perform();
		   Thread.sleep(2000);
	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealsData) throws Throwable {
		List<List<String>> dealsValue = dealsData.raw();
		driver.findElement(By.name("title")).sendKeys(dealsValue.get(0).get(0));
		Thread.sleep(2000);
		driver.findElement(By.name("amount")).sendKeys(dealsValue.get(0).get(1));
		Thread.sleep(2000);
		driver.findElement(By.name("probability")).sendKeys(dealsValue.get(0).get(2));
		Thread.sleep(2000);
		driver.findElement(By.name("commission")).sendKeys(dealsValue.get(0).get(3));
		
		
	}
	@Then("^user will enter username and password$")
	public void user_will_enter_username_and_password(DataTable credentials) throws Throwable {
				
		for(Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			driver.findElement(By.name("email")).sendKeys(data.get("username"));
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys(data.get("password"));	
		}
		
	}

	@Then("^user will enter the deal details$")
	public void user_will_enter_the_deal_details(DataTable deals) throws Throwable {
	  
		for(Map<String, String> data : deals.asMaps(String.class, String.class)) {
			driver.findElement(By.name("title")).sendKeys(data.get("title"));
			Thread.sleep(2000);
			driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
			Thread.sleep(2000);
			driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
			Thread.sleep(2000);
			driver.findElement(By.name("commission")).sendKeys(data.get("commission"));	
			driver.findElement(By.xpath("//*[@class='save icon']")).click();
			Thread.sleep(3000);
			navigate_to_the_createDealsPage();
		}
		
	}

}
