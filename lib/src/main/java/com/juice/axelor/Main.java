package com.juice.axelor;

public class Main {

	public static void main(String[] args) {

		DrawShape d = new DrawSquare();
		SquareRequest request = new SquareRequest(d);
		request.makeRequest();

	}

}
