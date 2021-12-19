package com.redbus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.utilis.BaseClass;

public class BusTickets extends BaseClass{

	public BusTickets() {
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(className = "fr-strts-frm")
private WebElement fare;


public WebElement getFare() {
	return fare;
}



 }
