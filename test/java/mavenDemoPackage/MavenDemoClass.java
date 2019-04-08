package mavenDemoPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class MavenDemoClass {

	
	public static WebDriver driver;
	
	@Test
	public void TestFireFox(){
	 
	 
	driver = new FirefoxDriver();		
	System.setProperty("webdriver.gecko.driver","D:\\NewAuto\\Driver\\geckodriver.exe");
	 
	driver.manage().window().maximize();
	 
	driver.get("http://www.google.com");
	 
	
	//driver.quit();
	 
	}
	@AfterClass
	public static void closeBrowser() throws InterruptedException {
		driver.close();
	}
	}

