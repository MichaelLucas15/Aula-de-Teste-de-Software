package br.ifpe;

import org.junit.Assert;
import org.junit.Test;


public class AplicacaoTest {

	@Test
	public void teste1() {
		//Cen�rio -> Dados necessarios para poder se trabalhar com o teste
		Aplicacao app = new Aplicacao();
		
		//A��o
		String valor = app.acao();
		
		//Verifica��o
		Assert.assertTrue(valor == "Exemplo");
	}
}
