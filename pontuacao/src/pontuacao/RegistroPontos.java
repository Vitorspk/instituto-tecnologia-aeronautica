package pontuacao;

public class RegistroPontos {
	
	private CalculadoraBonus bonus;
	
	//construtor
	public RegistroPontos (CalculadoraBonus cb){
		bonus = cb;
	}
	
	
	//metodos publicos 
	public void fazerUmComentario(Usuario u){		
		u.pontos += 3 * bonus.bonus(u);
	}
	
	public void criarUmTopico(Usuario u){
		u.pontos += 5 * bonus.bonus(u);
	}
	
	public void darUmLike(Usuario u){
		u.pontos += 1 * bonus.bonus(u);
		
	}
	
}
