package com.techbeamers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.GamertagSearch;
import pageObjects.Homepage;
import pageObjects.Leaderboard;


public class LoadTest01 {
	public String baseUrl = "https://www.xboxgamertag.com/";
	String driverPath = "geckodriver.exe";
	public WebDriver driver;
	public String userNameFor6 = "";
	
	@BeforeTest
	public void launchBrowser() throws FileNotFoundException {
		System.out.println("launching firefox browser");
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		
		Homepage hp = PageFactory.initElements(driver, Homepage.class);
		hp.clickLeaderboard();
		File userName = new File("search-conf.txt");
		Scanner scan = new Scanner(userName);
		userNameFor6 = scan.next();
		scan.close();
		
	}
	
	@Test(priority = 0)
	public void numberOne() {
		Leaderboard lb = PageFactory.initElements(driver, Leaderboard.class);
		assert(lb.elementCompare());
		
	}
	
	@Test(priority = 5)
	public void validateGames() {
		driver.get(baseUrl);
		Homepage hp = PageFactory.initElements(driver, Homepage.class);
		hp.searchByGamertag(userNameFor6);
		GamertagSearch gs = PageFactory.initElements(driver, GamertagSearch.class);
		assert(gs.elementCompare());

	}
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}
}