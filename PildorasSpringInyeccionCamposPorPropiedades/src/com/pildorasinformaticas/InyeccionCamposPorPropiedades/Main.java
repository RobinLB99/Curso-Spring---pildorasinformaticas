package com.pildorasinformaticas.InyeccionCamposPorPropiedades;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pildorasinformaticas.InyeccionCamposPorPropiedades.Modelo.ChevroletCar;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ChevroletCar car1 = contexto.getBean("miCarroChevrolet", ChevroletCar.class);
		System.out.println(car1.encender());
		System.out.println(car1.apagar());
		System.out.println("Marca: " + car1.getMarca());
		
		contexto.close();

	}

}
