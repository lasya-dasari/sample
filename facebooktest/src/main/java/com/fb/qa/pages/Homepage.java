package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class Homepage extends TestBase{
	
	@FindBy(xpath="//span[contains(text(),'Sandhya')]")
	WebElement profilename;
	
	@FindBy(xpath="//a[contains(@class,'_2s25 _606w')]")
	WebElement profileimage_link;
	
	@FindBy(xpath="//a[contains(@id,'findFriendsNav')]")
	WebElement findfriends_link;
	
	@FindBy(xpath="//div[contains(text(),'Sandhya Thumma')]")
	WebElement profilename_left;
	
	@FindBy(xpath="//span[contains(text(),'Edit Profile')]")
	WebElement Editprofile_link;
	
	@FindBy(xpath="//div[contains(text(),'Messenger')]")
	WebElement messanger;
	
	//Intializing page Factory
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	

	public String profilename()
	{
		return profilename.getText();
	}
	
	public boolean profileimage()
	{
		return profileimage_link.isDisplayed();
		
	}
	
	public Profilepage click_onprofilenameleft()
	{
		profilename_left.click();
		return new Profilepage();
	}
	public EditProfile_page Editprofile_link()
	{
		Editprofile_link.click();
		return new EditProfile_page();	
		}
	public String homepage_title()
	{
		return driver.getTitle();
	}
	
	public void findfrindslink() 
	{
		findfriends_link.click();
	
		
	}
	
	public Messangerpage messange1r()
	{
	  messanger.click();
		return new Messangerpage();
	
	}

	
	
	
	
	

}
