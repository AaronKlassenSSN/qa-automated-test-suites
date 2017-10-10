package buildCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuildLoginPageTestCases {
	
	WebDriver driver;
	
	public BuildLoginPageTestCases(WebDriver driver) {
		this.driver = driver;
	}
	
	@Test(priority=0)
	public void verifyTitle() {
		String pageTitle = driver.getTitle();
		String expectedTitle = "Sign In to ScreenScape";
		Assert.assertEquals(pageTitle, expectedTitle);
	}
}
