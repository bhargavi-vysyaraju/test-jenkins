package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JenkinsExample {
	
	@Test
	public void verifyWithValidCredentials() {
		System.out.println("First line of test1");
		Assert.assertTrue(true);
		System.out.println("Last line of test1");	
	}
	
	@Test
	public void verifyWithInValidCredentials() {
		System.out.println("First line of test2");
		Assert.assertTrue(true);
		System.out.println("Last line of test2");	
	}

}
