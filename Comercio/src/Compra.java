
public class Compra {
	
	int valorTotal;
	int numeroParcelas;
	
	//construtores a vista
	public Compra(int valor){
		valorTotal = valor;
		numeroParcelas = 1;
	}
	
	//construtor parcelado
	public Compra(int qtdParcelas, int valorParcela){
		numeroParcelas = qtdParcelas;
		valorTotal = valorParcela * qtdParcelas;
	}
	//metodos para recuperar
	public int getValorTotal(){
		return valorTotal;
	}
	//metodos para recuperar
	public int getNumeroParcelas(){
		return numeroParcelas;
	}
	
	//metodos para recuperar
	public int getValorParcela(){
		return valorTotal / numeroParcelas;
	}

}
