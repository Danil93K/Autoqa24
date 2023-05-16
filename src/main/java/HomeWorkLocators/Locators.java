package HomeWorkLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    ////div[@class='phone-content'] Shag telefon
    ////h2[@class='re-section-title re-home-children__title'] Obrazovanie shag dlya detey



    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://itstep.dp.ua/ru");
        // 1 папка
        //url Хомяк "https://uhomki.com.ua/koshki/1074/"
        //driver.findElement(By.xpath("//a[@data-modal='#sign-in']")).click();// Кнопка "Вход" хомяк.
        //driver.findElement(By.xpath("//div[@class='userbar j-user-tabs']")).click();// Кнопка "Вход" хомяк.
       // driver.findElement(By.xpath("//div[@data-skin='header_top']")).click();// Кнопка "Вход" хомяк.
        //driver.findElement(By.xpath("//span[text()='Вход'][1]")).click();// Кнопка "Вход" хомяк.
        // 2 папка
        //url Хомяк https://uhomki.com.ua/ru/koshki/1074/
        //driver.findElement(By.xpath("//a[text()='Собаки и кошки общее']")).click();//Найти элемент "Каталог", а при помощи него найти путь к элементу   "Собаки/кошки общее" используя xpath.
        // 3 папка
        // url https://itstep.dp.ua/ru
        System.out.println(
                driver.findElement(By.xpath
                       ("//h2[contains(text(), 'IT специальностям')]")).getText()); //Найти данный элемент по тексту "IT специальностям"
        // 4 папка
        //url https://uhomki.com.ua/koshki/1074/
        //xpath-//span[text()='Аквариумы']
        // 5 папка
        // https://itstep.dp.ua/ru
        //xpath-//img[@alt='phone']
        // 6 папка
        // https://itstep.dp.ua/ru
       //xpath- h2[@class='re-section-title re-home-children__title']
        // 7 папка
        //https://www.w3schools.com/ найти 10 элементов на странице, для нахождения которых можно использовать
        //только айди и с которыми можно взаимодействовать. (Кликнуть, ввести текст и т.д.)
        //1 driver.findElement(By.id("loginactioncontainer")).click();
        //2 signupbtn_topnav
        //3 cert_navbtn
        //4 search2
        //5 listofsearchresults
        //6 navbtn_exercises
        //7 navbtn_tutorials
        //8 nav_search_btn
        //9 nav_translate_btn
        //10 myLearningFromDefault
        // 8 папка
        //https://itstep.dp.ua/ru
        // Thread.sleep(2000);
         //driver.findElement(By.xpath("//h3[text()='Программирование']")).click();
        //driver.findElement(By.xpath("//h3[text()='Программирование']/../../../div[5]")).click();
        // 9 папка
        //https://www.jetbrains.com/idea/
       // driver.findElement(By.xpath("//a[@class='wt-col-inline menu-second__download-button wt-button wt-button_size_s wt-button_mode_primary']")).click();
        //  10 папка
        // https://www.jetbrains.com/idea/download/#section=windows
        //driver.findElement(By.xpath("//p[text()='Free 30-day trial available']/../../span/a")).click();
        //driver.findElement(By.xpath("//a[@class='_main_12yxkch_17 _modeRock_12yxkch_208 _sizeM_12yxkch_99 _alignIconLeft_12yxkch_77 _light_12yxkch_59" +
        //" _flatRight_12yxkch_125 _wtDownloadButton__left_3gbaqk _wtDownloadButton__left_2sbscl _wtDownloadButton__left_45alcl']")).click();
        driver.quit();








        



}}
