package TestNG.TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestcaseThree {

	@Test(groups={"UI"})
	public void testOne(){
		System.out.println("test 1, testclass 3");
	}
	
	@Test(groups={"UI"})
	public void testTwo() {
		Reporter.log("--- testing TestNG reporter ---");
		System.out.println("test 2, testclass 3");		
		Assert.assertTrue(true);
	}
	
}
