
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno vitor = new Aluno();
		
		vitor.bim1 = 70;
		vitor.bim2 = 60;
		vitor.bim3 = 80;
		vitor.bim4 = 70;
		
		System.out.println(vitor.media());
		System.out.println(vitor.passouDeAno());
	}

}
