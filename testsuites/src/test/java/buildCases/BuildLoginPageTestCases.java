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
	
	@Test(priority=1)
	public void testLoginAndLogout(String email, String password) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[2]/span/div/div/div/div/div/div/div/div/div[2]/div[1]/div/input")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[2]/span/div/div/div/div/div/div/div/div/div[2]/div[2]/div/div/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/button")).click();
		Thread.sleep(2000);
		String expectedTitle = "ScreenScape Screen Manager";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/nav/div/div/div/div[5]/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		String logoutTitle = "Sign In to ScreenScape";
		String actualLogoutTitle = driver.getTitle();
		Assert.assertEquals(logoutTitle, actualLogoutTitle);
	}
}
