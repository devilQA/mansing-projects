package com.components.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.components.base.BaseTest;

public class MonitersPage extends BaseTest {

	@FindBy(xpath = "//p[@class='price']//span[@class='price-new']")
	private WebElement priceOfProduct;
	@FindBy(xpath = "//div[@class='caption']//h4//a[@href='http://tutorialsninja.com/demo/index.php?route=product/product&path=25_28&product_id=42']")
	private WebElement productTitleTOClick;

	public WebElement getPriceOfProduct() {
		return priceOfProduct;
	}

	public WebElement getProductTitleTOClick() {
		return productTitleTOClick;
	}

	public MonitersPage() {
		PageFactory.initElements(driver, this);
	}

	// buisness logic
	public String getPrice() {
		return getPriceOfProduct().getText();
	}

	public ProductDiscription clickOnProduct() {
		getProductTitleTOClick().click();
		return new ProductDiscription();
	}

}
