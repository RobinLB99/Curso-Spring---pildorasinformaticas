package com.robinlb.injectionOfDependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.robinlb.injectionOfDependency.Interfaces.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Persona robin = context.getBean("miPadre", Persona.class);
		System.out.println(robin.saludar());
		System.out.println(robin.irEstudiar());
		System.out.println(robin.irTrabajar());
		
		System.out.println("-----------------------");
		
		Persona joel = context.getBean("miHijo", Persona.class);
		System.out.println(joel.saludar());
		System.out.println(joel.irEstudiar());
		System.out.println(joel.irTrabajar());		
		
		context.close();
		
	}

}
