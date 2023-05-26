package HomeWorkWaiters;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Chernetka {
    public static void main(String[] args) {


     System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    driver.get("https://www.guinnessworldrecords.com/Account/Login");
    //driver.findElement(By.id("ez-accept-all")).click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement accept = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ez-accept-all")));
        accept.click();
    WebElement pass = driver.findElement(By.xpath("//input[ @id='Password']"));
    WebElement userName = driver.findElement(By.xpath("//input[ @id='Username']"));
    WebElement checkBox = driver.findElement(By.xpath("//input[ @id='RememberMe']"));

        wait.until(ExpectedConditions.elementToBeClickable(checkBox));
        System.out.println(driver.getTitle());
        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("h1")));
        wait.until(ExpectedConditions.elementToBeSelected(checkBox));
        pass.sendKeys("111111111");
    //wait.until(ExpectedConditions.elementToBeSelected(userName));
        wait.until(ExpectedConditions.elementSelectionStateToBe(checkBox,false));
        userName.sendKeys("Just Text");

}}
