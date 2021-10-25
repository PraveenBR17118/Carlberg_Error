package COM.Carlsberg.PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    AndroidDriver<AndroidElement> driver;

    public LoginPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver) ,this);
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.EditText[@id = '3086a08c-bcfb-4631-a8df-0c2426b19b89']"),
                    @AndroidBy(xpath = "//android.widget.EditText[@id = 'eab525ad-d202-4bfd-b752-4f4cbdac1c1d']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[147,1593][1295,1757]']"),
                    @AndroidBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView"),
                    @AndroidBy(xpath = "//html/body/app-root/ion-app/ion-router-outlet/app-login/ion-content/ion-grid/ion-row[2]/ion-col/div[1]/ion-input/input")
            })

    public WebElement EnterYourMobileNumber;

    public LoginPage tapMobileField()
    {
        EnterYourMobileNumber.click();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.EditText[@id = '3086a08c-bcfb-4631-a8df-0c2426b19b89']"),
                    @AndroidBy(xpath = "//android.widget.EditText[@id = 'ebc33e64-d5c0-48ba-8700-dd93b071dd2a']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[147,1593][1295,1757]']"),
                    @AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.widget.EditText")
                    //@AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[147,1019][971,1117]']")
            })

    public WebElement EnterMobileNumber;

    public LoginPage enterMobileNumber(String a)
    {
        EnterMobileNumber.sendKeys(a);
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.Button[@id = '5093af14-33b9-4b0e-ac50-96950df37e87']"),
                    @AndroidBy(xpath = "//android.widget.Button[@text = 'LOGIN']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.Button' and @bounds='[409,1733][1032,1915]']"),
                    @AndroidBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View"),
                    @AndroidBy(xpath = "//html/body/app-root/ion-app/ion-router-outlet/app-login/ion-content/ion-grid/ion-row[2]/ion-col/div[2]/ion-button")
            })

    public WebElement LoginButton;

    public LoginPage clickLoginButton()
    {
        LoginButton.click();
        return this;
    }

}
