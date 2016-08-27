
public class Principal {
	
	public static void main(String args[]){
		Pilha p = new Pilha(10);
		
		p.empilhar("miriellen");
		p.empilhar("vitor");
		p.empilhar("regiane");
		System.out.println("O nome que esta no topo da pilha : " + p.topo());
		System.out.println("O tamanho da Pilha : " + p.tamanho());
		
		Object[] arrayElementos = p.getElementos();
		System.out.println(arrayElementos.length);
		arrayElementos[1] = "OUTRO";
		
		//desempilhando
		System.out.println("------");
		System.out.println("O nome que removido da pilha : " + p.desenpilhar());
		System.out.println("O nome que esta no topo da pilha (agora) : " + p.topo());
		System.out.println("O tamanho da Pilha (agora) : " + p.tamanho());
		
		
		System.out.println(p.getElementos().length);
	}
	
	
}
