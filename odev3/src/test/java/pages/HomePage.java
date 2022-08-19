package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

public class HomePage {
    By buttonOturumAc = By.cssSelector(".gb_1.gb_2.gb_8d.gb_8c");
    By checkText = By.cssSelector(".ahT6S ");
    By eposta = By.id("identifierId");
    By button = By.cssSelector("#identifierNext div button");
    By password = By.id("password");
    By button1 = By.cssSelector("#passwordNext > div > button > div.VfPpkd-RLmnJb");
    By checkLogin = By.cssSelector(".gb_Ba.gbii");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void goToLoginPage(){
        driver.get("https://accounts.google.com/signin/v2/identifier?hl=tr&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    }

    public void clickLoginButton(){
        driver.findElement(buttonOturumAc).click();
    }
    public void checkLoginPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(checkText));
    }
    public void enterEposta(){
        driver.findElement(eposta).sendKeys("gizemtrkgl@gmail.com");
        driver.findElement(button).click();
    }
    public void enterPassword(){
        driver.findElement(password).sendKeys("12345432");
        driver.findElement(button1).click();
    }
    public void checkPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(checkLogin));
    }

}
