package com.barbie.BarbieExercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
class BarbieExerciciosApplicationTests {

	@Test
	@DisplayName("Desconto de 15 em 70 deve dar 59.5")
	void precoComDescontoTest() {

		var guardaRoupa = new GuardaRoupa(500);

		double resultado = guardaRoupa.precoComDesconto(70,15);

		assertEquals(59.5,resultado);
	}
	@Test
	@DisplayName("Valida se o preco ta dentro do orçamento")
	void cabeNoOrcamento(){

		var guardaRoupa = new GuardaRoupa(500);

		boolean resultado = guardaRoupa.cabeNoOrcamento(200);

		assertEquals(true,resultado);
	}
	@Test
	@DisplayName("Valida se a roupa é de gala")
	void ehDeGala() {

		var guardaRoupa = new GuardaRoupa(500);

		boolean resultado = guardaRoupa.ehDeGala(300);

		assertEquals(true, resultado);
	}
	@Test
	@DisplayName("Valida se a roupa é de gala")
	void registrarCompra() {

		var guardaRoupa = new GuardaRoupa(500);

		double resultado = guardaRoupa.registrarCompra(150.0);

		assertEquals(350.0, resultado);
	}
}
