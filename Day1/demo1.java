import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Sel-pro\\chromedriver.exe");  //chrome driver path
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
											}
				   }
