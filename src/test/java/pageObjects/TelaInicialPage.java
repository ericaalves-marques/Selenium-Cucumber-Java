package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage extends BasePage {
	
	//BasePage
	public void acionarAbaAdmin() {
		abaAdmin.click();
	}
	//Elements
		@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
		

		private WebElement botaoAdd;
	
	
	public void acionarBotaoAdd() {
		botaoAdd.click();
	}
	
}
