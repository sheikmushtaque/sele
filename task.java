import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		Thread.sleep(5000);

		//Edit
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("email")).sendKeys("sheik@gmail.com");
		Thread.sleep(2000);
		driver.navigate().back();




		//button
		driver.findElement(By.linkText("Button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("home")).click();

		//hyperlink
		driver.findElement(By.linkText("HyperLink")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Go to Home Page")).click();


		//image
		driver.findElement(By.linkText("Image")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img")).click();

		//Drop down
		driver.findElement(By.linkText("Drop down")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("dropdown1")).click();
		driver.navigate().back();

		//Radio button
		driver.findElement(By.linkText("Radio Button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("yes")).click();
		driver.navigate().back();

		//check box
		driver.findElement(By.linkText("Checkbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input")).click();

































	}

}
