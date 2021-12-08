package demo.inheritance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ChildTest extends BaseTest{
  @Test
  public void f() {
	  System.out.println("ChildTest -> @Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("ChildTest -> @BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("ChildTest -> @AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("ChildTest -> @BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("ChildTest -> @AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("ChildTest -> @BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("ChildTest -> @AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("ChildTest -> @BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("ChildTest -> @AfterSuite");
  }

}
