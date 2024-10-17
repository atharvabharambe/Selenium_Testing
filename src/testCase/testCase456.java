package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;



public class testCase456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://anon-shoponline.netlify.app/");
		
		driver.manage().window().maximize();
//		
		
		driver.findElement(By.name("close-newsletter-button")).click();
		System.out.println("Test case 4 passed");
		
		
//		driver.findElement(By.name("Subscribe-button")).click();
//		driver.findElement(By.name("email")).sendKeys("teamNSA");
		driver.findElement(By.name("menu-title")).click();
		System.out.println("Test case 5 passed");
		
		
		
	}

}
