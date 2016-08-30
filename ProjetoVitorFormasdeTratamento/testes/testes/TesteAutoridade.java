package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import interfaces.Autoridade;
import interfaces.ComTitulo;
import interfaces.FormatadorNome;
import interfaces.Informal;
import interfaces.Respeitoso;

public class TesteAutoridade {
	
	@Test
	public void testeInformal()
	{
		FormatadorNome fn = new Informal();
		Autoridade a = new Autoridade ("Natanael", "Juvencio", fn);
		assertEquals(a.getTratamento(), "Natanael");
	}
	
	@Test
	public void testeRespeitosoMasculino ()
	{
		FormatadorNome fn = new Respeitoso(true, false);
		Autoridade a = new Autoridade ("Natanael", "Juvencio", fn);	
		assertEquals(a.getTratamento(), "Sr. Natanael Juvencio");
	}
	
	@Test
	public void testeRespeitosoFeminino ()
	{
		FormatadorNome fn = new Respeitoso(false, true);
		Autoridade a = new Autoridade ("Djalmira", "Ferreira", fn);	
		assertEquals(a.getTratamento(), "Sra. Djalmira Ferreira");
	}
	
	@Test
	public void testeComTitulo ()
	{
		FormatadorNome fn = new ComTitulo("Magnífico");
		Autoridade a = new Autoridade ("Natanael", "Juvencio", fn);			
		assertEquals(a.getTratamento(), "Magnífico Natanael Juvencio");
	}

}
