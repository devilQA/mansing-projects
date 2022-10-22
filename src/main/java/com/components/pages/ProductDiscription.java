package com.components.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.components.base.BaseTest;

public class ProductDiscription extends BaseTest {
	// req 'b' to compair price with a requirement
	@FindBy(xpath = "//ul[@class='list-unstyled']//descendant::li//h2")
	private WebElement priceOFProduct;
	// req d
	@FindBy(xpath = "//h3[text()='Available Options']")
	private WebElement AvailabeOptions;

	@FindBy(xpath = "//div[ @id='input-option218']//div//label//input[@value='7']")
	private WebElement largeRadio;

	@FindBy(xpath = "//div[ @id='input-option223']//div[@class='checkbox']//label//input[@value='10']")
	private WebElement checkbox3;

	@FindBy(id = "input-option217")
	private WebElement selectColor;
	@FindBy(id = "input-option209")
	private WebElement textArea;

	@FindBy(id = "input-quantity")
	private WebElement quantityTab;

	@FindBy(id = "button-cart")
	private WebElement AddtoCartButton;

	@FindBy(xpath = "//div[@class='text-danger']")
	private WebElement uploadFileMassage;

	public WebElement getUploadFileMassage() {
		return uploadFileMassage;
	}

	public WebElement getAddtoCartButton() {
		return AddtoCartButton;
	}

	public WebElement getQuantityTab() {
		return quantityTab;
	}

	public WebElement getTextArea() {
		return textArea;
	}

	public WebElement getPriceOFProduct() {
		return priceOFProduct;
	}

	public WebElement getAvailabeOptions() {
		return AvailabeOptions;
	}

	public WebElement getLargeRadio() {
		return largeRadio;
	}

	public WebElement getCheckbox3() {
		return checkbox3;
	}

	public WebElement getSelectColor() {
		return selectColor;
	}

	public ProductDiscription() {
		PageFactory.initElements(driver, this);
	}

	public String getProductPriceOnPRDiscPage() {
		return getPriceOFProduct().getText();
	}

	public void doAvailabeOptionsOprations() {
		action.moveToElement(getAvailabeOptions());

		getLargeRadio().click();

		getCheckbox3().click();
		getTextArea().sendKeys(config.getTextArea());
	}

	public void selectColor() {
		Select select = new Select(getSelectColor());
		action.moveToElement(getSelectColor()).build().perform();
		select.selectByValue("3");
	}

	public void selectQuantity() {
		getQuantityTab().sendKeys(config.getquantity());
	}

	public void AddtoCartClick() {
		action.moveToElement(getAddtoCartButton()).build().perform();
		getAddtoCartButton().click();
	}

	public String getErrorMassge() {
		return getUploadFileMassage().getText();
	}

}
