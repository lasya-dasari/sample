package com.fb.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.EditProfile_page;
import com.fb.qa.pages.Findfriendspage;
import com.fb.qa.pages.Homepage;
import com.fb.qa.pages.Loginpage;
import com.fb.qa.pages.Messangerpage;
import com.fb.qa.pages.Profilepage;

public class Homepage_test extends TestBase
{
	Loginpage loginpage;
	Homepage homepage;
	Profilepage profile; 
	EditProfile_page edit_pf; 
	Findfriendspage findfp; 
	Messangerpage messanger;
	public Homepage_test() {
		super();
	}
@BeforeMethod
public void setup()
{
	intialization();
	loginpage=new Loginpage();
	homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
}
@Test(priority=5)
public void Verify_profilename()
{
	String profilename=homepage.profilename();
	Assert.assertEquals(profilename,"Sandhya");
}
@Test(priority=4)
public void Verify_profileimage()
{
 boolean flag=homepage.profileimage();
 Assert.assertTrue(flag);
 
}
@Test(priority=3)
public void Verify_profilenameleft() throws Exception
{
 
profile=homepage.click_onprofilenameleft();
Thread.sleep(10000);

 
}
/*@Test(priority=3)
public void Verify_Editprofilelink()
{
 
edit_pf=homepage.Editprofile_link();
page_back();
 
}*/
@Test(priority=1)
public void verify_homepagetitle()
{
	Assert.assertEquals(homepage.homepage_title(),"(12) Facebook");
}
@Test(priority=0)
public void verify_findfriendslink()throws Exception
{
	homepage.findfrindslink();
		Thread.sleep(10000);
}

@Test(priority=2)
public void verify_messanger() throws Exception
{
  messanger=homepage.messange1r();
  Thread.sleep(10000);
  
}

@AfterMethod
public void teardown()
{
	driver.quit();
}

}
