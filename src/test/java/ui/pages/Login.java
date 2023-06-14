package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.core.AbstractPageObject;

public class Login extends AbstractPageObject {
    @FindBy(css ="input#ap_email" )
    private WebElement userNameText;
    @FindBy(css = "input.a-button-input")
    private WebElement loginNameButton;
    @FindBy(css = "input#ap_password")
    private WebElement passwordText;
    @FindBy(css = "input#signInSubmit")
    private WebElement passwordLoginButton;
    @FindBy(css = "div.a-box-inner.a-alert-container div ul li span")
    private WebElement messageError;

    @FindBy(css = "a#ap-account-fixup-phone-skip-link")
    private WebElement phoneSkip;

   public void login (String user, String password ) throws InterruptedException {
       action.sendText(userNameText,user);
       //Click en el boton continue
       action.click(loginNameButton);
       //Escribimos el password
       action.sendText(passwordText,password);
       //Click en el boton Login
       Thread.sleep(10000);
       action.click(passwordLoginButton);
       Thread.sleep(5000);
       //action.click(phoneSkip);
   }
   public String getMessage(){
      return  action.getText(messageError);
   }

}


