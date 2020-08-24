//package stepDefinitions;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert; 
//
//public class loginStepDefinition 
//{
//	public static WebDriver driver;
//	
//  @Given("^User is available on login page$")
//  public void user_is_available_on_login_page()
//  {
//	  WebDriverManager.chromedriver().setup();
//	  driver = new ChromeDriver();
//	  driver.get("https://www.demoblaze.com/");
//	  driver.manage().window().maximize();
//  }
//  
//  @When("^title of login page is Store$")
//  public void title_of_login_page_is_Store()  
//  {
//	  String title = driver.getTitle();
//	  Assert.assertEquals("STORE", title);
//  }
//
//  @Then("^user click on Log in menu$")
//  public void user_click_on_Log_in_menu()
//  {
//	  driver.findElement(By.linkText("Log in")).click();
//  }
//  
//  @Then("^user enters \"(.*)\" and \"(.*)\"$")
//  public void user_enters_username_and_password(String username, String password) throws InterruptedException  
//  {
//	  WebDriverWait wait = new WebDriverWait(driver, 20);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
//	  driver.findElement(By.id("loginusername")).sendKeys(username);
////	 JavascriptExecutor js = (JavascriptExecutor) driver;
////     WebElement usnm = driver.findElement(By.id("loginusername"));
////     usnm.sendKeys("gburhade");
//     driver.findElement(By.id("loginpassword")).sendKeys(password);
//  }
//
//  @Then("^user clicks on login button$")
//  public void user_clicks_on_login_button()  
//  {
//	 driver.findElement(By.xpath("//button[text()='Log in']")).click();
//  }
//
//  @Then("^user is on home page$")
//  public void user_is_on_home_page()  
//  {
//	  WebDriverWait wait = new WebDriverWait(driver,30);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log out")));
//	  WebElement logout = driver.findElement(By.linkText("Log out"));
//	  String text = logout.getText();
//	  Assert.assertEquals("Log out", text);
//  }
//  
//  @Then("^user click on Next pagination button$")
//	public void user_click_on_Next_pagination_button()  
//	{	
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");
//	    driver.findElement(By.xpath("//button[@id='next2']")).click();
//	}
//
//	@Then("^user click on MacBook air$")
//	public void user_click_on_MacBook_air()  
//	{
//	   WebDriverWait wait = new WebDriverWait(driver,30);
//	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("MacBook air")));
//	   driver.findElement(By.linkText("MacBook air")).click();
//	}
//
//	@Then("^user click on Add to cart button$")
//	public void user_click_on_Add_to_cart_button()  
//	{
//	    WebDriverWait wait = new WebDriverWait(driver,30);
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add to cart")));
//	    driver.findElement(By.linkText("Add to cart")).click();
//	}
//
//	@Then("^Verify product is added to cart$")
//	public void verify_product_is_added_to_cart() throws Exception 
//	{
//		WebDriverWait wait = new WebDriverWait(driver,15);
//		wait.until(ExpectedConditions.alertIsPresent());
//	    Alert alert = driver.switchTo().alert();
//	    String text = alert.getText();
//	    Assert.assertEquals("Product added.", text);
//	    alert.accept();
//	}
//  
//  @Then("^close the browser$")
//  public void close_the_browser()
//  {
//	  driver.quit();
//  }
//  
//
//	
//}
