https://github.com/Jenkins-pipe/selenium.gitpackage example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	        private WebDriver driver;	 
                @Test
  public void f() {
          driver.get("https://www.cgi.com/us/en-us/federal");
	  driver.manage().window().maximize();
          String title = driver.getTitle();				 
          Assert.assertTrue(title.contains("CGI Federal"));      	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACLIFFOR\\Desktop\\SLENIUM\\chromedriver_win32\\chromedriver.exe");	
	  driver = new ChromeDriver();
	  driver.sleep (10000)
  }

  @AfterTest
  public void afterTest() {
	      driver.quit();
  }

}
