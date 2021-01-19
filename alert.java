import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {


	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.linkText("Alert")).click();
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	    
	    driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
	    Thread.sleep(5000);
		Alert alert1 = driver.switchTo().alert();
	    System.out.println(alert1.getText());
	    alert.accept();
	    
	    
	    driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
	    Thread.sleep(5000);
		Alert alert2= driver.switchTo().alert();
	    System.out.println(alert2.getText());
	    alert.accept();
	    
	    driver.findElement(By.xpath("//button[@onclick='lineBreaks()']")).click();
	    Thread.sleep(5000);
		Alert alert3= driver.switchTo().alert();
	    System.out.println(alert3.getText());
	    alert.accept();
	    
	    
	    driver.findElement(By.xpath("//button[@id='btn']")).click();
	    Thread.sleep(5000);
		Alert alert4= driver.switchTo().alert();
	    System.out.println(alert4.getText());
	    alert.accept();
	    
	    



		
		}

}
