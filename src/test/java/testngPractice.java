import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngPractice {
	@Test
	public void test() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.close();
	}

}
