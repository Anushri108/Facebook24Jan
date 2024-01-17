package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageStepDef extends BaseClass{
	
	
	
	@Given("User is on FaceBook page")
	public void user_is_on_face_book_page() {
		
		
		BaseClass.initialization();
	
	}

	@When("user enter firstname,lastname")
	public void user_enter_firstname_lastname() {
		
			
		LoginPage login=new LoginPage();
		login.enterfnameandlname("Anushri", "Patil");
	    
	  }
	
	@When("user enter mobile_no and password")
	public void user_enter_mobile_no_and_password() {
		
		RegisterPage rg=new RegisterPage();
		rg.enterusernameandpass("patilanushri14@gmail.com", "Anu@1499");

	}

	

}
