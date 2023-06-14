package ui.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.core.AbstractPageObject;
import ui.core.SetUpEnv;

public class Home extends AbstractPageObject {

    @FindBy(css = "input#twotabsearchtextbox")
    private WebElement inputSearch;
    @FindBy(css = "input#nav-search-submit-button")
    private WebElement searchButton;

    @FindBy(css = "a.a-link-normal.s-underline-text.s-underline-link-text.s-link-style.a-text-normal[href]")
    private WebElement listaBusqueda;

    public Home( ) {
        driver.get(SetUpEnv.BASE_URL());
    }
    public void gotoSearch(String search) throws InterruptedException {
        // Javascript executor class with executeScript method
        JavascriptExecutor j = (JavascriptExecutor) driver;
        // set the display with style.display method
        j.executeScript ("document.getElementById('nav-search-bar-form').classList.toggle('nav-active');");
        Thread.sleep(7000);
        action.sendText(inputSearch,search);
        //Click en el boton continue
        action.click(searchButton);
    }

}

