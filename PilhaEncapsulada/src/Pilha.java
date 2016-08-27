import java.util.Arrays;

public class Pilha {
	
	private Object[] elementos;
	private int topo = 0;
	
	public Pilha(int maximo){
		elementos = new Object[maximo]; // passando maximo como parametro.
	}
	
	//incremento item no topo.
	public void empilhar(Object elemento){
		elementos[topo] = elemento; //vai colocar livro no topo
		topo++; //depois que coloca ele incrementa o topo.
	}
	
	//removo item do topo.
	public Object desenpilhar(){
		topo --;
		return elementos[topo];
	}
	
	//so digo quem esta em cima.
	public Object topo(){
		return elementos[topo-1];
	}
	
	//retorna o tamanho da pilha
	public int tamanho(){
		return topo;
	}

	public Object[] getElementos() {
		Object[] paraRetorno = Arrays.copyOf(elementos, tamanho());
		return elementos;
	}


	    
	
}
