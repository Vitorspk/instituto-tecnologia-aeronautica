
public class Autenticador {
	public Usuario logar(String login, String senha) throws LoginException{
		
		if(login.equals("Vitor") && (senha.equals("teste"))){
			return new Usuario(login);
		}
		throw new LoginException("Usuario e senha nao batem!" , login);
		
	}
}
