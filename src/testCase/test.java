package testCase;

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
		
	}

}
