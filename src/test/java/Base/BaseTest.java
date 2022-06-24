package Base;

import Pages.LogOutPage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {


    public WebDriver driver;
    public WebDriverWait wdwait;
    public LoginPage loginpage;
    public ExcelReader excelReader;
    public LogOutPage logoutPage;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        loginpage = new LoginPage(driver, wdwait);
        excelReader = new ExcelReader("C:\\Users\\BG HiL Computers\\OneDrive\\Desktop\\SeleniumTest.xlsx");
        logoutPage = new LogOutPage(driver, wdwait);
    }

    public void vissibilityWait(WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }




    @AfterClass
    public void tearDown(){
        //driver.quit();
        //driver.close();
    }

}


