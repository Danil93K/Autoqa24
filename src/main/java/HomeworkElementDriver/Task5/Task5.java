package HomeworkElementDriver.Task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    /* Задача 5*/
    //Написать программу, которая повторит действия на видео "Задание 5.mp4".
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru/");
        driver.findElement(By.xpath( "//input[@placeholder='поиск товаров']")).  sendKeys("Хорек");
        driver.findElement(By.xpath( "//input[@placeholder='поиск товаров']")).submit();
        driver.findElement(By.xpath( "//a[@title='Витамины Беафар ПАСТА Мальт с двойным действием для хорьков 100г']")).click();
        driver.findElement(By.xpath( " //span[text()='К сравнению']")).click();
        driver.findElement(By.xpath( " //input[@name='q']")).sendKeys("Медведь");
        driver.findElement(By.xpath( " //input[@name='q']")).submit();
        driver.findElement(By.xpath("//img[@title='Белый медведь 6х5х6см \"У Хомки\"']")).click();
        driver.findElement(By.xpath( " //span[text()='К сравнению']")).click();////span[text()='Сравнение']
        Thread.sleep(3000);
        driver.findElement(By.xpath( "//span[text()='Сравнение']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath( "//div[@class='compare-close j-close']")).click();
        Thread.sleep(3000);
        driver.quit();








    }  }
