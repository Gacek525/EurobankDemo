package pl.b2b.eurobank.pages.savingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MethodSavingPage {

    private WebDriver webDriver;
    private WebDriverWait wait;

    public MethodSavingPage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
        PageFactory.initElements(webDriver, this);

    }

    @FindBy(xpath = SavingData.START_ASSERT)
    private WebElement start_assert;


    public WebElement getStart_assert() {
        return start_assert;
    }

    public void setStart_assert(WebElement start_assert) {
        this.start_assert = start_assert;
    }
}