package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
WebDriver driver;

@FindBy(xpath= "/html/body/nav/div/ul/li[5]/a")
WebElement leaderboardLink;

@FindBy(xpath= "/html/body/div[1]/form/input[1]")
WebElement searchInput;

@FindBy(xpath= "/html/body/div[1]/form/input[2]")
WebElement searchButton;

public Homepage(WebDriver driver)
{
	this.driver = driver;
}

public void clickLeaderboard()
{
	leaderboardLink.click();
}

public void searchByGamertag(String str)
{
	searchInput.sendKeys(str);
	searchButton.click();
}
}
