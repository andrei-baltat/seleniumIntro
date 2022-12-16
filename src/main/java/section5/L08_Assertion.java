package section5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class L08_Assertion {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver", "geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk");

        driver.findElement(By.linkText("TEST STORE")).click();
        driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
        driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();

        //slow test down:
        Thread.sleep(2000);

        //variable stores the text total:
        String total = driver.findElement(By.cssSelector(".product-total > .value")).getText();

        //assertion checks the total with an expected amount (this example fails):
        Assert.assertEquals("$26.11", total);

    }
}


