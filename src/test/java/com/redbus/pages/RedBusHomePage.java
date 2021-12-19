package com.redbus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.utilis.BaseClass;

public class RedBusHomePage extends BaseClass {

	public RedBusHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "src")
	private WebElement src;

	@FindBy(id = "dest")
	private WebElement dest;

	@FindBy(xpath = "//label[text()='Onward Date']")
	private WebElement onDate;

	@FindBy(xpath = "(//td[@class='current day'])[2]")
	private WebElement date;

	@FindBy(id = "search_btn")
	private WebElement search;

	public WebElement getSrc() {
		return src;
	}

	public WebElement getDest() {
		return dest;
	}

	public WebElement getOnDate() {
		return onDate;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getSearch() {
		return search;
	}

}
