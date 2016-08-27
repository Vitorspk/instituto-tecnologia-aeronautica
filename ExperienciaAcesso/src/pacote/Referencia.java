package pacote;

public class Referencia {
	int modificadorDefault;
	public int modificadorPublico;
	protected int modificadorProjegido;
	private int modificadorPrivado;
	
	
	//metodo que consigo acessar tudo.
	public void testeAcesso(){
		modificadorDefault = 0;
		modificadorPublico = 0;
		modificadorProjegido = 0;
		modificadorPrivado = 0;
		
	}
	
}
