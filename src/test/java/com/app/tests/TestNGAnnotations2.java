package com.app.tests;

import org.testng.annotations.Test;

public class TestNGAnnotations2 {

		@Test(groups = {"Regression", "Sanity"})
		public void testCase1() {
			System.out.println("in test case 1");
		}

		//to ignore a test case use (enabled = false)
		@Test(enabled=false)
		public void testCase2() {
			System.out.println("in test case 2");
		}
		
		//to add dependency to any test cases we use (dependsOnMethods = {" "})
		@Test(dependsOnMethods = {"testCase4"})
		public void testCase3() {
			System.out.println("in test case 3");
		}

		@Test(priority = 1)
		public void testCase4() {
			System.out.println("in test case 4");
		}
		
		@Test(groups = {"Sanity"})
		public void testCase5() {
			System.out.println("in test case 5");
		}
		
		@Test(groups = {"Regression", "Functional"})
		public void testCase6(){
			System.out.println("in test case 6");
		}
		
		@Test
		public void testCase7(){
			System.out.println("in test case 7");
		}
		
		
	}