package COM.Carlsberg.TestCases;

import COM.Carlsberg.PageObjects.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Allure;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class LoginTest1 extends BaseClass
{
    private AndroidDriver<AndroidElement> driver1 = capabilities();

    public LoginTest1() throws MalformedURLException
    {
        // Assert.assertEquals(h11,h12);
        // Reporter.log("test() method is Start",true);
    }

    public LoginTest1(AndroidDriver<AndroidElement> driver1) throws IOException
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver1) ,this);
    }

    @BeforeTest
    void befrtest()
    {
        logger.info("Before test started");
    }


    @Test(priority = 0, description = "Verify Login")
    void loginTest() throws Exception {
        driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        logger.info("Opening the app");
        LoginPage l1 = new LoginPage(driver1);

        logger.info("Displaying Login Page");
        l1.enterMobileNumber("9922223333");
        Thread.sleep(3000);
        logger.info("Entered mobile number");
        l1.clickLoginButton();

        Thread.sleep(3000);

        if(isAlertPresent() == true)
        {
            Thread.sleep(3000);
            l1.tapMobileField()
                    .enterMobileNumber("9972822275");
        }

        else
        {
            logger.info("Login Passed");
        }



        }

    private boolean isAlertPresent() //user defined method created to check alert is presetn or not
    {
        try
        {

            logger.info("Oops! This mobile number does not exist in our database");
            //driver1.switchTo().alert();
            captureScreen(driver1, "Mobile number does not exits");
            return true;
        }
        catch (NoAlertPresentException e)
        {
            return false;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @AfterSuite
    void tearDown()
    {
        driver1.quit();
    }



}
