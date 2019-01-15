package seleniumstart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new SafariDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		loginGmail(driver);

		// driver.quit();

	}

	public static void loginGmail(WebDriver driver) {

		// 1. Find by ID
		driver.findElement(By.id("identifierId")).sendKeys("saksham.bahati@gmail.com");

		// 2. Find by class-name
		driver.findElement(By.className("CwaK9")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 3. Find by Xpath
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[1]/div/div[1]/input"))
				.sendKeys("Incorrect Password");
		driver.findElement(By.id("passwordNext")).click();
		System.out.println("Logged in");
	}

}
