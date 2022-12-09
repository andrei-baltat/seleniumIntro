package section4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L04_LocatingByLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver", "geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk");
        driver.getPageSource();

        driver.findElement(By.linkText("ACTIONS")).click(); // this on the webpage is uppercase
        // <a href="actions.html">Actions</a>
    }
}
