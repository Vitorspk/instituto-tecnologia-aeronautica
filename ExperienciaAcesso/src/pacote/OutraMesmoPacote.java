package pacote;

public class OutraMesmoPacote {
	
	public void testeAcesso(){
		Referencia r = new Referencia();
		r.modificadorDefault = 0;
		r.modificadorPublico = 0; 
		r.modificadorProjegido = 0;
//		r.modificadorPrivado = 0; // somente este atributo private não consigo acessar da outra classe mesmo estando neste mesmo pacote.
		
	}
	
}
