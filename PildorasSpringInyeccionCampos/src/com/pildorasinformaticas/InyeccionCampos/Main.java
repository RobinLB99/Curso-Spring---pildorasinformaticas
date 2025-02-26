package com.pildorasinformaticas.InyeccionCampos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.pildorasinformaticas.InyeccionCampos.Interfaces.Empresa;
import com.pildorasinformaticas.InyeccionCampos.Model.Aerolinea;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		/*
		 * //En inyeccion de campos, solo se puede tener acceso a los metodos
		 * proporcionados por la interfaz Empresa.
		 * Empresa aerolinea = context.getBean("miAerolinea", Empresa.class);
		 * System.out.println(aerolinea.getNameEmpresa); //Da error. No tiene acceso al metodo
		 */

		/* 
		 * Se tiene que especificar la clase que se usa y no la interfaz de la que hereda.
		 */
		Aerolinea aerolinea = context.getBean("miAerolinea", Aerolinea.class);
		System.out.println(aerolinea.contratar());
		System.out.println(aerolinea.getNameEnterprise()); // Tiene acceso al metodos
		System.out.println(aerolinea.getEmail()); // Tiene acceso al metodos
		System.out.println(aerolinea.getPhoneNumber()); // Tiene acceso al metodos
		
		
		Aerolinea aerolinea2 = context.getBean("miAerolinea", Aerolinea.class);
		System.out.println(aerolinea2.contratar());
		System.out.println(aerolinea2.getNameEnterprise()); // Tiene acceso al metodos
		System.out.println(aerolinea2.getEmail()); // Tiene acceso al metodos
		System.out.println(aerolinea2.getPhoneNumber()); // Tiene acceso al metodos

		context.close();
		
		/*
		 * La utilidad de la inyeccion de campos esta en facilitar la utilizacion en comun de los
		 * campos en varios objectos. Esto evita estar escribiendo y llenando los mismos valores
		 * en los campos en los distintos objetos. Todos acceden a los mismos valores desde
		 * el xml.
		 */

	}

}
