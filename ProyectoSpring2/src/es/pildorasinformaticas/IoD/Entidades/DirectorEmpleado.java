package es.pildorasinformaticas.IoD.Entidades;

import es.pildorasinformaticas.IoD.Entidades.InterfacesEntidades.Empleados;
import es.pildorasinformaticas.IoD.Objetos.InterfacesObjetos.CreacionInformes;

public class DirectorEmpleado implements Empleados {

	// Inyeccion de dependencias mediante constructor
	
	// Creacion de campo tipo CreacionInforme (Interfaz)
	private CreacionInformes informeNuevo;

	// Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion de la plantilla de la empresa.";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}

}
