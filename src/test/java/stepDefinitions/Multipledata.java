package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class Multipledata {

   private static WebDriver driver;

    @Given("Open the browser")
    public void open_the_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    }

    @When("Enter the URL {string}")
    public void enter_the_url(String url) {
        driver.get(url);
    }

    @When("Click on My Account Menu")
    public void click_on_my_account_menu() {
        driver.findElement(By.xpath("//a[text()='My Account']")).click();

    }
    @And("Enter name and pwd")
    public void enterNameAndPwd(DataTable credentials) {
        List<Map<String, String>> data = credentials.asMaps(String.class, String.class);
        driver.findElement(By.id("username")).sendKeys(data.get(0).get("user"));
        driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
    }



    @When("Click on login button")
    public void click_on_login_button() {
        driver.findElement(By.xpath("//input[@name='login']")).click();
    }

    @Then("User must successfully login to the web page")
    public void user_must_successfully_login_to_the_web_page() {
        System.out.println("Login success");
    }


}







    //Simple login without parameters
	/*@And("^Enter registered username and password$")
	  public void enter_registered_username_and_password() throws Throwable {
	  driver.findElement(By.id("username")).sendKeys("pavanoltraining");
	  driver.findElement(By.id("password")).sendKeys("Test@selenium123");
	  } */

    //Simple login with parameters
	/*@When("^Enter registered username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_registered_username_and_password(String user, String pwd) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}*/

    //Login with data table method
	/*@When("^Enter registered username and password$")
	public void enter_registered_username_and_password(DataTable credentials) throws Throwable {
		List <List <String>> data=credentials.raw();
		driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	}*/

    //login with data table method using header - Map







