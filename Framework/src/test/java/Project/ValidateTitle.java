package Project;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pageObjects.Landingpage;

import resource.base;

public class ValidateTitle extends base{
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =InitalizeDriver();
		 driver.get("http://qaclickacademy.com");
		 log.info("Driver is initialized");
		
	}
	@Test
	
	public void validateAppTitle() throws IOException
	{
		
		//one is inheritance
		// creating object to that class and invoke methods of it
		Landingpage l=new Landingpage(driver);
		//compare the text from the browser with actual text.- Error..
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		 log.info("Successfully validated Text message");
		 

		
		}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}

	

	
}