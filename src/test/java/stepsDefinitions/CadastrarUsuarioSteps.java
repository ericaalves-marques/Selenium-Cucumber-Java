package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CadastrarUsuarioSteps {
	
	@Quando("eu acionar a aba admin")
	public void euAcionarAAbaAdmin() {
	   Na(TelaInicialPage.class).acionarAbaAdmin();
	}
	@Quando("acionar o botao add")
	public void acionarOBotaoAdd() {
		Na(TelaInicialPage.class).acionarBotaoAdd();
	}
	@Quando("selecionar no campo user roler {string}")
	public void selecionarNoCampoUserRoler(String string) {
		Na(CadastrarUsuarioPage.class).informarCampoUserRoler();
	}
	@Quando("selecionar no campo status {string}")
	public void selecionarNoCampoStatus(String string) {
		Na(CadastrarUsuarioPage.class).informarCampoStatus();
	}
	@Quando("informar no campo employee name {string}")
	public void informarNoCampoEmployeeName(String employeeName) {
		Na(CadastrarUsuarioPage.class).informarCampoEmployee(employeeName);
	}
	@Quando("informar no campo username {string}")
	public void informarNoCampoUsername(String username) {
		Na(CadastrarUsuarioPage.class).informarCampoUsername(username);
	}
	@Quando("infomar no campo password {string}")
	public void infomarNoCampoPassword(String senha) {
		Na(CadastrarUsuarioPage.class).informarCampoPassword(senha);
	}
	@Quando("informar no campo confirmar password {string}")
	public void informarNoCampoConfirmarPassword(String senha) {
		Na(CadastrarUsuarioPage.class).informarCampoConfirmarPassword(senha);
	}
	
	@Quando("acionar o botao salvar")
	public void acionarOBotaoSalvar() {
		Na(CadastrarUsuarioPage.class).acionarBotaoSalvar();
	}
	
	@Entao("^o sistema cadastra o usuario \"([^\"]*)\"$")
	public void oSistemaCadastraOUsuario(String arg1) throws Throwable {
		assertEquals(true, driver.getPageSource().contains("success"));

	}



	
}
