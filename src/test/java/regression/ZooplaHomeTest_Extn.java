package regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZooplaHomeTest_Extn {

    @Test
    public void logTestAndLableValidation() throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.zoopla.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#__next > div > header > div > div > nav > div.PJLV.PJLV-ieDcChf-css > " +
                "div.c-PJLV.c-PJLV-ikaWXah-css > ul > li:nth-child(3) > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("manu.bheemesh@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("@satyarao1");
        driver.findElement(By.cssSelector("#main-content > div > div > form > div.c-PJLV.c-PJLV-ikqvkfk-css " +
                "> div > button > div")).click();
        Thread.sleep(3000);
        String homelabel = driver.findElement(By.cssSelector("#main-content > div.c-PJLV.c-PJLV-icpkrHo-css.c-feaHCD.c-DSRVB > div > " +
                "div > div > div.PJLV.PJLV-iidpvZc-css > div > h1")).getText();
        System.out.println("Hey iam on login page" + homelabel);
        driver.quit();

    }

    @Test
    public void settingValidation() throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.zoopla.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#__next > div > header > div > div > nav > div.PJLV.PJLV-ieDcChf-css > " +
                "div.c-PJLV.c-PJLV-ikaWXah-css > ul > li:nth-child(3) > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("manu.bheemesh@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("@satyarao1");
        driver.findElement(By.cssSelector("#main-content > div > div > form > div.c-PJLV.c-PJLV-ikqvkfk-css " +
                "> div > button > div")).click();
        Thread.sleep(3000);
        //String homelabel = driver.findElement(By.cssSelector("#main-content > div > div > div > " +
        //   "div.c-PJLV.c-PJLV-ijuVMBx-css > h2")).getText();
        // System.out.println("Hey iam on login page" + homelabel);
        String settingTitle = driver.findElement(By.cssSelector("#main-content > div.c-PJLV.c-PJLV-iPJLV-css.c-feaHCD > div > div.c-PJLV.c-PJLV-kDvZlS-fw-true." +
                "c-PJLV-iPJLV-css > div > div > button > div > div")).getText();
        System.out.println("Hey iam navigated to setting page" + settingTitle);
        driver.quit();

    }

    @Test
    public void webTableValidation() throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
        driver.quit();

    }

}
