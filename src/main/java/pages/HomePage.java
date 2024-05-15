package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.AndroidActions;

public class HomePage extends AndroidActions {

    AndroidDriver driver;

    public HomePage(AndroidDriver driver){
        super(driver);  // Page Constructor
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.noblesoftware.hrms:id/btnSkip")
    private WebElement skipBtn;

    @AndroidFindBy(id = "com.noblesoftware.hrms:id/btnNext")
    private WebElement nextBtn;

    @AndroidFindBy(id = "com.noblesoftware.hrms:id/btnStart")
    private WebElement strBtn;

    public void clickSkipBtn(){
        skipBtn.click();
    }

    public void clickNextBtn() throws InterruptedException {
        nextBtn.click();
        Thread.sleep(1000);
        nextBtn.click();
        Thread.sleep(1000);
        strBtn.click();
        Thread.sleep(1000);
    }
}
