package com.googlecode.gwtmock.format.client.gwt;

import com.googlecode.gwtmock.format.client.FormatFactory;
import com.googlecode.gwtmock.format.client.NumberFormat;

public class FormatFactoryGwtImpl implements FormatFactory {

	@Override
	public NumberFormat getNumberFormat(String pattern) {

		com.google.gwt.i18n.client.NumberFormat gwtFormat = com.google.gwt.i18n.client.NumberFormat.getFormat(pattern);

		return new NumberFormatGwtImpl(gwtFormat);

	}

}
