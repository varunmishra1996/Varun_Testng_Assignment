package com.testngassignment;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.internetapp.tests.Calculator;

public class TestCalculatorsParameters {
	@Parameters({"response"})
	public void testMethod1(String response) throws InterruptedException {
		String[] stringArray = response.split(",");
		System.out.println("TestNG_Parameters -> testMethod1");
		System.out.println("Response from xml file: " + response);
		System.out.println("stringArray[0] from xml file: " + stringArray[0]);
		System.out.println("stringArray[1] from xml file: " + stringArray[1]);
	}

	@Test
	@Parameters({"testData"})
	public void exponent(String testData) throws Exception {
		System.out.println("\nRunning Test -> exponent");
		Reporter.log("TestNG_ReportsAndLogs -> exponent", true);
		String[] str = testData.split(",");
		Calculator cal = new Calculator();
		System.out.println("Response from xml file: " + testData);
		System.out.println("stringArray[0] from xml file: " + str[0]);
		System.out.println("stringArray[1] from xml file: " + str[1]);
		double d=Double.parseDouble(str[0]);
		double d1=Double.parseDouble(str[1]);
		double result = cal.exp(d, d1);
		System.out.println(result);
		double expectedResult = 10;
		Assert.assertNotEquals(result, expectedResult);
	}
	

}
