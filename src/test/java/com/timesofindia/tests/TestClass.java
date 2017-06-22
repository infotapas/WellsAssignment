package com.timesofindia.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "C:/Software/IEDriverServer.exe");
		WebDriver IEdriver = new InternetExplorerDriver();
		IEdriver.manage().window().maximize();
		IEdriver.get("http://gmail.com");

	}

}
