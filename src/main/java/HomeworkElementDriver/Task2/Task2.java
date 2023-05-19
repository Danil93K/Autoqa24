package HomeworkElementDriver.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {/*Задача2*/
    /*Написать метод в параметры которого принимаются два ВебЭлемента.
метод выводит в консоль информацию какой из двух элементов располагается  выше на странице,
какой из элементов располагается левее на странице,
а также какой из элементов занимает большую площадь.
Параметры метода могут также включать в себя другие аргументы, если это необходимо.*/

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru/");
        System.out.println("X Vhod");
        System.out.println(driver.findElement(By.xpath("//span[text()='Вход']")).getLocation().x);
        System.out.println("Y Vhod");
        System.out.println(driver.findElement(By.xpath("//span[text()='Вход']")).getLocation().y);
        System.out.println("==========================");
        System.out.println("X Контактная информация");
        System.out.println(driver.findElement(By.xpath("//a[text()='Контактная информация']")).getLocation().x);
        System.out.println("Y Контактная информацияв");
        System.out.println(driver.findElement(By.xpath("//a[text()='Контактная информация']")).getLocation().y);
        System.out.println("Размер кнапки Вход " +driver.findElement(By.xpath("//span[text()='Вход']")).getSize());
        System.out.println("Размер нкнапки Контактная информация " +driver.findElement(By.xpath("//a[text()='Контактная информация']")).getSize());
        System.out.println("==============");
        System.out.println("Высота  Контактная информация " +driver.findElement(By.xpath("//a[text()='Контактная информация']")).getSize().height);
        System.out.println("Ширина  Контактная информация " +driver.findElement(By.xpath("//a[text()='Контактная информация']")).getSize().width);
        System.out.println("=========");

       System.out.println("Высота  кнопки Вход " + driver.findElement(By.xpath("//span[text()='Вход']")).getSize().height);
        System.out.println("Ширина  кнопки Вход " + driver.findElement(By.xpath("//span[text()='Вход']")).getSize().width);
        System.out.println("==============");
        if (driver.findElement(By.xpath("//a[text()='Контактная информация']")).getLocation().y>driver.findElement(By.xpath("//span[text()='Вход']")).getLocation().y){
            System.out.println("Кнопка Вход находиться выше");
        }
        if (driver.findElement(By.xpath("//a[text()='Контактная информация']")).getLocation().y<driver.findElement(By.xpath("//span[text()='Вход']")).getLocation().y){
            System.out.println("Кнопка Контактная информация находиться выше");}
        System.out.println("==========");

        if (driver.findElement(By.xpath("//a[text()='Контактная информация']")).getLocation().x>driver.findElement(By.xpath("//span[text()='Вход']")).getLocation().x){
            System.out.println("Кнопка Вход находиться  левее  ");
        }
        if (driver.findElement(By.xpath("//a[text()='Контактная информация']")).getLocation().x<driver.findElement(By.xpath("//span[text()='Вход']")).getLocation().x){
            System.out.println("Кнопка Контактная информация находиться левее");}
        int Svhod=driver.findElement(By.xpath("//span[text()='Вход']")).getSize().height*driver.findElement(By.xpath("//span[text()='Вход']")).getSize().width;
        System.out.println("Площадь кнопки Вход = "+Svhod);
        int Scontact=driver.findElement(By.xpath("//a[text()='Контактная информация']")).getSize().height*driver.findElement(By.xpath("//a[text()='Контактная информация']")).getSize().width;
        System.out.println("Площадь кнопки Контактная информация = "+Scontact);
        if(Svhod>Scontact){
            System.out.println("Площадь кнопки Вход больше чем кнопки Контактная информация");

        }
       if(Svhod<Scontact){
            System.out.println("Площадь кнопки Контактная информация больше чем Площадь кнопки Вход");

        }
       driver.quit();


    }

}
