package com.components.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.components.base.BaseTest;

public class LandingPage extends BaseTest {

	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[4]")
	private WebElement conmponentesLink;

	@FindBy(xpath = "//a[starts-with(text(),'Monitors')]")
	private WebElement moniters;

	public WebElement getConmponentesLink() {
		return conmponentesLink;
	}

	public WebElement getMoniters() {
		return moniters;
	}

	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	// buisnesslogic

	public MonitersPage clickOnMoniters() {
		wait.until(ExpectedConditions.visibilityOf(getConmponentesLink()));
		action.moveToElement(getConmponentesLink()).build().perform();
		;
		getMoniters().click();
		return new MonitersPage();
	}

}
