package HomeworkElementDriver.Task1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*Задача 1*/
    /*Написать программу, которая будет открывать пять различных страниц в новых окнах:
    https://uhomki.com.ua/
    https://zoo.kiev.ua/
    https://www.w3schools.com/
    https://taxi838.ua/ru/dnepr/
    https://klopotenko.com/

Прописать цикл, который будет переключаться поочередно через все страницы,
для каждой страницы выводить в консоль название и ссылку на эту страницу.
И будет закрывать ту страницу в названии которой есть слово зоопарк.*/
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.navigate().to("https://uhomki.com.ua/");
        System.out.println("Название страницы: " + driver.getTitle());
        System.out.println("Ссылка на страницу: " + driver.getCurrentUrl());
        if (driver.getTitle().toLowerCase().contains("зоопарк")) {

            System.out.println("Закрыта страница с названием " + driver.getTitle() + "");
            driver.close();
        }

        Set<String> setFirst2 = driver.getWindowHandles();
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> setSecond2 = driver.getWindowHandles();
        setSecond2.removeAll(setFirst2);
        String finalDesc2 = setSecond2.iterator().next();
        driver.switchTo().window(finalDesc2);
        driver.get("https://www.w3schools.com/");
        System.out.println("Название страницы: " + driver.getTitle());
        System.out.println("Ссылка на страницу: " + driver.getCurrentUrl());
        if (driver.getTitle().toLowerCase().contains("зоопарк")) {

            System.out.println("Закрыта страница с названием " + driver.getTitle() + "");
            driver.close();
        }

        Set<String> setFirst3 = driver.getWindowHandles();
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> setSecond3 = driver.getWindowHandles();
        setSecond3.removeAll(setFirst3);
        String finalDesc3 = setSecond3.iterator().next();
        driver.switchTo().window(finalDesc3);
        driver.get("  https://taxi838.ua/ru/dnepr/");
        System.out.println("Название страницы: " + driver.getTitle());
        System.out.println("Ссылка на страницу: " + driver.getCurrentUrl());
        if (driver.getTitle().toLowerCase().contains("зоопарк")) {

            System.out.println("Закрыта страница с названием " + driver.getTitle() + "");
            driver.close();


        }

        Set<String> setFirst4 = driver.getWindowHandles();
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> setSecond4 = driver.getWindowHandles();
        setSecond4.removeAll(setFirst4);
        String finalDesc4 = setSecond4.iterator().next();
        driver.switchTo().window(finalDesc4);
        driver.get("https://klopotenko.com/");
        System.out.println("Название страницы: " + driver.getTitle());
        System.out.println("Ссылка на страницу: " + driver.getCurrentUrl());
        if (driver.getTitle().toLowerCase().contains("зоопарк")) {

            System.out.println("Закрыта страница с названием " + driver.getTitle() + "");
            driver.close();


        }
        Set<String> setFirst = driver.getWindowHandles();
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> setSecond = driver.getWindowHandles();
        setSecond.removeAll(setFirst);
        String finalDesc = setSecond.iterator().next();
        driver.switchTo().window(finalDesc);
        driver.get(" https://zoo.kiev.ua/");
        System.out.println("Название страницы: " + driver.getTitle());
        System.out.println("Ссылка на страницу: " + driver.getCurrentUrl());
        if (driver.getTitle().toLowerCase().contains("зоопарк")) {

            System.out.println("Закрыта страница с названием " + driver.getTitle() + "");
            driver.close();


        }
        Thread.sleep(3000);
        driver.quit();
    }}
