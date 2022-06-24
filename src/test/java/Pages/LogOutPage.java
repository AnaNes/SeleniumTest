package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOutPage {

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement logoutButton;
    WebElement message;

    public LogOutPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getLogoutButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/a/i"));
    }

    public WebElement getMessage() {
        return driver.findElement(By.className("subheader"));
    }
    public void clickOnlogoutbutton(){
        this.getLogoutButton().click();
    }
}
