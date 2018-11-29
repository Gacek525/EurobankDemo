package pl.b2b.eurobank.pages.savingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pl.b2b.eurobank.SingletonWebDriver;
import pl.b2b.eurobank.pages.loginPage.MethodLoginPage;
import pl.b2b.eurobank.pages.paymentPage.MethodRecipient;
import pl.b2b.eurobank.pages.savingPage.MethodSavingPage;

public class TestSavingPage {

    private SingletonWebDriver singletonWebDriver;
    private WebDriver webDriver;
    private WebDriverWait wait;
    private MethodLoginPage methodLoginPage;
    private MethodRecipient methodRecipient;
    private MethodSavingPage methodSavingPage;


    @BeforeClass
    public void setUp() {
        singletonWebDriver = SingletonWebDriver.getInstance();
        webDriver = singletonWebDriver.getWebDriver();
        wait = singletonWebDriver.getWait();
        methodSavingPage = new MethodSavingPage(webDriver, wait);
    }

    @Test
    public void testOszczednosci () {

    }
}
