package es.pildorasinformaticas.SingletonPrototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.pildorasinformaticas.SingletonPrototype.Modelo.Coche;
import es.pildorasinformaticas.SingletonPrototype.Modelo.Motocicleta;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coche cocheDeportivo = context.getBean("miCoche", Coche.class);
		Coche cocheFamiliar = context.getBean("miCoche", Coche.class);

		Motocicleta motoDeportiva = context.getBean("miMotocicleta", Motocicleta.class);
		Motocicleta motoSimple = context.getBean("miMotocicleta", Motocicleta.class);

		/*
		 * Tienen la misma direccion de Memoria. (Uso de Singleton por defecto.)
		 */
		System.out.println(cocheDeportivo);
		System.out.println(cocheFamiliar);

		System.out.println((cocheDeportivo == cocheFamiliar) ? "Apuntan al mismo objeto. Usa Singleton"
				: "No apunta al mismo objeto. No usa Prototype.");

		/*
		 * Tienen diferentes direcciones en Memoria. (No usa Singleton. Usa Prototype.)
		 */
		System.out.println(motoDeportiva);
		System.out.println(motoSimple);

		System.out.println((motoDeportiva == motoSimple) ? "Apuntan al mismo objeto. Usa Singleton"
				: "No apunta al mismo objeto. No usa Prototype.");

		context.close();

	}

}
