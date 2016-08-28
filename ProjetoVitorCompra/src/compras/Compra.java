package compras;

public class Compra {

	private double valor;
	private double total;

	public Compra(double val) {
		this.valor = val;
	}

	public double getTotal() {
		total = this.valor;
		return total;
	}

}
