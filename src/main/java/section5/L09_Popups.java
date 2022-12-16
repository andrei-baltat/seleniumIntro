package section5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.Set;

public class L09_Popups {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver", "geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk/popups.html");
        WebElement triggerPopUp = driver.findElement(By.xpath("//button[text()='Trigger Pop-up']"));
        triggerPopUp.click();

        String mainWindow = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        handles.stream().filter(childWindow -> !mainWindow.equalsIgnoreCase(childWindow))
                .forEach(childWindow -> {
            driver.switchTo().window(childWindow);
            driver.close();
        });
        driver.switchTo().window(mainWindow);
        triggerPopUp.click();

    }
}


