
public abstract class CarroDeCorrida {
	
	protected int velocidade;
	protected String nome;
	protected int velocidadeMaximo;
	
	
	public CarroDeCorrida(String nome, int velocidadeMaximo) {
		this.velocidade = 0;
		this.nome = nome;
		this.velocidadeMaximo = velocidadeMaximo;
	}
	
	public abstract void acelerar();
	
	public void frear() {
		velocidade = velocidade /2;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public String getNome() {
		return nome;
	}
	
}
