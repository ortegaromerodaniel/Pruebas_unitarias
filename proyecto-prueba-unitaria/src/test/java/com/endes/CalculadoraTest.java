package com.endes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Prueba de la suma de la calculadora")
	void testSuma() {
		Integer resultadoEsperado = 20;
		int resultado = Calculadora.sumar(15, 5);
		assertEquals(resultadoEsperado, resultado, "La suma no es correcta");
	}
	
	@Test
	@DisplayName("Prueba de la resta de la calculadora")
	void testResta() {
		Integer resultadoEsperado = 5;
		int resultado = Calculadora.restar(10, 5);
		assertEquals(resultadoEsperado, resultado, "La resta no es correcta");
	}
	
	@Test
	@DisplayName("Prueba de la multiplicación de la calculadora")
	void testmultiplicar() {
		Integer resultadoEsperado = 25;
		int resultado = Calculadora.multiplicar(5, 5);
		assertEquals(resultadoEsperado, resultado, "La multiplicación no es correcta");
	}
	
	@Test
	@DisplayName("Prueba de la división de la calculadora")
	void testDividir() {
		Integer resultadoEsperado = 2;
		int resultado = Calculadora.dividir(10, 5);
		assertEquals(resultadoEsperado, resultado, "La división no es correcta");
	}
}
