package es.pildorasinformaticas.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		/*
		// Creacion de objetos de tipo Empleado
		
		Empleados empleado1 = new JefeEmpleado();
		Empleados empleado2 = new SecretarioEmpleado();
		Empleados empleado3 = new DirectorEmpleado();
		
		// Uso de los objetos creados
		
		System.out.println(empleado1.getTareas());
		System.out.println(empleado2.getTareas());
		System.out.println(empleado3.getTareas());
		*/
		
		// Codigo que no se va ha modificar (Inversion de Control)
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados juan = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(juan.getTareas());
		
		contexto.close();
		
	}

}
