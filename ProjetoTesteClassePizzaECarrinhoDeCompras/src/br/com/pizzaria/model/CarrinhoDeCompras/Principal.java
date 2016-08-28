package br.com.pizzaria.model.CarrinhoDeCompras;

public class Principal {

	public static void main(String[] args) {


		Pizza Pizza1 = new Pizza();
		Pizza Pizza2 = new Pizza();
		Pizza Pizza3 = new Pizza();
		

		Pizza1.adicionaIngrediente("Parmesão");
		Pizza1.adicionaIngrediente("Queijo");
		Pizza1.adicionaIngrediente("Calabresa");
		Pizza1.adicionaIngrediente("Milho");
		
		
		Pizza2.adicionaIngrediente("Pimenta");
		Pizza2.adicionaIngrediente("Catupiry");
		Pizza2.adicionaIngrediente("Mucarela");
		Pizza2.adicionaIngrediente("Cebola");
		Pizza2.adicionaIngrediente("Borda Recheada");
		Pizza2.adicionaIngrediente("Molho de tomate");
		
		
		Pizza3.adicionaIngrediente("Azeitonas");
		Pizza3.adicionaIngrediente("Peperone");
		Pizza3.adicionaIngrediente("Cheddar");
		
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		carrinhoDeCompras.addPizza(Pizza1);
		carrinhoDeCompras.addPizza(Pizza2);
		carrinhoDeCompras.addPizza(Pizza3);
		
		
		System.out.println("Total de pizzas no pedido: " +carrinhoDeCompras.totalPizzas());
		System.out.println("TOTAL: " + carrinhoDeCompras.getPrecoTotal());
		System.out.println("Ingredientes utilizados: \n" +Pizza.getListaIngredientes());
		

		
	}

}
