package com.e2eTests.automation.page_object;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;


public class ProductsPage extends BasePage {

	@FindBy(how = How.ID, using = "nopSideBarPusher")
	private static WebElement btnMenu;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a")
	private static WebElement btnCatalog;
	
	@FindBy(how = How.XPATH , using = "//p[normalize-space()='Products']")
	private static WebElement btnProduct ;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"SearchProductName\"]")
	private static WebElement searchProductName;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"SearchCategoryId\"]")
	private static WebElement dropdownElement;
	
	@FindBy(how = How.ID , using = "search-products")
	private static WebElement btnsearchproducts ;
	
	@FindBy(how = How.XPATH , using = "/html/body/div[3]/div[1]/form[1]/div/div/a")
	private static WebElement btnAddProduct ;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"product-form\"]/div[1]/h1")
	private static WebElement text;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card[1]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/input")
	private static WebElement Name;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"Published\"]")
	private static WebElement radioButton  ;
	
	@FindBy(how = How.ID , using = "AvailableStartDateTimeUtc")
	private static WebElement AvailableStartDateTimeUtc  ;
	
	@FindBy(how = How.ID , using = "AvailableEndDateTimeUtc")
	private static WebElement AvailableEndDateTimeUtc  ;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card[2]/div/div[2]/div[14]/div[2]/div[2]/select")
	private static WebElement dropdownCat;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"product-form\"]/div[1]/div/button[1]/i")
	private static WebElement btnSave ;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"AdditionalShippingCharge\"]")
	private static WebElement  prixProduit;

//	@FindBy(how = How.XPATH, using = "//*[@id=\"Price\"]")
//	private static WebElement  prixProduit1;

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

	public static WebElement getDropdownCat() {
		return dropdownCat;
	}
	public static WebElement getbtnsearchproducts() {
		return btnsearchproducts;
	}
	
	public static WebElement getradioButton() {
		return radioButton;
	}
	public static WebElement getAvailableStartDateTimeUtc() {
		return AvailableStartDateTimeUtc;
	}
	public static WebElement getAvailableEndDateTimeUtc() {
		return AvailableEndDateTimeUtc;
	}
	
	public static WebElement getPrixProduit() {
		return prixProduit ;
	}
	
	public static WebElement getProductName() {
		return Name ;
	}
	public static WebElement getDropdownElement() {
		return dropdownElement;
	}
	public static WebElement getBtnAddProduct() {
		return btnAddProduct;
	}

	public static WebElement getBtnSave() {
		return btnSave;
	}
	
	public static WebElement getTitlePage() {
		return text ;
	}
	
}
