package br.com.qualprecodapizza;

public class Principal {

	public static void main(String[] args) {

		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();

		pizza1.adicionaIngrediente("Frango");
		pizza1.adicionaIngrediente("Catupiry");
		pizza1.adicionaIngrediente("Tomate");

		pizza2.adicionaIngrediente("Pimenta");
		pizza2.adicionaIngrediente("Catupiry");
		pizza2.adicionaIngrediente("Mucarela");
		pizza2.adicionaIngrediente("Cebola");
		pizza2.adicionaIngrediente("Borda Recheada");
		pizza2.adicionaIngrediente("Molho de tomate");

		pizza3.adicionaIngrediente("Azeitonas");
		pizza3.adicionaIngrediente("Peperone");
		pizza3.adicionaIngrediente("Cheddar");

		CarrinhoDeCompras c = new CarrinhoDeCompras();

		c.addPizza(pizza1);
		c.addPizza(pizza2);
		c.addPizza(pizza3);

		System.out.println("Total de pizzas no carrinho: " + c.totalPizzas());
		System.out.println("Valor total da compra: " + c.getPrecoTotal());

		System.out.println("Lista de ingredientes utilizados: \n" + Pizza.getListaIngredientes());

	}

}
