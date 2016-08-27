
public class CarroSoma extends CarroDeCorrida{
	
	
	private int potencia;
	
	
	public CarroSoma(String nome,int potencia, int velocidadeMaximo) {
		super(nome, velocidadeMaximo);
		this.potencia = potencia;
	}
	public void acelerar(){
		velocidade += potencia;
		if(velocidade > velocidadeMaximo)
			velocidade = velocidadeMaximo;
	}
	
	

}
