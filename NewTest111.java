package MyPack;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class NewTest111 {
  @Test(priority = 2)
  public void Login() {
	  System.out.println("I am in Login");
  }
  @Test(priority = 1)
  public void Reg() {
	  System.out.println("I am in Reg case");
  }
  @Test
  public void Home() {
	  System.out.println("I am in Home case");
  }
  @Test(priority = 3)
  public void LogOut() {
	  throw new SkipException("We are ....");
//	  System.out.println("I am in Logout case");
  }
}
