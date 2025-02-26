package es.pildorasinformaticas.IoD.Entidades;

import es.pildorasinformaticas.IoD.Entidades.InterfacesEntidades.Empleados;

public class JefeEmpleado implements Empleados {

	@Override
	public String getTareas() {
		return "Gestion de tareas realtivas a mis empleados de seccion.";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
