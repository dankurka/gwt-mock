package com.googlecode.gwtmock.format.client.gwt;

import com.googlecode.gwtmock.format.client.NumberFormat;

public class NumberFormatGwtImpl implements NumberFormat {

	private final com.google.gwt.i18n.client.NumberFormat gwtFormat;

	public NumberFormatGwtImpl(com.google.gwt.i18n.client.NumberFormat gwtFormat) {
		this.gwtFormat = gwtFormat;
	}

	@Override
	public String format(double value) {
		return gwtFormat.format(value);
	}

	@Override
	public String format(Number value) {
		return gwtFormat.format(value);
	}

	@Override
	public double parse(String text) throws NumberFormatException {
		return gwtFormat.parse(text);
	}

}
