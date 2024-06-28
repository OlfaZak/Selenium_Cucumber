package com.e2eTests.automation.page_object;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;


public class ProductsPage extends BasePage {

	@FindBy(how = How.ID, using = "nopSideBarPusher")
	private static WebElement btnMenu;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a/p")
	private static WebElement btnCatalog;
	
	@FindBy(how = How.XPATH , using = "//p[normalize-space()='Products']")
	private static WebElement btnProduct ;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"SearchProductName\"]")
	private static WebElement searchProductName;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"SearchCategoryId\"]")
	private static WebElement dropdownElement;
	
	@FindBy(how = How.ID , using = "search-products")
	private static WebElement btnsearchproducts ;

	public ProductsPage() {

		super(Setup.getDriver());

	}

	public static WebElement getBtnMenu() {
		return btnMenu;
	}
	
	public static WebElement getBtnCatalog() {
		return btnCatalog;
	}
	
	public static WebElement getBtnProduct() {
		return btnProduct;
	}
	
	public static WebElement getsearchProduct() {
		return searchProductName;
	}

	public static WebElement getDropdownElement() {
		return dropdownElement;
	}
	public static WebElement getbtnsearchproducts() {
		return btnsearchproducts;
	}
}
