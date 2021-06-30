package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.techbeamers.CustomAssertion;

public class Leaderboard {
WebDriver driver;

//Elements library
@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[3]/a")
WebElement name1;
@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[4]/p")
WebElement score1;

@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[3]/a")
WebElement name2;
@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[4]/p")
WebElement score2;

@FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div[3]/a")
WebElement name3;
@FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div[4]/p")
WebElement score3;

@FindBy(xpath = "/html/body/div[1]/div/div[4]/div/div[3]/a")
WebElement name4;
@FindBy(xpath = "/html/body/div[1]/div/div[4]/div/div[4]/p")
WebElement score4;

@FindBy(xpath = "/html/body/div[1]/div/div[5]/div/div[3]/a")
WebElement name5;
@FindBy(xpath = "/html/body/div[1]/div/div[5]/div/div[4]/p")
WebElement score5;

public Leaderboard(WebDriver driver)
{
	this.driver = driver;
}

public boolean elementCompare()
{
	CustomAssertion m_custom = new CustomAssertion();
	m_custom.addCompare(name1.getText());
	m_custom.addCompare(name2.getText());
	m_custom.addCompare(name3.getText());
	m_custom.addCompare(name4.getText());
	m_custom.addCompare(name5.getText());
	m_custom.addCompare(score1.getText());
	m_custom.addCompare(score2.getText());
	m_custom.addCompare(score3.getText());
	m_custom.addCompare(score4.getText());
	m_custom.addCompare(score5.getText());
	m_custom.addMessage(name1.getText());
	m_custom.addMessage(name2.getText());
	m_custom.addMessage(name3.getText());
	m_custom.addMessage(name4.getText());
	m_custom.addMessage(name5.getText());
	m_custom.addMessage(score1.getText());
	m_custom.addMessage(score2.getText());
	m_custom.addMessage(score3.getText());
	m_custom.addMessage(score4.getText());
	m_custom.addMessage(score5.getText());
	return m_custom.assertCompare();
}
}