package br.com.projeto.vitor.model;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1 = new Paciente(75, 1.78);
		double imc1 = paciente1.calcularIMC();
		System.out.println(" IMC do paciente 1: " + imc1 + " Diagnóstico do paciente 1: " + paciente1.diagnostico());

		Paciente paciente2 = new Paciente(102, 1.80);
		double imc2 = paciente2.calcularIMC();
		System.out.println(" IMC do paciente 2: " + imc2 + " Diagnóstico do paciente 2: " + paciente1.diagnostico());

		Paciente paciente3 = new Paciente(68, 1.72);
		double imc3 = paciente3.calcularIMC();
		System.out.println(" IMC do paciente 3: " + imc3 + " Diagnóstico do paciente 3: " + paciente1.diagnostico());
	}

}
