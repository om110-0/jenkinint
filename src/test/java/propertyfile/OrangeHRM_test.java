package propertyfile;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.config.DriverManagerType;

public class OrangeHRM_test 
{
  @Test
  public void orangehrm() throws Exception
  {
	  FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\mavenbackup\\Advancedautomation\\src\\test\\resources\\organehrm.properties");
	  Properties ab=new Properties();
	  ab.load(file);
	  //WebDriverManager.chromedriver().setup();
	 System.setProperty(ab.getProperty("Browsername"), ab.getProperty("Browserpath"));
	  WebDriver driver =new ChromeDriver();
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.get(ab.getProperty("url"));
	  Thread.sleep(3000);
	driver.findElement(By.xpath(ab.getProperty("usernamexpath"))).sendKeys(ab.getProperty("Username"));
	Thread.sleep(3000);
	  driver.findElement(By.id(ab.getProperty("Passwordxpath"))).sendKeys(ab.getProperty("Password"));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath(ab.getProperty("loginxpath"))).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath(ab.getProperty("Welcomeadminxpath"))).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath(ab.getProperty("Logoutxpath"))).click();
	  Thread.sleep(5000);
	  driver.close();
	  
	  
  }
}
