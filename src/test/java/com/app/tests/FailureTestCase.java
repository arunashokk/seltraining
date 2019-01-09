package com.app.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

public class FailureTestCase {

	
	@Test
	public void Test1(){
		Assert.assertTrue(true);
	}

	@Test
	public void Test2(){
		Assert.assertTrue(false);
	}
	
	@Test
	public void Test3(){
		Assert.assertTrue(false);
	}
	
}
