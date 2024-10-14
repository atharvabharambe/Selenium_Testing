package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test Case 1: Opening our website
		WebDriver driver = new ChromeDriver();
		driver.get("https://anon-buyonline.netlify.app/");
		driver.manage().window().maximize();
		System.out.println("Test case 1 passed");
		
//		Test case 2: Passing email to the pop up
		if(true) {
			driver.findElement(By.name("Subscribe-button")).click();
			driver.findElement(By.name("email")).sendKeys("teamNSA");
			driver.findElement(By.name("Subscribe-button")).click();
//			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys("@gmail.com");
			System.out.println("Test case 2 passed");
		}else {
			System.out.println("Test case 2 failed");
		}
		
		
	}

}
