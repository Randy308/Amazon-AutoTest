package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.core.AbstractPageObject;
import ui.core.SetUpEnv;
import org.openqa.selenium.JavascriptExecutor;

public class Welcome extends AbstractPageObject {

    @FindBy(css = "div#nav-flyout-accountList")
    private WebElement div_lista;
    @FindBy(css = "div#nav-flyout-ya-signin  a.nav-action-signin-button[href]")
    private WebElement loginButton;

    public Welcome( ) {
        driver.get(SetUpEnv.BASE_URL());
    }
    public void gotoLogin() throws InterruptedException {
        // Javascript executor class with executeScript method
        JavascriptExecutor j = (JavascriptExecutor) driver;
        // set the display with style.display method
        Thread.sleep(2000);
        j.executeScript ("document.getElementById('nav-flyout-accountList').style.display='block';");
        Thread.sleep(1000);
        action.click(loginButton);
    }
}


