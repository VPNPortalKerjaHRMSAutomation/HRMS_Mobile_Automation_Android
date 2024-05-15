package steps;

import hooks.driverHooks;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.loginPage;

public class loginPageTest extends driverHooks {

    @Test
    public void appiumTest() throws InterruptedException {

        HomePage hmp = new HomePage(driver);
        loginPage lgp = new loginPage(driver);

        hmp.clickSkipBtn();
        Thread.sleep(1000);
        lgp.login("mafa.alfa75+111@gmail.com");
        Thread.sleep(1000);
        lgp.pass("Aldan09876");
        Thread.sleep(1000);
        lgp.btnLogin();
        Thread.sleep(1000);
    }
}
