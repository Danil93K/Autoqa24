package HomeworkElementDriver.Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    /* Задача 3*/
    /*Написать метод который выводит сообщение об айди элемента,
значении тэга элемента , значении класса элемента,
значении атрибута name элемента, текста данного элемента,
а также о координатах центра контейнера данного элемента.
Создать свой тип исключений, который будет вызываться если у элемента
нет определенного атрибута и на экран будет выводиться сообщение об отсутствии данного атрибута.
*/


    //getAttribute() получение значения атрибута элемента
    //getCssValue() получение значения заданного свойства CSS
    //getTagName() информация тэге выбранного элемента
    //getText() получение текста внктри элемента
    public static void getAttribute(WebElement element) throws NoSuchclassEx, NoSuchNameEx, NoSuchIdEx, NoSuchTextEx {
        System.out.println("Название тега: " + element.getTagName());

        if (element.getAttribute("id") == null) {
            throw new NoSuchIdEx("Аттрибута айди нет");
        } else {
            System.out.println("Аттрибута айди равен " + element.getAttribute("id"));
        }

        if (element.getAttribute("name") == null) {
            throw new NoSuchNameEx("Аттрибута нэйм нет");
        } else {
            System.out.println("Аттрибут name равен " + element.getAttribute("name"));
        }

        if (element.getAttribute("class") == null) {
            throw new NoSuchclassEx("Аттрибута класс нет");
        } else {
            System.out.println("Аттрибута class равен " + element.getAttribute("class")); }
        if (element.getText()  == null) {
            throw new NoSuchTextEx("Текста нет");
        } else {
            System.out.println("Текст = " + element.getText()); }

    }

    public static <ex> void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru/");
        WebElement Vhod= driver.findElement(By.xpath("//a[@data-modal='#sign-in']"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        try {
            getAttribute(driver.findElement(By.xpath("//a[@data-modal='#sign-in']")));//By.xpath("//a[@data-modal='#sign-in']
        } catch (NoSuchIdEx | NoSuchNameEx|NoSuchclassEx|NoSuchTextEx  ex) {
            System.out.println(ex.getMessage());
        }
        int x=Vhod.getLocation().x;
        int y=Vhod.getLocation().y;
        int visota=Vhod.getSize().height;
        int shirina=Vhod.getSize().width;
        System.out.println(x+" "+y+" "+visota+" "+shirina);

       double centrx=x+shirina/2;
        System.out.println("Координаты центра по X= "+centrx);
        double centry=y+visota/2;
        System.out.println("Координаты центра по Y= "+centry);




}}
