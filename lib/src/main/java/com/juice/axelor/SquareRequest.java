package com.juice.axelor;

import javax.inject.Inject;

public class SquareRequest {

	DrawShape d;

	@Inject
	public SquareRequest(DrawShape d) {

		this.d = d;
	}

	public void makeRequest() {

		d.draw();
	}
}
