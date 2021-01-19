import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");

		driver.findElement(By.xpath("//a[@href='pages/Window.html']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("home")).click();
		
		

		




	}

}
