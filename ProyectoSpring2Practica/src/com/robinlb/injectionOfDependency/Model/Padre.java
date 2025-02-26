package com.robinlb.injectionOfDependency.Model;

import com.robinlb.injectionOfDependency.Acciones.Trabajo;
import com.robinlb.injectionOfDependency.Interfaces.Persona;

public class Padre implements Persona {
	
	private Trabajo trabajo;
	
	public Padre(Trabajo trabajo) {
		this.trabajo = trabajo;
	}

	@Override
	public String irEstudiar() {
		// TODO Auto-generated method stub
		return "Padre: Yo no estudio.";
	}

	@Override
	public String irTrabajar() {
		// TODO Auto-generated method stub
		return "Padre: " + trabajo.irAlTrabajo();
	}

	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		return "Padre: Hola, yo soy el padre.";
	}

}
