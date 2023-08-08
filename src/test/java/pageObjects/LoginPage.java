package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name = "username")
	private WebElement campoUsuario;
	
	@FindBy(name = "password")
	private WebElement campoSenha;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	private WebElement botaoLogin;
	
	public void informarCampoUsuario(String usuario) {
		
		campoUsuario.sendKeys(usuario);
	}
	
	public void informarCampoSenha(String senha) { 
		campoSenha.sendKeys(senha);
	}
	
	public void acionarBotaoLogin() {
		botaoLogin.click();
	}
	
	public void realizarLogin(String usuario, String senha) {
		informarCampoUsuario(usuario);
		informarCampoSenha(senha);
		acionarBotaoLogin();
	}
}
