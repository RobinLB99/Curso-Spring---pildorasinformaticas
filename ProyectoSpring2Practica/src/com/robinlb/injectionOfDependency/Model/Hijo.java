package com.robinlb.injectionOfDependency.Model;

import com.robinlb.injectionOfDependency.Acciones.Estudiar;
import com.robinlb.injectionOfDependency.Interfaces.Persona;

public class Hijo implements Persona {
	
	private Estudiar estudiar;

	// Inyeccion de dependencia mediante setter
	public void setEstudiar(Estudiar estudiar) {
		this.estudiar = estudiar;
	}

	@Override
	public String saludar() {
		return "Hijo: Hola! Yo soy el hijo de mi padre.";
	}

	@Override
	public String irEstudiar() {
		return "Hijo: " + estudiar.irEstudiar();
	}

	@Override
	public String irTrabajar() {
		return "Hijo: Yo no trabajo.";
	}

}
