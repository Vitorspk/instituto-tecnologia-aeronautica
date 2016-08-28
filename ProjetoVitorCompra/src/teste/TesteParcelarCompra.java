package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import compras.CompraParcelada;


public class TesteParcelarCompra {

	CompraParcelada cp;


	@Test
	public void testPagUmaParcelaSemJuros() {
		cp = new CompraParcelada(1000, 1, 0);
		assertEquals(1000.0, cp.getTotal(), 1);
	}


	@Test
	public void testPagUmaParcelaComJuros() {
		cp = new CompraParcelada(1000, 1, 1.5);

		assertEquals(1015.0, cp.getTotal(), 1);
	}

	@Test
	public void testPagDuasParcelas() {
		cp = new CompraParcelada(1000, 2, 1.5);
		assertEquals(1030.2, cp.getTotal(), 1);
	}

	@Test
	public void testPagCincoParcelas() {
		cp = new CompraParcelada(1000, 5, 1.5);
		assertEquals(1077.2, cp.getTotal(), 1);
	}

	@Test
	public void testPagDezParcelas() {
		cp = new CompraParcelada(1000, 10, 1.5);
		assertEquals(1160.5, cp.getTotal(), 1);
	}

}