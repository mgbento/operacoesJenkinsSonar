package br.unipe.spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.unipe.spring.service.Operacoes;

@SpringBootTest
class OperacoesApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void somarTeste() {
		Operacoes operacoes = new Operacoes();
		double resultado = operacoes.somar(1, 2);
		Assertions.assertEquals(3, resultado);
				
	}
	
	@Test
	public void subtrairTeste() {
		Operacoes operacoes = new Operacoes();
		double resultado = operacoes.subtrair(3, 1);
		Assertions.assertEquals(2, resultado);
	}
	
	@Test
	public void multiplicarTeste() {
		Operacoes operacoes = new Operacoes();
		double resultado = operacoes.multiplicar(3, 2);
		Assertions.assertEquals(6, resultado);
	}
	
	@Test
	public void dividirTeste() {
		Operacoes operacoes = new Operacoes();
		double resultado = operacoes.dividir(4, 2);
		Assertions.assertEquals(2, resultado);
	}
}
