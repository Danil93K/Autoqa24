package HomeWorkWaiters;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import java.util.function.Function;

public class HomeWorkWaiters {
/*
      - presenceOfElementLocated()
     - textToBePresentInElementValue()
     - invisibilityOf()
     - titleContains()
     - titleIs()
     - elementToBeClickable()
     - elementToBeSelected()
     - elementSelectionStateToBe()
     - visibilityOfElementLocated()
     - frameToBeAvailableAndSwitchToIt()
     - alertIsPresent()
*/

    private final WebDriver driver;

    public HomeWorkWaiters(WebDriver driver) {

        this.driver = driver;
    }
    private static final long EXPLICITY_WAIT = 10L;
    private FluentWait<WebDriver> fluentWait(Long duration) {
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(duration))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(InvalidElementStateException.class)
                .ignoring(StaleElementReferenceException.class);

    }
    private void waitForFunction(Function function, Long timeout) {
        FluentWait<WebDriver> wait = fluentWait(timeout);
        wait.until(function);
    }



    //waitVisabilityOfWebElement
    public void waitVisabilityOfWebElemet(WebElement element) {
        waitForFunction(ExpectedConditions.visibilityOf(element), EXPLICITY_WAIT);
    }

    public void waitVisabilityOfWebElement(By by) {
        waitForFunction(ExpectedConditions.visibilityOf(driver.findElement(by)), EXPLICITY_WAIT);
    }

    public WebElement waitVisabilityOfWebElementReturn(WebElement element) {
        return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitVisabilityOfWebElementReturn(By by) {
        return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.visibilityOf(driver.findElement(by)));
    }
     //- alertIsPresent()

     public Alert waitForAlertAndSwitchToIt() {
         return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.alertIsPresent());}
     //- frameToBeAvailableAndSwitchToIt()
     public void waitForFrameAndSwitchToIt(By by) {
         waitForFunction(ExpectedConditions.visibilityOf(driver.findElement(by)), EXPLICITY_WAIT);
         waitForFunction(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by), EXPLICITY_WAIT);
     }
    public void waitForFrameAndSwitchToIt(WebElement element) {
        waitForFunction(ExpectedConditions.visibilityOf(element), EXPLICITY_WAIT);
        waitForFunction(ExpectedConditions.frameToBeAvailableAndSwitchToIt( element), EXPLICITY_WAIT);
    }
    //- visibilityOfElementLocated()

    public void waitForVisabilityOfElement(By by) {
        waitForFunction(ExpectedConditions.visibilityOfElementLocated(by), EXPLICITY_WAIT);
    }
    public WebElement waitForVisabilityOfElementReturn(By by) {
        return fluentWait(EXPLICITY_WAIT).until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    // - elementSelectionStateToBe()
    public void waitElementStateToBe(WebElement element, boolean boo) {
        waitForFunction(ExpectedConditions.elementSelectionStateToBe(element, boo), EXPLICITY_WAIT);
    }
    public void waitElementStateToBe(By by, boolean boo) {
        waitForFunction(ExpectedConditions.elementSelectionStateToBe(driver.findElement(by), boo), EXPLICITY_WAIT);
    }
    //- elementToBeSelected()
    public void waitElementToBeSelected(WebElement element) {
        waitForFunction(ExpectedConditions.elementToBeSelected(element), EXPLICITY_WAIT);
    }
    public void waitElementToBeSelected(By by) {
        waitForFunction(ExpectedConditions.elementToBeSelected(driver.findElement(by)), EXPLICITY_WAIT);
    }
    //- elementToBeClickable()
    public void waitElementToBeClickable(WebElement element) {
        waitForFunction(ExpectedConditions.elementToBeClickable(element), EXPLICITY_WAIT);
    }
    public void waitElementToBeClickable(By by) {
        waitForFunction(ExpectedConditions.elementToBeClickable(driver.findElement(by)), EXPLICITY_WAIT);
    }
   //- titleIs()
   public void waitTitleIsText(String text) {
        waitForFunction(ExpectedConditions.titleIs(text), EXPLICITY_WAIT);}
    // titleContains()
    public void waitTitleContainsText(String text) {
        waitForFunction(ExpectedConditions.titleContains(text), EXPLICITY_WAIT);
    }
    //- invisibilityOf()
    public void waitInvisibilityOf(WebElement element) {
        waitForFunction(ExpectedConditions.invisibilityOf(element), EXPLICITY_WAIT);
    }

    public void waitInvisibilityOf(By by) {
        waitForFunction(ExpectedConditions.invisibilityOf(driver.findElement(by)), EXPLICITY_WAIT);
    }
    //- textToBePresentInElementValue()
    public void waitTextToBePresentInElementValue(WebElement element,String text) {
        waitForFunction(ExpectedConditions.textToBePresentInElementValue(element,text), EXPLICITY_WAIT);
    }
    public void waitTextToBePresentInElementValue(By by,String text) {
        waitForFunction(ExpectedConditions.textToBePresentInElementValue(by,text), EXPLICITY_WAIT);
    }
    //presenceOfElementLocated()
    public void waitPresenceOfElementLocated(By by) {
        waitForFunction(ExpectedConditions.presenceOfElementLocated(by), EXPLICITY_WAIT);}

























}
