package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.LoginPage;


 
public class StepDef {

	 public WebDriver driver;
	 public LoginPage loginpg;
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    loginpg = new LoginPage(driver);
	}

	@When("User Open URL {string}")
	public void user_open_url(String url) {
	    driver.get(url);
	}

	@When("User entered Email as {string} and Password as {string}")
	public void user_entered_email_as_and_password_as(String emailadd, String password) {
		loginpg.enterEmail(emailadd);
		loginpg.enterPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() {
		loginpg.clickOnLoginButton();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		String actualtitle = driver.getTitle();
		if(actualtitle.equals(title)) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}

	@When("User Click on Log out link")
	public void user_click_on_log_out_link() {
		loginpg.clickOnLogOutButton();
	}

	@Then("Close broswer")
	public void close_broswer() {
	   driver.quit();
	}

}
