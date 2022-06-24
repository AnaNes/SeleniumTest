package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {


    //String invalidePassword = excelReader.getStringData("Login",1,3);

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

    @Test (priority = 100)
    public void successfulLogin() throws InterruptedException {

        String validUsername = excelReader.getStringData("Login",1,0);
        String validPassword = excelReader.getStringData("Login",1,1);

        loginpage.insertUsername(validUsername);
        loginpage.insertPassword(validPassword);
        Thread.sleep(2000);
        loginpage.clickOnLoginButton();
        vissibilityWait(logoutPage.getLogoutButton());

        Assert.assertTrue(logoutPage.getLogoutButton().isDisplayed());



    }
    /* @Test (priority = 50)
    public void invalideUsernameTest() throws InterruptedException {

         String invalideUsername = excelReader.getStringData("Login",1,2);
         String validPassword = excelReader.getStringData("Login",1,1);


         loginpage.insertUsername(invalideUsername);
         loginpage.insertPassword(validPassword);
         Thread.sleep(2000);
         loginpage.clickOnLoginButton();

         boolean check =false;
         try {
           check = driver.findElement(By.id("flash"))
         } catch (Exception e) {

         } */


         //htela sam da pokusam i try catch ali nisam bila sigurna  koji lokator :)
         //stavila bih i Assert.assertFalse(check);
         // Assert.assertTrue(message.isDisplayed());
    // isto sam htela da uradim samo kad je password netacan a username tacan ali zbog lokatora nije bilo vremena



    @AfterMethod
    public void removeCookies(){
     driver.manage().deleteAllCookies();
    }
     }
