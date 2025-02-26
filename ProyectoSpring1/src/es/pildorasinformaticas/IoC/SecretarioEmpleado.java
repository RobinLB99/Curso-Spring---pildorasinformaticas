package es.pildorasinformaticas.IoC;

public class SecretarioEmpleado implements Empleados {

	@Override
	public String getTareas() {
		return "Gestiono la agenda del jefe.";
	}

}
