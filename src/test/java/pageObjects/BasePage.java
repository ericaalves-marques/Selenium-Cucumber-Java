package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	
	@FindBy(xpath  = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]")
	public WebElement abaAdmin;
	
}
