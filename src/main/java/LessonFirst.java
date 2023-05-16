import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LessonFirst {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();driver.manage().window().maximize();
        driver.get("https://football.ua/");

    }

}
