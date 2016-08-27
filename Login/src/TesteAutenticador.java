import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAutenticador {

	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("Vitor", "teste");
		assertEquals("Vitor", u.getLogin());
	}
	
	//passou pq eu coloquei a execao aqui.
	@Test(expected= LoginException.class)
	public void loginFalho() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("vitor", "testeteste");
	}
	
	
	//testando se realmente esta com a informação correta.
		@Test
		public void informacaoDoErro(){
			Autenticador a = new Autenticador();
			try {
				Usuario u = a.logar("Vitor", "testeteste");
				fail();
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				//verificando se meu get.login é o Vitor.
				assertEquals("Vitor", e.getLogin());
			}
		}

}
