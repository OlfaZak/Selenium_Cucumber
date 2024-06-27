package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_object.LoginPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginOutlineStepDefinition {
	public LoginPage loginPage ;
	public SeleniumUtils seleniumUtils ;
	public ConfigFileReader configFileReader ;
	
	public LoginOutlineStepDefinition() {
		loginPage =new LoginPage() ;
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
	}
	

	@Given("Je visite le site nopecommerce")
	public void jeVisiteLeSiteNopecommerce() {
		seleniumUtils.get(configFileReader.getProperties("home.url"));
	}


	@When("Je saisie adresse mail {string}")
	public void jeSaisieAdresseMail(String email) {
		seleniumUtils.writeText(LoginPage.getEmail(),email);
	 
	}
	@When("Je saisie un mot de passe {string}")
	public void jeSaisieUnMotDePasse(String password) {
		seleniumUtils.writeText(LoginPage.getPassword(),password);
	   
	}






}
