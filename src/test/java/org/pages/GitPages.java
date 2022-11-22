package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class GitPages extends BaseClass {
	public GitPages() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='UnderlineNav-item '])[1]")
	private WebElement txtReposities;

	public WebElement getTxtReposities() {
		return txtReposities;
	}
}
