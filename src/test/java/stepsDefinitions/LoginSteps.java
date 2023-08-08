package stepsDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginSteps {
	
	

	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
	   Na(LoginPage.class).informarCampoUsuario(usuario);
	}
	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
	    Na(LoginPage.class).informarCampoSenha(senha);
	}
	@Quando("clicar no login")
	public void clicarNoLogin() {
	    Na(LoginPage.class).acionarBotaoLogin();
	}
	@Entao("o sistema exibe a mensagem de usuario invalido")
	public void oSistemaExibeAMensagemDeUsuarioInvalido() {
	    assertEquals("Invalid credentials", driver.findElement(By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > div > div.oxd-alert.oxd-alert--error > div.oxd-alert-content.oxd-alert-content--error")).getText());
	}
	

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
	    assertEquals("Paul Collings", driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-userarea > ul > li > span > p")).getText());
	}

}





