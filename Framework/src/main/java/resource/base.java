package resource;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public static  WebDriver driver;
	public Properties prop;
	
	public WebDriver InitalizeDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Downloads\\Framework\\Framework\\src\\main\\java\\resource\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
	
		System.out.println(browserName);
		if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Desktop\\Firefox\\geckodriver-v0.29.1-win32\\geckodriver.exe");
			 driver=new FirefoxDriver();
				
			
		}
		else if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/Downloads/chromedriver_win32/chromedriver.exe");
			 driver= new ChromeDriver();
			
		}
		else if (browserName.equals("IE"))
		{
//			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://Users//Lenovo//Desktop//Selenium//"+result+"screenshot.png"));
		
	}
}