package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class MyaccoountLoginStepDef {

public WebDriver driver=null;
    @Given("Open browser")
    public void open_browser() {
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    }
    @When("Enter the url {string}")
    public void enter_the_url(String url) {
        //https://practice.automationtesting.in/
       driver.get(url);
    }
    @And("Click on the myaccount menu")
    public void click_on_the_myaccount_menu() {
        driver.findElement(By.xpath("//a[text()='My Account']")).click();

    }


    @And("enter the username {string} and password {string}")
    public void enterTheUsernameAndPassword(String user, String pwd) {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
    }
     //scenario outline and example-3 method
  /*  @When ("enter the username {string} and password {string}")
    public void enter_the_username_and_password(String user, String pwd) {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);

    }*/

 /*   @When("^Enter registered username and password$")
   public void enter_registered_username_and_password(DataTable credentials) throws Throwable {
       List <List <String>> data=credentials.asLists(String.class);
       driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
       driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
   } */

    //login with data table method using header - Map
  /*  @When("^Enter registered username and password$")
    public void enter_registered_username_and_password(DataTable credentials) throws Throwable {
        List<Map<String,String>> data=credentials.asMaps(String.class,String.class);
        driver.findElement(By.id("username")).sendKeys(data.get(0).get("user"));
        driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
    } */
    @And("click on the login button")
    public void click_on_the_login_button() {
       driver.findElement(By.xpath("//input[@name='login']")).click();
    }
    @Then("user should be able to login successfully")
    public void user_should_be_able_to_login_successfully() {
       System.out.println("Login success");

    }




   /* @Then("verify login")
    public void verify_login() {
        String title=driver.findElement(By.xpath("//li//strong[1]")).getText();
        if(title.contains("Error"))
        {
            Assert.assertTrue(true,"invalid input");
        }
        else
        {
            Assert.assertTrue(false);
        }
        }
*/

}
