package es.pildorasinformaticas.SpringJavaAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("elSeñorComercialExperimentado")
@Component // Toma como id el nombre de la clase con la primera letra en minúscula
			// (comercialExperimentado)
@Scope("prototype") // La anotacion @Scope especifica el patron con el que se quiere trabajar las
					// intancias del objeto. En este caso Prototype. Singleton, lo usa por defecto.
public class ComercialExperimentado implements Empleado {

	/*
	 * Inyeccion de dependencia por medio de campos de clase con @Autowired
	 */
	@Autowired
	/*
	 * Al tener varios beans que implementan la interfaz InformeFinanciero, Spring
	 * entra en conficto al no saber cual escojer. Por eso se implenta la
	 * annotation @Qualifier y por parametro el id del bean a utilizar.
	 */
	@Qualifier("informeFinancieroTrim1")
	private InformeFinanciero informeFinanciero; // Creo un campo de tipo InformeFinanciero, que es una Interfaz.

	/*
	 * @Autowired, busca en todo el proyecto la clase que implemente la interfaz
	 * InformeFinanciero para realizar la inyeccion al constructor. En este caso es
	 * InformeFinancieroTrim1.
	 * 
	 * Desde Spring 4.3, @Autowired no es necesario implementarlo si solo se define
	 * un solo constructor en el bean de la clase. Si se define mas de un
	 * constructor se implementa @Autowired en el constructor a inyectar la
	 * dependencia.
	 */

	// @Autowired
	// public ComercialExperimentado(InformeFinanciero informeFinanciero) {
	// this.informeFinanciero = informeFinanciero;
	// }

	public ComercialExperimentado() {
	}

	/*
	 * Inyeccion de dependencia con @Autowired por medio de un setter. Aunque no
	 * importa que nombre tenga el metodo
	 */

	// @Autowired
	// public void setInformeFinanciero(InformeFinanciero informeFinanciero) {
	// this.informeFinanciero = informeFinanciero;
	// }

	@Override
	public String getTareas() {
		return "Vender, vender y vender mucho!";
	}

	@Override
	public String getInforme() {
		// Muestra el contenido del metodo de la clase InformeFinancieroTrim1
		return informeFinanciero.getInformeFinanciero();
	}

}
