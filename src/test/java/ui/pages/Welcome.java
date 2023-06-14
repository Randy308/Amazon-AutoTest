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
    @FindBy(css = "a.nav-action-signin-button[href='https://www.amazon.com/-/es/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&']")
    private WebElement loginButton;

    public Welcome( ) {
        driver.get(SetUpEnv.BASE_URL());
    }
    public void gotoLogin() throws InterruptedException {
        // Javascript executor class with executeScript method
        JavascriptExecutor j = (JavascriptExecutor) driver;
        // set the display with style.display method
        j.executeScript ("document.getElementById('nav-flyout-accountList').style.display='block';");
        Thread.sleep(7000);
        action.click(loginButton);
    }
}


