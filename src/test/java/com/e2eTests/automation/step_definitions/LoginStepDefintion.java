package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_object.LoginPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefintion {
	
	public LoginPage loginPage ;
	public ConfigFileReader configFileReader ;
	public SeleniumUtils seleniumUtils ;
	public LoginStepDefintion() {
		loginPage =new LoginPage() ;
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
		
		
	}
	
	@Given("Je visite le site nopcommerce")
	public void jeVisiteLeSiteNopcommerce() {
    //Setup.getDriver().get(configFileReader.getProperties("home.login"));
	seleniumUtils.get(configFileReader.getProperties("home.url"));
	}
	@When("Je saisis l'adresse mail {string}")
	public void jeSaisisLAdresseMail(String email) {
		LoginPage.getEmail().sendKeys(email);
	}
	@When("Je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String password) {
		LoginPage.getPassword().sendKeys(password);
	}
	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		LoginPage.getBtnLogin().click();
	}
	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
	String titlePage = LoginPage.getTitlePage().getText();
	Assert.assertEquals(titlePage, text);
	


	}
}
