package test_classes;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_1 {

	public WebDriver driver;

	@BeforeClass
	public void browser() {
		
		WebDriverManager.chromedriver().setup();
	    ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote--allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@Test
	public void login() {

		System.out.println(driver.getTitle());

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
