import static org.junit.Assert.*;

import org.junit.Test;

import br.com.pizzaria.model.CarrinhoDeCompras.CarrinhoDeCompras;
import br.com.pizzaria.model.CarrinhoDeCompras.Pizza;

public class TesteCarrinhoDeCompras {

	@Test
	public void testVerificarPreco() {
		Pizza pedidoPizza1 = new Pizza();

		pedidoPizza1.adicionaIngrediente("Tomate");
		pedidoPizza1.adicionaIngrediente("Queijo");
		pedidoPizza1.adicionaIngrediente("Presunto");
		pedidoPizza1.adicionaIngrediente("Orégano");

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.addPizza(pedidoPizza1);

		assertEquals(20.0, carrinho.getPrecoTotal(), 0);
	}

	@Test
	public void testIngredientesVazio() {
		Pizza pedidoPizza1 = new Pizza();

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.addPizza(pedidoPizza1);

		assertEquals(0, carrinho.getPrecoTotal(), 0);
	}

}
