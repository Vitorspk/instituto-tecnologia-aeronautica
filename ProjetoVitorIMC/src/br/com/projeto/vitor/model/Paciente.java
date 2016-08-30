package br.com.projeto.vitor.model;

public class Paciente {
	//Atributos
	private double peso;
	private double altura;
	
	 //metodos
	public Paciente (double peso, double altura){
		this.peso = peso;
		this.altura = altura;
		
	}
	public double calcularIMC(){
		double imc = peso/(altura*altura);
		return imc;
	}
	
	
	public String diagnostico(){
	     String diagnostico = " ";
	     double calculoIMC = calcularIMC();
		
		 if(calculoIMC < 16.00) {
		    diagnostico =  "Baixo peso muito grave";
			 
		     } else if(calculoIMC > 16 && calculoIMC <= 16.99){
                  diagnostico = "Baixo peso grave";
                      
		     } else if(calculoIMC >= 17 && calculoIMC <= 18.49){
		           diagnostico = "Baixo peso";
		            	        
		     }else if (calculoIMC >= 18.50 && calculoIMC <= 24.99){
		           diagnostico = "Peso normal";
		                              
		     }else if (calculoIMC >= 25 && calculoIMC <= 29.99){
		           diagnostico = "Sobrepeso";
		                                	       
		     }else if (calculoIMC >= 30 && calculoIMC <= 34.99){
		           diagnostico = "Obesidade grau I";
		                                        	         
		     }else if (calculoIMC >= 35 && calculoIMC <= 39.99){
		           diagnostico = "Obesidade grau II";
		                                                     
		     } else if (calculoIMC >= 40 ){
		           diagnostico = "Obesidade grau III (obesidade mórbida)";
		     }
		return diagnostico;
	}


}
