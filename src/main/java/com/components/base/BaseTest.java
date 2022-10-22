package com.components.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.components.utils.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static ReadConfig config = new ReadConfig();
	public static WebDriverWait wait;
	public static Actions action = null;
	public static JavascriptExecutor js = null;

	public static void init() {

		String browser = config.getBrowser();
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		wait = new WebDriverWait(driver, Long.parseLong(config.getWebdriverTimeout()));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Long.parseLong(config.getTimeout()), TimeUnit.SECONDS);

		driver.get(config.getBaseUrl());
		action = new Actions(driver);
		js = (JavascriptExecutor) driver;
	}

	public static void tearDown() {
		driver.quit();
	}

}
