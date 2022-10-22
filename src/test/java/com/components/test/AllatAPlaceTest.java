package com.components.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.components.base.BaseTest;
import com.components.pages.LandingPage;
import com.components.pages.MonitersPage;
import com.components.pages.ProductDiscription;

public class AllatAPlaceTest extends BaseTest{
	public LandingPage lp;
public 	ProductDiscription disc;
	@BeforeMethod
	void setup()
	{
		init();
		lp=new LandingPage();
		
	}
	
	
	@Test
	void test() {
		
		MonitersPage moniter = lp.clickOnMoniters();
	String initialPrice = moniter.getPrice();
		 disc= moniter.clickOnProduct();
		 String secondpagePrice = disc.getProductPriceOnPRDiscPage();
		 System.out.println("assertion satarts");
	   System.out.println("initialprice =="+ initialPrice+"  secondprice =="+ secondpagePrice);
		 Assert.assertTrue(initialPrice.equals(secondpagePrice));
		 disc.doAvailabeOptionsOprations();
			System.out.println("all done successfully");
		 disc.selectColor();
		 disc.selectQuantity();
		 disc.AddtoCartClick();
		 
		 Assert.assertTrue(disc.getErrorMassge().equals(config.getUploadFileErr()));
	}

	
}
