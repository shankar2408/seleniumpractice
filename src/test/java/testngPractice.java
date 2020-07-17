import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngPractice {
	@Test
	public void test() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElementByXPath("//input[@name='q']").sendKeys("test",Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
