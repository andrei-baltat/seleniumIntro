package section5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class L07_LocatingDropdownLists {


    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver", "geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://automationtesting.co.uk/dropdown.html");
       Select menuItem = new Select(driver.findElement(By.cssSelector("#cars")));
//       menuItem.selectByVisibleText("Honda");
       menuItem.selectByValue("honda"); // need lowercase because honda is in the HTML

    }
}
