package outro;

import pacote.Referencia;

public class Sub extends Referencia{
	
	public void testeAcesso(){
//		modificadorDefault = 0;
		modificadorPublico = 0; // somente o atributo public  e protected consigo acessar de outro pacote extendendo a classe.
		modificadorProjegido = 0; // somente o atributo public  e protected consigo acessar de outro pacote extendendo a classe.
//		modificadorPrivado = 0; 
		
	}
	
}
