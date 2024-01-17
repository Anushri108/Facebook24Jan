package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass {
	
	
	@FindBy(name="reg_email__")
	private WebElement email;
	
	@FindBy(name="reg_passwd__")
	private WebElement pass;
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterusernameandpass(String email1,String pass1)
	{
		email.sendKeys(email1);
		pass.sendKeys(pass1);
	}

}
