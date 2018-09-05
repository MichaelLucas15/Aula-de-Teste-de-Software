package br.ifpe;

import org.junit.Assert;
import org.junit.Test;


public class AplicacaoTest {

	@Test
	public void teste1() {
		//Cenário -> Dados necessarios para poder se trabalhar com o teste
		Aplicacao app = new Aplicacao();
		
		//Ação
		String valor = app.acao();
		
		//Verificação
		Assert.assertTrue(valor == "Exemplo");
	}
}
