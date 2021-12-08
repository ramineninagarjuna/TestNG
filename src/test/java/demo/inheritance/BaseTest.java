package demo.inheritance;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class BaseTest {
  
  @BeforeTest
  public void basebeforeTest() {
	  System.out.println("Base Test -> @BeforeTest");
  }

  @AfterTest
  public void baseafterTest() {
	  System.out.println("Base Test -> @AfterTest");
  }

  @BeforeSuite
  public void basebeforeSuite() {
	  System.out.println("Base Test -> @BeforeSuite");
  }

  @AfterSuite
  public void baseafterSuite() {
	  System.out.println("Base Test -> @AfterSuite");
  }

}
