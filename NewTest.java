package TestNG_Project;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
  
  @Test(dataProvider = "dp")
  public void f(String n, String s) 
  {
      WebDriver dr = new ChromeDriver();
      dr.get("https://practicetestautomation.com/practice-test-login/");
      dr.manage().window().maximize();
      dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      List<WebElement> wl = dr.findElements(By.tagName("input"));
      System.out.println("Number of text box are "+wl.size());
      
//      dr.findElement(By.id("username")).sendKeys(n);
//      
//      
//      dr.findElement(By.id("password")).sendKeys(s);
//      
//  
//      dr.findElement(By.id("submit")).click();
//
      for(WebElement n1 : wl)
      {
    	 n1.getText();
      }
      dr.quit();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abcd", "wxyz" },
      new Object[] { "pqrs", "lmop" },
    };
  }
}
