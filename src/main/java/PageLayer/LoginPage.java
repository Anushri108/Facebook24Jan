package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(name="firstname")
	private WebElement fname;
	
	@FindBy(name="lastname")
	private WebElement lname;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterfnameandlname(String fname1,String lname1)
	{
		fname.sendKeys(fname1);
		lname.sendKeys(lname1);
	}

}
