
public class ContaEspecial extends ContaCorrente{
	
	int limite;
	
	//construtor para passar o limite.
	ContaEspecial(int limite){
		this.limite = limite;
	}
	
	//Posso subescrever um metodo que ja existe na subclasse sem problemas.
	public int sacar(int valor){
		if(valor > (saldo+limite)){
			return 0;
		}
		else{
			saldo -= valor;
		}
		return valor;
	}
	
}
