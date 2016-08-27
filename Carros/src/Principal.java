
public class Principal {

	public static void main(String args[]) {
		Corrida corridaDaAmizade = new Corrida(200);
		corridaDaAmizade.adicionaCarro(new CarroSoma("Camaro", 10, 110));
		corridaDaAmizade.adicionaCarro(new CarroSoma("Fusca Tunado", 8, 140));
		corridaDaAmizade.adicionaCarro(new CarroMult("Bulgatti", 1.7, 110));
		corridaDaAmizade.adicionaCarro(new CarroMult("Ferrari", 1.4, 110));
		
		corridaDaAmizade.umDoisTresEJa();
	}

}
