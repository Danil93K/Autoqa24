package HomeWorkSelectAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 {
    /* Задача 1 */
    /* http://only-testing-blog.blogspot.com/2014/01/textbox.html?
Написать программу реализующую действие показанное на "видео1.mp4".
После выполнения программы на консоли должна выводится информация в следующем виде:

Автомобили доступные для выбора:
Volvo, BMW, Opel, Audi, Toyota, Renault, Maruti Car.
Страны из первой таблицы:
USA, Russia, Japan, Mexico, India, Malaysia, Greece.
Страны из второй таблицы:
France, Germany, Italy, Spain.*/
    //select[@name='FromLB'] Left Table
    //select[@id='Carlist'] Carlist
    //select[@name='ToLB'] Right Table

    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
        Select selectCarlist = new Select(driver.findElement(By.xpath("//select[@id='Carlist']")));
        selectCarlist.selectByVisibleText("Renault");
        Select selectLeftTable = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
        //System.out.println(selectLeftTable.isMultiple());
        selectLeftTable.selectByVisibleText("France");
        selectLeftTable.selectByVisibleText("India");
        selectLeftTable.deselectByVisibleText("India");
        selectLeftTable.selectByVisibleText("Germany");
        selectLeftTable.selectByVisibleText("Italy");
        selectLeftTable.selectByVisibleText("Malaysia");
        selectLeftTable.deselectByVisibleText("Malaysia");
        selectLeftTable.selectByVisibleText("Spain");
        driver.findElement(By.xpath("//input[@value='->']")).click();
        System.out.println("Avto dostupnie dlya vibora: ");
        List<WebElement> carList = selectCarlist.getOptions();

        for (WebElement Car:carList){

            System.out.print(" "+Car.getText());
        }
        Select selectRightTable = new Select(driver.findElement(By.xpath("//select[@name='ToLB']")));
        System.out.println("");
        System.out.println("Strani iz pervoy tablici ");
        for (WebElement strani : selectLeftTable.getOptions()) {
            System.out.print(" "+strani.getText());
        }
        System.out.println("");
        System.out.println("Strani iz vtoroy tablici ");
        for (WebElement strani1 : selectRightTable.getOptions()) {
            System.out.print(" "+strani1.getText());
        }
        driver.quit();













    }   }
