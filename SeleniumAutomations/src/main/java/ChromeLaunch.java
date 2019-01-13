
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Chrome Launcher
		System.setProperty("webdriver.chrome.driver",
				"/Users/saksham.bahati/git/SeleniumAutomationFramework/SeleniumAutomations/chromedriver_mac64_2.45");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		titleVerification(title);
		driver.quit();

		// 2. Firefox Launcher
		WebDriver driver1 = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver",
				"/Users/saksham.bahati/git/SeleniumAutomationFramework/SeleniumAutomations/geckodriver");
		driver1.get("https://www.facebook.com");
		System.out.println(driver1.getTitle());
		driver1.quit();

		// 3. Safari Launcher
		WebDriver drivers = new SafariDriver();
		drivers.get("https://www.google.com");
		drivers.quit();

	}

	public static void titleVerification(String t) {

		if (t == "Google") {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
