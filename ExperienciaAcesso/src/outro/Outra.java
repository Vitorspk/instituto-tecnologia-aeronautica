package outro;

import pacote.Referencia;

public class Outra {
	
	
	public void testeAcesso(){
		Referencia r = new Referencia();
//		r.modificadorDefault = 0;
		r.modificadorPublico = 0; // somente o atributo publico consigo acessar da outra classe
//		r.modificadorProjegido = 0;
//		r.modificadorPrivado = 0;
		
	}
}
