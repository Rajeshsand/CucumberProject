package org.pomframe;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPojoclass extends BaseClass {
	
	
	public TestPojoclass() {

		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement txtPass;
	

	@FindBy(xpath="//button[@name='login']")
    private WebElement logBtn;
	
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getLogBtn() {
		return logBtn;
	}


	public WebElement getTxtPass() {
		return txtPass;
	}
	
}
