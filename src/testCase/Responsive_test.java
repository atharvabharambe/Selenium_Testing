package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashMap;
import java.util.Map;

public class Responsive_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set the path for the ChromeDriver
//        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Define screen sizes for mobile, tablet, and desktop
        Map<String, Dimension> screenSizes = new HashMap<>();
        screenSizes.put("mobile", new Dimension(375, 667));
        screenSizes.put("tablet", new Dimension(768, 1024));
        screenSizes.put("desktop", new Dimension(1440, 900));

        // Website URL to test
        String url = "https://anon-shoponline.netlify.app/";

        // Loop through each screen size and test the responsiveness
        for (Map.Entry<String, Dimension> entry : screenSizes.entrySet()) {
            String device = entry.getKey();
            Dimension screenSize = entry.getValue();

            // Set the browser window size
            driver.manage().window().setSize(screenSize);
            driver.get(url);

            System.out.println("Testing " + device + " screen size: " + screenSize.getWidth() + "x" + screenSize.getHeight());

            // Example: Checking for menu button visibility on mobile
            if (device.equals("mobile")) {
                try {
                    WebElement menuButton = driver.findElement(By.id("menu-button"));
                    if (menuButton.isDisplayed()) {
                        System.out.println("Menu button is visible on " + device);
                    }
                } catch (Exception e) {
                    System.out.println("Menu button not visible on " + device);
                }
            }

            // Add additional assertions as needed for different screen sizes
        }

        // Close the browser
//        driver.quit();

	}

}
