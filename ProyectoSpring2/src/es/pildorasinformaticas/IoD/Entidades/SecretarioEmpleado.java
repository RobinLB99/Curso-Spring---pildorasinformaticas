package es.pildorasinformaticas.IoD.Entidades;

import es.pildorasinformaticas.IoD.Entidades.InterfacesEntidades.Empleados;
import es.pildorasinformaticas.IoD.Objetos.InterfacesObjetos.CreacionInformes;

public class SecretarioEmpleado implements Empleados {

	private CreacionInformes informeNuevo;
	
	@Override
	public String getTareas() {
		return "Gestiono la agenda del jefe.";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por Secretario: " + informeNuevo.getInforme();
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
}
