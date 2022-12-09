package section4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L05_LocatingByCSS {
    /**
     * type of css selectors:
     * - simple selectors
     * - combinator selectors based on relationship between them
     * - pseudo-class selectors  based on state
     * - pseudo-elements selectors based on style
     * - attribute selectors based on attribute and attribute value
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver", "geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/buttons.html");
        driver.findElement(By.cssSelector("#btn_one")).click();

    }
}
