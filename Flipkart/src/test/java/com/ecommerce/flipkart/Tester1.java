package com.ecommerce.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		@SuppressWarnings("unused")
		WebDriver driver = new ChromeDriver();
	}
}
