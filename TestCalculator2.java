package com.testngassignment;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.internetapp.tests.Calculator;



public class TestCalculator2 {
	

	@Test
	public void inverse() {
		System.out.println("\nRunning Test -> inverse");
		Reporter.log("TestNG_ReportsAndLogs -> Inverse", true);
		Calculator cal = new Calculator();
		double result = cal.inverse(5);	
		Assert.assertTrue(true, "result is inverse value: "+result);
	}
	
	@Test
	public void negative() {
		System.out.println("\nRunning Test -> negative");
		Reporter.log("TestNG_ReportsAndLogs -> negative", true);
		Calculator cal = new Calculator();
		double result = cal.negate(2);
		Assert.assertTrue(true, "result is negative value: "+result);
	}
	
	@DataProvider (name = "data-provider")
	 public Object[][] dpMethod (Method m){ 
		 return new Object[][] {{2, 3 , 5}, {5, 4, 9}};
		 
		 }
		 
		   @Test (dataProvider = "data-provider")
		     public void Sum (int a, int b, int result) {
				Reporter.log("TestNG_ReportsAndLogs -> sum of two digits using data-provider", true);
		         Calculator cal = new Calculator();
		         int sum = cal.add(a, b);
		         System.out.println("sum of a and b is: "+sum);
		         Assert.assertEquals(result, sum);
		     }
		   
	}
	
	

