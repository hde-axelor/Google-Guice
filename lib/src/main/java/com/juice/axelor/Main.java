package com.juice.axelor;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new AppModule());

		SquareRequest request = injector.getInstance(SquareRequest.class);

		request.makeRequest();

	}

}
