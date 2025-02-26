package es.pildorasinformaticas.SpringJavaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Especificando el ID del Bean
		//Empleado robin = contexto.getBean("elSeñorComercialExperimentado", Empleado.class);
		
		//Sin especificar el ID del Bean. Id automatico (nombre de la clase, minuscula primera letra)
		Empleado robin = contexto.getBean("comercialExperimentado", Empleado.class);
		System.out.println(robin.getInforme());
		System.out.println(robin.getTareas());
		
		System.out.println("---------------------------------");
		
		Empleado joel = contexto.getBean("comercialExperimentado", Empleado.class);
		System.out.println(joel.getInforme());
		System.out.println(joel.getTareas());
		
		System.out.println((robin == joel) 
				? "\nApuntan a la misma direccion en memoria." 
				: "No apuntan a la mima direccion en memoria");
		
		System.out.println("Obejto 1: " + robin + "\n Objeto 2: " + joel);
		
		contexto.close();

	}

}
