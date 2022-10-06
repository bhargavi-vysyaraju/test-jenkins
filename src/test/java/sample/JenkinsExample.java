package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JenkinsExample {
	
	@Test(priority = 1)
	public void verifyWithValidCredentials() {
		System.out.println("First line of test1");
		Assert.assertTrue(true);
		System.out.println("Last line of test1");	
	}
	
	@Test(priority = 2)
	public void verifyWithInValidCredentials() {
		System.out.println("First line of test2");
		Assert.assertTrue(true);
		System.out.println("Last line of test2");	
	}
	
	@Test(priority = 3)
	public void verifyWithNoCredentials() {
		System.out.println("First line of test3");
		Assert.assertTrue(false);
		System.out.println("Last line of test3");	
	}

}
