package com.qa.pages;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.utill.Reusablemethods;
import com.relevantcodes.extentreports.LogStatus;




public class Vacationpage extends Reusablemethods {

	
	public void Vacationpage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//div[@class='e55_price_value' ]/span[contains(text(),'$719')]")
	WebElement Cruiseprice ;
	
	@FindBy(linkText= "VIEW DATES & PRICES")
	WebElement Datesandprices ;
	
	@FindBy(xpath = "//div[@class='c157_body']")
	List<WebElement> Pricelist ;
	
	@FindBy(xpath="//a[@id='simplemodal-close-img']")
	WebElement popupclose ;
	
	//Functions
	
	public boolean validatepage(String text1,String text2) {
		if(text1.contentEquals(text2)) {
			System.out.println("User is on homepage");
			return true ;
		}else
			System.out.println("User is not in homepage");
		return false ;
		
		}
	public String getCruisePrice() {
		String price = Cruiseprice.getText();
		return price ;
	}
	
	public void clickDatesandPrice() {
		Datesandprices.click();
	}
	
	public 
	
	
}
