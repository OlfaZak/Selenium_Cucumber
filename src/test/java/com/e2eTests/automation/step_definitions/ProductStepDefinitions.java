package com.e2eTests.automation.step_definitions;



import com.e2eTests.automation.page_object.LoginPage;
import com.e2eTests.automation.page_object.ProductsPage;
import com.e2eTests.automation.utils.SelectFromListUtils;
import com.e2eTests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDefinitions {

	public LoginPage loginPage;
	public SeleniumUtils seleniumUtils;
	public ProductsPage productsPage;
	public SelectFromListUtils selectFromListUtils;

	public ProductStepDefinitions() {

		loginPage = new LoginPage();
		seleniumUtils = new SeleniumUtils();
		productsPage = new ProductsPage();
		selectFromListUtils =new SelectFromListUtils();
	}

	@When("Je clique sur le bouton catalog")
	public void jeCliqueSurLeBoutonCatalog() throws InterruptedException {

		Thread.sleep(3000);
		seleniumUtils.click(ProductsPage.getBtnCatalog());
		
	}

	@When("Je clique sur le bouton products")
	public void jeCliqueSurLeBoutonProducts() throws InterruptedException {
		seleniumUtils.click(ProductsPage.getBtnProduct());
	}
	
	@When("Je saisis le nom du produit {string}")
	public void jeSaisisLeNomDuProduit(String searchProductName)throws InterruptedException {
		ProductsPage.getsearchProduct().sendKeys(searchProductName);

	}
	
	@And("Je selectionne la categorie") 
	public void jeSaisisLaCategorie()throws InterruptedException {
	  
		selectFromListUtils.selectDropDownListByIndex(ProductsPage.getDropdownElement(),3);

	}
	
	

	@When("Je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {
		
		seleniumUtils.click(ProductsPage.getbtnsearchproducts());

	}
	
	@Then("Je verifie le produit {string}")
	public void jeVerifieLeProduit(String string) {
	}
	
	/*Add Product*/
	
	@When("Je clique sur le bouton Add new")
	public void jeCliqueSurLeBoutonAddNew() {
		
		seleniumUtils.click(ProductsPage.getBtnAddProduct());
	    
	}	
	
	@When("Je saisie le nom du produit {string}")
	public void jeSaisieLeNomDuProduit(String Name) {
		ProductsPage.getProductName().clear();
		ProductsPage.getProductName().sendKeys(Name);
	}
	
	

	@When("je selectionne un tax categorie")
	public void jeSelectionneUnTaxCategorie() {
		selectFromListUtils.selectDropDownListByIndex(ProductsPage.getDropdownCat(),3);
	   
	}



	@When("Je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() {
		
		seleniumUtils.click(ProductsPage.getBtnSave());
		
	    
	}



	


}








