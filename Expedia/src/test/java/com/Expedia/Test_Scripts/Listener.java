package com.Expedia.Test_Scripts;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Expedia.CommonUtils.Base;

public class Listener extends Base implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			ut.takeScreenShot("passed");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
	try {
		ut.takeScreenShot("failed");
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}

}
