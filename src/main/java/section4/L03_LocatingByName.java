package section4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.testng.Assert.assertEquals;

public class L03_LocatingByName {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver", "geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/contactForm.html");
        driver.getPageSource();

        WebElement element = driver.findElement(By.name("first_name"));
        element.sendKeys("firstName");
        driver.close();
    }
}
