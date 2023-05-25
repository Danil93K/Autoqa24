package HomeWorkFramesWindowHandleAlert;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class HomeWorkFramesWindowHandleAlert {
    public static void main(String[] args) throws InterruptedException {
        //textarea[@id='APjFqb']
        //h3[text()='Create account | Guinness World Records']
        //span[@class='ExCKkf z1asCe rzyADb']
        //h3[text()='AlertsDemo - H Y R Tutorials']
        //input[@id='fname']
        //input[@id='lname']
        //input[@value='Submit']
        //iframe[@id='iframeResult']
        //strong[text()='Note:']
        //div[@class='w3-panel w3-pale-yellow w3-leftbar w3-border-yellow']
        //Guiness
        //input[@name='LastName']
        ////input[@name='FirstName']
        //input[@class='input-mini dob-day'] day
        //input[@class='input-mini dob-month'] Month
        //input[@class='input-mini dob-year'] year
        //a[@href='/about-us/']
        //input[@id='EmailAddress']
        //input[@id='ConfirmEmailAddress']
        //input[@id='Password']
        //input[@id='ConfirmPassword']
        //span[@data-valmsg-for='ConfirmPassword'] oshibka Confirm password
        //alerti
        //button[@id='alertBox']
        //div[@id='output'] -get text
        //button[@id='confirmBox']
        //div[@id='output'] -get text
        //button[@id='promptBox']
        //div[@id='output'] -get text
        //input[@name='State']

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("https://www.guinnessworldrecords.com/account/register?");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).submit();
        String descrFirs = driver.getWindowHandle();
        Set<String> firsDescriptors = driver.getWindowHandles();
        Actions actions = new Actions(driver);

        actions.moveToElement(driver.findElement
                        (By.xpath("//h3[text()='Create account | Guinness World Records']")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        driver.findElement(By.xpath("//span[@class='ExCKkf z1asCe rzyADb']")).click();
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).submit();
        Set<String> secondDescriptors = driver.getWindowHandles();
        secondDescriptors.removeAll(firsDescriptors);
        String descrSecond = secondDescriptors.iterator().next();
        actions.moveToElement(driver.findElement
                        (By.xpath(" //h3[text()='AlertsDemo - H Y R Tutorials']")))
                .keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@id='fname']")).clear();
        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Danil");
        driver.findElement(By.xpath("//input[@id='lname']")).clear();
                driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Kuchuk");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//div[@class='w3-panel w3-pale-yellow w3-leftbar w3-border-yellow']")).getText());
         Set<String> thirdDescriptors = driver.getWindowHandles();
        thirdDescriptors.removeAll(secondDescriptors);
        thirdDescriptors.removeAll(firsDescriptors);
        String descrThree = thirdDescriptors.iterator().next();
        driver.switchTo().window(descrSecond);
        driver.get("https://www.guinnessworldrecords.com/account/register");
        Thread.sleep(120000);
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Kuchuk");
        Thread.sleep(7000);
        driver.findElement(By.xpath(" //input[@name='FirstName']")).sendKeys("Danil");
        Thread.sleep(7000);
        driver.findElement(By.xpath(" //input[@class='input-mini dob-day']")).sendKeys("22");
        Thread.sleep(7000);
        driver.findElement(By.xpath(" //input[@id='DateOfBirthMonth']")).sendKeys("02");
        Thread.sleep(7000);
        driver.findElement(By.xpath(" //input[@class='input-mini dob-year']")).sendKeys("1993");
        Thread.sleep(7000);
        Select selectCountrylist = new Select(driver.findElement(By.xpath("//select[@name='Country']")));
        selectCountrylist.selectByVisibleText("Ukraine");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//input[@name='State']")).sendKeys("Zaporozhye");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//input[@id='EmailAddress']")).sendKeys("aaa@gmail.cum");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//input[@id='ConfirmEmailAddress']")).sendKeys("aaa@gmail.cum");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("aaa@gmail.cum");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("1aaa@gmail.cum");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).submit();
        Thread.sleep(7000);
        System.out.println(driver.findElement(By.xpath(" //span[@data-valmsg-for='ConfirmPassword']")).getText());
        driver.switchTo().window(descrThree);
        driver.findElement(By.xpath("//button[@id='alertBox']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
        driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
        driver.findElement(By.xpath("//button[@id='promptBox']")).click();
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("'Final step of this task'");
        alert3.accept();
        System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
        driver.quit();























        






}}