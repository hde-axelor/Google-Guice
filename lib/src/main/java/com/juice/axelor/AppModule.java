package com.juice.axelor;

import com.google.inject.AbstractModule;
import com.juice.annotation.colorvalue;
import com.juice.annotation.edgevalue;

public class AppModule extends AbstractModule{
      
	  @Override
	 protected void configure() {
		  
		  bind(DrawShape.class).to(DrawSquare.class);
		  bind(String.class).annotatedWith(colorvalue.class).toInstance("Red");
		  bind(Integer.class).annotatedWith(edgevalue.class).toInstance(56);
	  }
	   
}
