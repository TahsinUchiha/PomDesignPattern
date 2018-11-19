package com.infosys.pom.PomDesignPattern;

import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;

public class NavigateTest {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void testSearch() {
		driver.get("http://automationpractice.com/index.php");
		
		automationPage page = PageFactory.initElements(driver, automationPage.class);
		page.searchFor("dress");
		
		
		driver.get("http://automationpractice.com/index.php");
		DressName name = PageFactory.initElements(driver, DressName.class);
		page.searchFor("Faded");
		
		WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[6]/div/div[2]/h5/a"));
		assertEquals("Faded", checkElement.getText());
	}
	
	

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
