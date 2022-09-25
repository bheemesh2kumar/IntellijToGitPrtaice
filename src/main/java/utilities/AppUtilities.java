package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AppUtilities {


    public static void waitAndClick(WebDriver driver, int time, By ele) {
        new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ele));
        // ele.click();
    }

    public static void waitusingJs(WebDriver driver, WebElement ele) {
        JavascriptExecutor exec = (JavascriptExecutor) driver;
        if (exec.executeScript("return document.readyState").toString().equals("complete")) {

            try {

                ele.click();

            } catch (Exception ex) {

                ex.printStackTrace();

            }

        }
    }


}
