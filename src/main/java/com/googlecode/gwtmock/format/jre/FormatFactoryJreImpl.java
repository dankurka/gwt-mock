package com.googlecode.gwtmock.format.jre;

import java.text.DecimalFormat;
import java.text.ParseException;

import com.googlecode.gwtmock.format.client.FormatFactory;
import com.googlecode.gwtmock.format.client.NumberFormat;

public class FormatFactoryJreImpl implements FormatFactory {

	private final class DecimalFormatWrapper implements NumberFormat {
		private final DecimalFormat decimalFormat;

		private DecimalFormatWrapper(DecimalFormat decimalFormat) {
			this.decimalFormat = decimalFormat;
		}

		@Override
		public double parse(String text) throws NumberFormatException {
			try {
				return decimalFormat.parse(text).doubleValue();
			} catch (ParseException e) {
				throw new NumberFormatException();
			}
		}

		@Override
		public String format(Number value) {
			return decimalFormat.format(value);
		}

		@Override
		public String format(double value) {
			return decimalFormat.format(value);
		}
	}

	@Override
	public NumberFormat getNumberFormat(String pattern) {

		final DecimalFormat decimalFormat = new DecimalFormat(pattern);

		return new DecimalFormatWrapper(decimalFormat);
	}

}
