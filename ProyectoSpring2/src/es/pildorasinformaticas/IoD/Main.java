package es.pildorasinformaticas.IoD;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.pildorasinformaticas.IoD.Entidades.InterfacesEntidades.Empleados;

public class Main {

	public static void main(String[] args) {

		// Codigo que no se va ha modificar (Inversion de Control)
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		/*
		Empleados juan = contexto.getBean("miJefeEmpleado", Empleados.class);
		System.out.println(juan.getTareas());
		System.out.println(juan.getInforme());
		*/
		
		Empleados joel = contexto.getBean("miSecretarioEmpleado", Empleados.class);
		System.out.println(joel.getTareas());
		System.out.println(joel.getInforme());

		contexto.close();

	}

}
