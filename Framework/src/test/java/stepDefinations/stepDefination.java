package stepDefinations;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Landingpage;
import pageObjects.Loginpage;
import resource.base;

public class stepDefination extends base {

	@Given("^Initalize the browser with firefox$")
	public void initalize_the_browser_with_firefox() throws Throwable {
		 driver =InitalizeDriver();
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
		driver.get(arg1);
	    // Write code here that turns the phrase above into concrete actions
	  ;
	}

	@Given("^Click on  login link$")
	public void click_on_login_link() throws Throwable {
		Landingpage l=new Landingpage(driver);
		l.getLogin().click();
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and signs up$")
	public void user_enters_and_and_signs_up(String arg1, String arg2) throws Throwable {
		Loginpage lp=new Loginpage(driver);
		lp.getEmail().sendKeys(arg1);
		lp.getPassword().sendKeys(arg2);
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user is succesfully$")
	public void user_is_succesfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}


	
	
}



	