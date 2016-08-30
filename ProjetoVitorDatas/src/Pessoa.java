

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Pessoa {

	private int diaNascimento, mesNascimento, anoNascimento;

	public Pessoa(int diaNascimento, int mesNascimento, int anoNascimento) {
		 
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;

	}
	
	
	
	public int getIdade() {

		Calendar hoje = GregorianCalendar.getInstance();
		hoje.setTimeInMillis(Relogio.agora());
		
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int mes = hoje.get(Calendar.MONTH);
		int ano = hoje.get(Calendar.YEAR);
		
		if ( (mesNascimento > mes) || (mesNascimento == mes && diaNascimento > dia ) ) {
			return ano - anoNascimento - 1;
		} else {
			return ano - anoNascimento;
		}
	
		
	}
	

	public String getSigno() {
		
		int mesDia = (mesNascimento)*100 + diaNascimento;
		
		if (mesDia >= 321 && mesDia <= 420) {
			return "Áries";
		} else if (mesDia >= 421 && mesDia <= 520) {
			return "Touro";
		} else if (mesDia >= 521 && mesDia <= 620) {
			return "Gêmeos";
		} else if (mesDia >= 621 && mesDia <= 721) {
			return "Câncer";
		} else if (mesDia >= 722 && mesDia <= 822) {
			return "Leão";
		} else if (mesDia >= 823 && mesDia <= 922) {
			return "Virgem";
		} else if (mesDia >= 923 && mesDia <= 1022) {
			return "Libra";
		} else if (mesDia >= 1023 && mesDia <= 1121) {
			return "Escorpião";
		} else if (mesDia >= 1122 && mesDia <= 1221) {
			return "Sagitário";
		} else if ((mesDia >= 1222 && mesDia <= 1231) || (mesDia >=101 && mesDia <=120) ) {
			return "Capricórnio";
		} else if (mesDia >= 121 && mesDia <= 219) {
			return "Aquário";
		} else if (mesDia >= 220 && mesDia <= 320) {
			return "Peixes";
		} 

		return "";
	}
}
