package steps;

import hooks.driverHooks;
import org.testng.annotations.Test;
import pages.HomePage;

public class homePageTest extends driverHooks {

    @Test
    public void skipBtn() throws InterruptedException {
        HomePage hmp = new HomePage(driver);
        hmp.clickSkipBtn();
        Thread.sleep(1000);
    }

    @Test
    public void nextBtn() throws InterruptedException {
        HomePage hmp = new HomePage(driver);
        hmp.clickNextBtn();
    }
}
