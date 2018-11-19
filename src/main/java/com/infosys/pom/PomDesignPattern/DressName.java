package com.infosys.pom.PomDesignPattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressName {
	@FindBy (xpath = "//*[@id=\"center_column\"]/ul/li[6]/div/div[2]/h5/a")
	private WebElement clickDress;
	@FindBy (xpath = "//*[@id=\"center_column\"]/div/div/div[3]/h1")
	private WebElement dressName;
	
	public void navigate(String text) {

		clickDress.submit();
		dressName.getText();

	}

}
