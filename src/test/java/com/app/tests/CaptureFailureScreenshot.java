package com.app.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.app.pages.BasePage;

public class CaptureFailureScreenshot {

	BasePage bp; 
	
	@AfterMethod
	public void afterMethod(ITestResult result){
		if(ITestResult.FAILURE == result.getStatus()){
			bp.captureScreenshot(result.getName());
		}
	}
	

}
