package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

import static utils.Utils.*;

public class Hooks {
	
	@Before()
	public void setUp() {
		acessarSistema();
		//Na(LoginPage.class).realizarLogin("admin", "admin123");
	}
	
	@Before(value = "@login")
	public void funcionalidadeLogin() {
		acessarSistema();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
