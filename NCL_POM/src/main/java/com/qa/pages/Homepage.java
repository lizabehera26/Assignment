package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.utill.Reusablemethods;

public class Homepage extends Reusablemethods{
	
	public void Homepage() {
		  
		PageFactory.initElements(driver, this);
	}
	//Object Repository
	
	@FindBy(xpath = "//div[@data-code='destination' and @class='c197_group_item']")
	WebElement Destination ;
	
	@FindBy(xpath="//div[@data-code='destination' ]//a[@title='Apply']")
	WebElement Destinationapply ;
	
	@FindBy(xpath="//li[@data-value='Alaska Cruises']")
	WebElement AlaskaCheckbox ;
	
	@FindBy(xpath="//div[@data-code='dates' and @class='c197_group_item']")
	WebElement Datetable ;
	
	@FindBy(xpath="//li[@data-year='2021' and @data-value='April']")
	WebElement Date ;
	
	@FindBy(xpath="//div[@data-code='dates']//a[@title='Apply']")
	WebElement Dateapply ;
	
	@FindBy(xpath="//div[@class='m91_filter_item -cta']//a[@data-action='find-a-cruise']")
	WebElement Findcruise ;
	
	//@FindBy("")
	//List<WebElement>
	//Methods for Homepage
	
	public void destination() {
		Destination.click();
	}
	public void selectAlaska() {
		AlaskaCheckbox.click();
	}
	
	
	public void applyDestination() {
		Destinationapply.click();
	}
	
	public void applyDates() {
		Date.click();
		Dateapply.click();
	}
	
	public void findCruise() {
		Findcruise.click();
	}

}
