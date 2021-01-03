package propertyfile;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frontaccounting_test {
  @Test
  public void frtacct() throws Exception
  {
	  FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\mavenbackup\\Advancedautomation\\src\\test\\resources\\Frontacc.properties");
	  Properties ab=new Properties();
	  ab.load(file);
	  System.setProperty(ab.getProperty("Browsername"), ab.getProperty("Browserpath"));
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.get(ab.getProperty("url"));
	  
	//driver.findElement(By.xpath(ab.getProperty("usernamexpath"))).sendKeys(ab.getProperty("Username"));
	  driver.findElement(By.name(ab.getProperty("Passwordxpath"))).sendKeys(ab.getProperty("Password"));
	  driver.findElement(By.name(ab.getProperty("loginxpath"))).click();
  }
}
