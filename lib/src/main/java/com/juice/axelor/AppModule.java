package com.juice.axelor;

import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule{
      
	  @Override
	 protected void configure() {
		  
		  bind(DrawShape.class).to(DrawSquare.class);
	  }
	   
}
