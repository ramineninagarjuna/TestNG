package demo.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllAnnotations {

	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
		System.out.println("@Test with " + n + " and " + s);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod method");
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest method");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite method");
	}

}
