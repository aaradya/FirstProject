package com.google.main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.facebook.utilis.BaseClass;
import com.redbus.pages.BusTickets;
import com.redbus.pages.RedBusHomePage;

import junit.framework.Assert;

public class RedBusHome extends BaseClass {

	WebDriver driver;
	static RedBusHomePage hp;
	static BusTickets bt;

	@BeforeClass
	public static void openChrome() {
		launchBrowser();
		hp = new RedBusHomePage();
		bt = new BusTickets();
	}

	@Before
	public void openRedBus() {
		openURL("https://www.redbus.com/");
		iwait(10);
	}

	@Test
	public void bookBus() throws InterruptedException {
		send(hp.getSrc(), "chennai");
		Thread.sleep(2000);
		send(hp.getSrc(), "" + Keys.ENTER);
		send(hp.getDest(), "madurai");
		Thread.sleep(2000);
		send(hp.getDest(), "" + Keys.ENTER);
		tap(hp.getOnDate());
		tap(hp.getDate());
		screenShot("C:\\Studies\\New folder (2)\\Selenium\\Selenium_class\\redbus.png");
		tap(hp.getSearch());
	}

	
	@Test
	public void bookBus2() throws InterruptedException {
		send(hp.getSrc(), "Madurai");
		Thread.sleep(2000);
		send(hp.getSrc(), "" + Keys.ENTER);
		send(hp.getDest(), "chennai");
		Thread.sleep(2000);
		send(hp.getDest(), "" + Keys.ENTER);
		tap(hp.getOnDate());
		tap(hp.getDate());
		screenShot("C:\\Studies\\New folder (2)\\Selenium\\Selenium_class\\redbus2.png");
		tap(hp.getSearch());
	}
	@After
	public void validate() {
		ewait(10, bt.getFare());
		String text = bt.getFare().getText();
		System.out.println(text);
		boolean contains = text.contains("Fare Starts from INR");
		Assert.assertTrue(contains);
	}

	@AfterClass
	public static void close() {
		closeBrowser();
	}

}
