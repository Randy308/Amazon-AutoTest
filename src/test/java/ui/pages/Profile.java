package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.core.AbstractPageObject;

public class Profile extends AbstractPageObject {
    @FindBy(css = "span#nav-link-accountList-nav-line-1")
    private WebElement usernameTitle;


    public String getUsernameTitle(String attribute){

        JavascriptExecutor j = (JavascriptExecutor) driver;
        // set the display with style.display method
        //return action.getTextAttribute(usernameTitle,attribute);
        return (String) j.executeScript (" return document.getElementById('nav-link-accountList-nav-line-1').innerText;");
    }


}

