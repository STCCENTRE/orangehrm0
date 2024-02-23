package module1;



import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Login {

	@Test
	public void user() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Desktop\\web drivers\\Gecko driver\\geckodriver.exe");
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://localhost/orangehrm/orangehrm-5.6/web/index.php/auth/login");
	}
}
