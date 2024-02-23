package addEmployee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddEmployee {

public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();

driver.manage().window().maximize();

driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("http://localhost/Orangehrm/orangehrm-5.6/web/index.php/auth/login");

driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("23May@2010");
driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();

driver.findElement(By.name("firstName")).sendKeys("Maya");
driver.findElement(By.name("lastName")).sendKeys("V");
driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
}

}
