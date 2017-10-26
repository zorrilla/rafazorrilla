package com.mvcoperaciones.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSumaR {

	@Test
	void test() {
		OperacionesMatematicas test;
		test = new OperacionesMatematicas();

		test.setfNumero1(1);
		test.setfNumero2(2);
		float result = test.sumar();
		assertTrue(3.0 == result);
	}

	void test2() {
		OperacionesMatematicas test;
		test = new OperacionesMatematicas();

		test.setfNumero1(1);
		test.setfNumero2(2);
		float result = test.restar();
		assertTrue(-13.0 == result);
	}
}
