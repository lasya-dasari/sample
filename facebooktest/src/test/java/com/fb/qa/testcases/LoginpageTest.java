package com.fb.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.Homepage;
import com.fb.qa.pages.Loginpage;

public class LoginpageTest extends TestBase
{
	Loginpage loginpage;
	Homepage homepage;
	 public LoginpageTest() {
		super();
	}
	 

	//@BeforeMethod
	@BeforeClass
	public void setup()
	{

		intialization();
	 loginpage=new Loginpage();
	}
	@Test//(priority=0)
	public void loginpageTitle()
	{
		String runtime_title=loginpage.validateTitle();
		Assert.assertEquals(runtime_title, "Facebook – log in or sign up");	
	}
	
	@Test//(priority=1)
	public void loginpageurl()
	{
		String runtime_url=loginpage.validateUrl();
		Assert.assertEquals(runtime_url, "https://www.facebook.com/");	
	
	}
	
	@Test//(priority=2)
	public void fbpagelogo()
	{
		boolean flag=loginpage.validatelogo();
		Assert.assertTrue(flag);
	}
	@Test//(priority=3)
	public void fblogin()
	{
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			
	}
	//@AfterMethod
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	

}
