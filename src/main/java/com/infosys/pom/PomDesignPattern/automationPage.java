package com.infosys.pom.PomDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class automationPage {


	@FindBy(xpath = "//*[@id=\"search_query_top\"]")
	private WebElement searchBox;

	@FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
	private WebElement gotButton;

	public void searchFor(String text) {

		searchBox.sendKeys(text);
		searchBox.submit();
		gotButton.click();

	}

}
