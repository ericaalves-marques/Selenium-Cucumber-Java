package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {
	
	@FindBy(css =  "#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div.oxd-select-text-input")
	public WebElement campoUserRoler;
	
	@FindBy(css = "#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(3) > div > div:nth-child(2) > div > div > div.oxd-select-text-input") 
	public WebElement campoStatus;
	
	@FindBy(css = "#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(2) > div > div:nth-child(2) > div > div") 
	public WebElement campoEmployee;
	
	@FindBy(css = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
	public WebElement campoUsername; 
	
	@FindBy(css = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
	public WebElement campoPassword;
	
	@FindBy(css = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
	public WebElement campoConfirmarPassword;
	
	@FindBy(css =  "#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
	public WebElement botaoSalvar;
	
	public void informarCampoUserRoler() {
		campoUserRoler.click();
	}
	
	public void informarCampoStatus() {
		campoStatus.click();
	}
	
	public void informarCampoEmployee(String employeeName) {
		campoEmployee.sendKeys(employeeName);
	}
	
	public void informarCampoUsername(String username) {
		campoUsername.sendKeys(username);
	}
	
	public void informarCampoPassword(String senha) {
		campoPassword.sendKeys(senha);
	}
	
	public void informarCampoConfirmarPassword(String senha) {
		campoConfirmarPassword.sendKeys(senha);
	}
	
	public void acionarBotaoSalvar() {
		botaoSalvar.click();
	}
	
}
