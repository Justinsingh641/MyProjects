package loginTest;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class Test12 {
	{
		WebDriver driver =new webDriverScr().useChrome();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.manage().window().maximize();
		
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        driver.close();
	}
}

