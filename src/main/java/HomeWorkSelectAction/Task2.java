package HomeWorkSelectAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Task2 {
    /*http://www.ashortjourney.com/
Написать программу, которая будет автоматизировать сценарий показанный на видео "Сценарий для автоматизии.mp4".
*/

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.ashortjourney.com/");
        Thread.sleep(7000);
        Actions actions = new Actions(driver);

        Thread.sleep(7000);

        actions.moveByOffset(716,158).pause(Duration.ofSeconds(3)).clickAndHold().moveByOffset(879,470).release().build().perform();
        Thread.sleep(3000);
        actions.moveByOffset(384,468).pause(Duration.ofSeconds(3)).clickAndHold().moveByOffset(1152,156).release().build().perform();
        Thread.sleep(3000);
        actions.moveByOffset(480,483).pause(Duration.ofSeconds(3)).clickAndHold().moveByOffset(1440,327).release().build().perform();
        Thread.sleep(3000);
        actions.moveByOffset(1579,357).pause(Duration.ofSeconds(3)).clickAndHold().moveByOffset(840,93).release().build().perform();
        Thread.sleep(3000);
        actions.moveByOffset(1536,156).pause(Duration.ofSeconds(3)).clickAndHold().moveByOffset(1152,468).release().build().perform();
        Thread.sleep(3000);
        actions.moveByOffset(480,467).pause(Duration.ofSeconds(3)).clickAndHold().moveByOffset(1440,405).release().build().perform();
        Thread.sleep(3000);
        actions.moveByOffset(552,468).pause(Duration.ofSeconds(3)).clickAndHold().moveByOffset(696,156).release().build().perform();
        Thread.sleep(3000);
        actions.moveToElement(driver.findElement
                (By.xpath("//h2[@id='postcard-instructions']"))).click().sendKeys("Задание выполнено!").build().perform();
        driver.quit();
    }
}
