package com.googlecode.gwtmock.format.client;

public interface NumberFormat {
	public String format(double value);

	public String format(Number value);

	public double parse(String text) throws NumberFormatException;
}
