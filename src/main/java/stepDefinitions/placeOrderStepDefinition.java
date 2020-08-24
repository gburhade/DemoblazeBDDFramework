package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Maps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class placeOrderStepDefinition 
{
	public static WebDriver driver;
	
	@Given("^User is available on login page$")
	  public void user_is_available_on_login_page()
	  {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("https://www.demoblaze.com/");
		  driver.manage().window().maximize();
	  }
	  
	  @When("^title of login page is Store$")
	  public void title_of_login_page_is_Store()  
	  {
		  String title = driver.getTitle();
		  Assert.assertEquals("STORE", title);
	  }

	  @Then("^user click on Log in menu$")
	  public void user_click_on_Log_in_menu()
	  {
		  driver.findElement(By.linkText("Log in")).click();
	  }
	  
	  @Then("^user enters username and password")
	  public void user_enters_username_and_password(DataTable data) throws InterruptedException  
	  {
		  WebDriverWait wait = new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
		  for(Map<String, String> cred  : data.asMaps(String.class, String.class))
		  {
		  driver.findElement(By.id("loginusername")).sendKeys(cred.get("username"));
	      driver.findElement(By.id("loginpassword")).sendKeys(cred.get("password"));
		  }
	  }

	  @Then("^user clicks on login button$")
	  public void user_clicks_on_login_button()  
	  {
		 driver.findElement(By.xpath("//button[text()='Log in']")).click();
	  }

	  @Then("^user is on home page$")
	  public void user_is_on_home_page()  
	  {
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log out")));
		  WebElement logout = driver.findElement(By.linkText("Log out"));
		  String text = logout.getText();
		  Assert.assertEquals("Log out", text);
	  }
	  
	  @Then("^user click on Samsung galaxy s6")
	  public void user_click_on_Samsung_galaxy_s() 
	  {
	     driver.findElement(By.linkText("Samsung galaxy s6")).click();
	  }
	  
	  @Then("^user click on Add to cart button$")
		public void user_click_on_Add_to_cart_button()  
		{
		    WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add to cart")));
		    driver.findElement(By.linkText("Add to cart")).click();
		}
	  
	  @Then("^Verify product is added$")
		public void verify_product_is_added_to_cart() throws Exception 
		{
			WebDriverWait wait = new WebDriverWait(driver,15);
			wait.until(ExpectedConditions.alertIsPresent());
		    Alert alert = driver.switchTo().alert();
		    String text = alert.getText();
		    Assert.assertEquals("Product added.", text);
		    alert.accept();
		}
	  
	  @Then("^click on Cart menu$")
	  public void click_on_Cart_menu() 
	  {
	      driver.findElement(By.id("cartur")).click();
	  }
	  
	  @Then("^click on Place order$")
	  public void click_on_Place_order() throws InterruptedException 
	  {
		  Thread.sleep(3000);
//		  WebDriverWait wait = new WebDriverWait(driver,20);
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Place Order']")));
	      driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	  }
	  
	  @Then("^fill the user details and click on Purchase button$")
	  public void fill_the_user_details_and_click_on_Purchase_button(DataTable dataval) throws InterruptedException  
	  {
		  WebDriverWait wait = new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("orderModalLabel")));
	      for(Map<String, String> data : dataval.asMaps(String.class, String.class))
	      {
	      Thread.sleep(1000);  
	      driver.findElement(By.id("name")).sendKeys(data.get("Name"));
	      driver.findElement(By.id("country")).sendKeys(data.get("Country"));
	      driver.findElement(By.id("city")).sendKeys(data.get("City"));
	      driver.findElement(By.id("card")).sendKeys(data.get("CreditCard"));
	      driver.findElement(By.id("month")).sendKeys(data.get("Month"));
	      driver.findElement(By.id("year")).sendKeys(data.get("Year"));
	      driver.findElement(By.xpath("//button[text()='Purchase']")).click();
	      Thread.sleep(2000);
	      WebElement message = driver.findElement(By.xpath("//h2[text()='Thank you for your purchase!']"));
		  String confmsg = message.getText();
		  Assert.assertEquals("Thank you for your purchase!", confmsg);
		  driver.findElement(By.xpath("//button[text()='OK']")).click();
	      driver.findElement(By.id("cartur")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	      
	      }
	      
	  }
	  
	  @Then("^verify confirmation message$")
	  public void verify_confirmation_message() 
	  {
	    WebElement message = driver.findElement(By.xpath("//h2[text()='Thank you for your purchase!']"));
	    String confmsg = message.getText();
	    Assert.assertEquals("Thank you for your purchase!", confmsg);
	    driver.findElement(By.xpath("//button[text()='OK']")).click();
	  }

	  @Then("^close the browser$")
	  public void close_the_browser()
	  {
		  driver.close();
	  }
	  
	
}
