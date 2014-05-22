package edu.esprit.integration.demo.services;

public class CalculatorService {

	public long add(long i, long j) {
		return i + j;
	}

	public long subtract(long i, long j) {
		return i - j;
	}

	public long multiply(long i, long j) {
		return i * j;
	}

	public double divide(long i, long j) {
		return (double) (i / j);
	}

}
