package edu.esprit.integration.demo.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.esprit.integration.demo.services.CalculatorService;

public class CalculatorTest {

	CalculatorService calculatorService;

	@Before
	public void setup() {

		calculatorService = new CalculatorService();
	}

	@Test
	public void itshouldAddCorrectly() {

		Assert.assertEquals(5, calculatorService.add(2, 3));
	}

}
