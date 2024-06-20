import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class SharelaneTest {
    @Test
    public void zipCode4Digits() {
        // открыть браузер
        //зайти на сайт
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://sharelane.com/cqi-bin/registor.py");
        browser.findElement(By.name("zip_code")).sendKeys("1234");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        String error = browser.findElement(By.cssSelector("[class=error_message]")).getText();
        assertEquals(error, "Oops");
        browser.quit();
    }

    @Test
    public void zipCode5Digits() {
        // открыть браузер
        //зайти на сайт
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://sharelane.com/cqi-bin/registor.py");
        browser.findElement(By.name("zip_code")).sendKeys("1234");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        boolean isPresent = browser.findElement(By.cssSelector("[value=Register]")).isDisplayed();
        assertTrue(isPresent, "The register is not displayed");
        browser.quit();
    }
}
