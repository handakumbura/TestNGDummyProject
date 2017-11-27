package TestNG.TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestcaseTwo {

	@BeforeMethod
	public void setup() {
		System.out.println("test 1");
	}
	
	@Test(groups= {"UI"})
	public void testOne() {
		System.out.println("test 1, Testclase Two");
	}
	
}
