package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.AndroidActions;

public class loginPage extends AndroidActions {

    AndroidDriver driver;

    public loginPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform" +
            ".ComposeView/android.view.View/android.view.View/android.view.View/android.widget" +
            ".ScrollView/android.widget.EditText[1]")
    private WebElement usn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform" +
            ".ComposeView/android.view.View/android.view.View/android.view.View/android.widget" +
            ".ScrollView/android.widget.EditText[2]")
    private WebElement pass;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform" +
            ".ComposeView/android.view.View/android.view.View/android.view.View/android.widget" +
            ".ScrollView/android.view.View[2]/android.widget.Button")
    private WebElement btn;

    public void login(String a){
        usn.isDisplayed();
        usn.sendKeys(a);
    }

    public void pass(String b){
        pass.isDisplayed();
        pass.sendKeys(b);
    }

    public void btnLogin(){
        btn.isEnabled();
        btn.click();
    }
}
