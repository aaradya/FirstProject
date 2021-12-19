package com.google.main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class FirstClass {

	@BeforeClass
	public static void sample1() {
		System.out.println("Before class");
	}

	@AfterClass
	public static void sample2() {
		System.out.println("After Class");
	}

	@Before
	public void sample3() {
		System.out.println("Before");
	}

	@After
	public void sample4() {
		System.out.println("After");
	}

	@Test
	public void sample9() {
		System.out.println("Test1");
	}

	@Test
	public void sample6() {
		System.out.println("Test2");
	}

	@Test
	@Ignore
	public void sample7() {
		System.out.println("Test3");
	}

}
