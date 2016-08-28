package compras;


public class CompraParcelada extends Compra {
	
	private int parcelas;
	private double juros;

	public CompraParcelada(double val, int parcelas, double juros) {
		super(val);
		this.parcelas = parcelas;
		this.juros = juros;
	}

	@Override
	public double getTotal() {

		if (parcelas >= 1 && juros > 0.0)
			return (double) super.getTotal() * Math.pow((1 + juros / 100), parcelas);

		return super.getTotal();
	}
}
