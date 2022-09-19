package regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GoogleFireFoxTest {

    @Test
    public void logTest() {

        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.quit();

    }

}
