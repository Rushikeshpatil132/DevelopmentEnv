package com.platform.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator Test Case")
public class CalculatorTest {

	int a;
	int b;
	int expectedSum;
	Calculator calculator;

	@BeforeAll
	public static void inti() {
		System.out.println("started ");
	}

	@BeforeEach
	public void setUp() {
		a = 10;
		b = 210;
		expectedSum = 30;
		calculator = new Calculator();
	}

	@Test
	public void testSum() {
		int actualSum = 0;
		actualSum = calculator.sum(a, b);
		assertEquals(expectedSum, actualSum);
	}

	@AfterEach
	public void tearDown() {
		a = 0;
		b = 0;
		expectedSum = 0;
	}

	@AfterAll
	public static void closeAll() {
		System.out.println("finished");
	}

}
