package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class Loginpage extends TestBase 
{
//page factory- OR
	@FindBy(xpath="//input[@id='email']")
    WebElement username;
	
	@FindBy(xpath="//input[@id='pass']")
    WebElement password;  
	
	@FindBy(xpath="//input[contains(@value,'Log In')]")
    WebElement login_button; 
	
	@FindBy(linkText="Forgotten account?")
    WebElement forgotten_acunt_link; 
	
	@FindBy(xpath="//i[contains(@class,'fb_logo img sp_RNXRBsVDn05 sx_43b207')]")
    WebElement fb_logo; 
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
    WebElement signup_link; 

    @FindBy(xpath="//a[contains(text(),'Log In')]")
    WebElement login_link;
    
    //intializing the pagefactory
    public Loginpage()
    {
    	PageFactory.initElements(driver, this);
    	//PageFactory.initElements(driver, this);
    	//this keyword useful for binding current class instant variables/elements
    }
    
    //Actions
    
    public String validateTitle()
    {
    return	driver.getTitle();
    }
    
    public String validateUrl() {
    	return driver.getCurrentUrl();
    }
    
   
    
    public Homepage login(String un, String pwd)
    {
    	username.sendKeys(un);
    	password.sendKeys(pwd);
    	login_button.click();
    	return new Homepage(); //it will returns homepage class object
    }
    public boolean validatelogo() {
        return	fb_logo.isDisplayed();
        }
    

}
