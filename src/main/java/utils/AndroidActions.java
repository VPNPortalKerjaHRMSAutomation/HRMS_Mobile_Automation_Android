package utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class AndroidActions {

    AndroidDriver driver;

    public AndroidActions(AndroidDriver driver){
        this.driver = driver;
    }

    public void longPressAction(WebElement element){
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",  // Longclick Function Method Javascript Executor
                ImmutableMap.of("elementId", ((RemoteWebElement)element).getId(),  // Place for Web Element
                        "duration", 2000));  // Longclick duration
    }

    public void scrollToElement(String text){  // Scroll to element with text
          driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
    }

}
