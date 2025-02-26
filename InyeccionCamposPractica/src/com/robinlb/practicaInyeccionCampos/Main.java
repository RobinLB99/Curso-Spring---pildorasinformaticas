package com.robinlb.practicaInyeccionCampos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.robinlb.practicaInyeccionCampos.Modelo.ChevroletCar;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ChevroletCar auto = contexto.getBean("miCarroChevrolet", ChevroletCar.class);
		auto.setFactoryYear("2010");
		System.out.println(auto.encender());
		System.out.println(auto.apagar());
		System.out.println(auto.abrirCapo());
		System.out.println(auto.abrirPuertas());
		System.out.println("Año fabricacion: " + auto.getFactoryYear());
		System.out.println("La marca del auto es: " + auto.getMarca());
		
		System.out.println("--------------------------------");
		
		ChevroletCar auto2 = contexto.getBean("miCarroChevrolet", ChevroletCar.class);
		auto2.setFactoryYear("2015");
		System.out.println(auto2.encender());
		System.out.println(auto2.apagar());
		System.out.println(auto2.abrirCapo());
		System.out.println(auto2.abrirPuertas());
		System.out.println("Año fabricacion: " + auto2.getFactoryYear());
		System.out.println("La marca del auto es: " + auto.getMarca());
		
		contexto.close();
		
	}

}
