package HomeworkElementDriver.Task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {/* Задача 4*/
    /*https://uhomki.com.ua/
Написать метод, который будет выводить в консоль тексты всех
элементов, которые можно найти по заданнму параметру.
Например при помощи него можно будет получить значения всех элементов
из списков заданных на "Рисунок 4.png" и "Рисунок 5.png".*/
    //
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru/");

        System.out.println(driver.findElement(By.xpath("//div[@class='products-menu__title']")).getText());// Sobaki
        System.out.println(driver.findElement(By.xpath("//a [@href='/ru/koshki/1074/']     ")).getText());// Koshki
       System.out.println(driver.findElement(By.xpath("//a [@href='/ru/sobaki-koshki-obshchee/']  ")).getText());//Sobaki i koshki obshee
        System.out.println(driver.findElement(By.xpath("//a [@href='/ru/khorki/1093/']")).getText());// Horki
        System.out.println(driver.findElement(By.xpath("//a [@href='/ru/gryzuny/1098/']")).getText());// Grizuni
        System.out.println(driver.findElement(By.xpath("//a [@href='/ru/terrariumistika/1118/'] ")).getText());// Teraumistika
        System.out.println(driver.findElement(By.xpath("//a  [@href='/ru/akvariumistika/1124/']")).getText());// Akvariumistika
        System.out.println(driver.findElement(By.xpath("//a [@href='/ru/selskokhozyaystvennye-tovary/1131/'] ")).getText());// Selhoz tovari
        System.out.println(driver.findElement(By.xpath("//a [@href='/ru/veterinariya/1140/'] ")).getText());// Veterinar
        System.out.println("============");
        System.out.println(driver.findElement(By.xpath("//div[@class='header__column header__column--center ']")).getText());// Header
        System.out.println("============");
        System.out.println(driver.findElement(By.xpath("//div[@class='footer__col '] ")).getText());// Footer Katalog
        System.out.println("============");
        System.out.println(driver.findElement(By.xpath("/html/body/div[2]/footer/div/div/div/div[3]/div   ")).getText());// Footer KLientam
    }

}
