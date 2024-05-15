package hooks;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class driverHooks {

    public AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        String DIR = System.getProperty("user.dir");

        UiAutomator2Options options = new UiAutomator2Options();
        options.setUdid("emulator-5554");
        options.setAvd("Pixel_7_Pro");
        options.setApp(DIR + "/src/test/resources/apk/hrms_21_Mar_2024_v_1_0_0-release.apk");
        options.setAppPackage("com.noblesoftware.hrms");
        options.setAppActivity("com.noblesoftware.hrms.MainActivity");
        options.setAutomationName("UIAutomator2");
        options.setPlatformName(String.valueOf(Platform.ANDROID));
        options.setAvdLaunchTimeout(Duration.ofSeconds(32));

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

//    @BeforeMethod
//    public void baseConfig() {
//
//    }

    @AfterMethod
    public void setup(){}

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
