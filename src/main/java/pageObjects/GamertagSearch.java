package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.techbeamers.CustomAssertion;

public class GamertagSearch {
WebDriver driver;

@FindBy(xpath= "/html/body/div[1]/div[3]/div/div[1]/div/div/div[1]/h3/a")
WebElement game1;

@FindBy(xpath= "/html/body/div[1]/div[3]/div/div[2]/div/div/div[1]/h3/a")
WebElement game2;

@FindBy(xpath= "/html/body/div[1]/div[3]/div/div[3]/div/div/div[1]/h3/a")
WebElement game3;

@FindBy(xpath= "/html/body/div[1]/div[3]/div/div[4]/div/div/div[1]/h3/a")
WebElement game4;

public GamertagSearch(WebDriver driver)
{
	this.driver = driver;
}

public boolean elementCompare()
{
	CustomAssertion m_custom = new CustomAssertion();
	m_custom.addCompare(game1.getText());
	m_custom.addCompare(game2.getText());
	m_custom.addCompare(game3.getText());
	m_custom.addCompare(game4.getText());
	m_custom.addMessage(game1.getText());
	m_custom.addMessage(game2.getText());
	m_custom.addMessage(game3.getText());
	m_custom.addMessage(game4.getText());
		return m_custom.assertCompare();
}
}
