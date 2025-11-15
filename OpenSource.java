package MyPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OpenSource {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriver d = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
