package com.juice.axelor;

import javax.inject.Inject;

import com.juice.annotation.colorvalue;
import com.juice.annotation.edgevalue;

public class DrawSquare implements DrawShape {

	private String color;
	private Integer edge;
	
	@Inject
   public DrawSquare(@colorvalue String color , @edgevalue Integer edge) {
       super();
       
       this.color = color;
       this.edge = edge;
	}
	 
	@Override
	public void draw() {

		System.out.println("Draw Square of color:" +color + " edge :" +edge );
	}
}
