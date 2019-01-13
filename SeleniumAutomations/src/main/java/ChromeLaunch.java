import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"/Users/saksham.bahati/git/SeleniumAutomationFramework/SeleniumAutomations/chromedriver_mac64_2.45");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();

		WebDriver driver1 = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver",
				"/Users/saksham.bahati/git/SeleniumAutomationFramework/SeleniumAutomations/geckodriver");
		driver1.get("https://www.facebook.com");
		System.out.println(driver1.getTitle());
		driver1.quit();

	}

}
