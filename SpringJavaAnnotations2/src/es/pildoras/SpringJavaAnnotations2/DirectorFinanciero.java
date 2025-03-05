package es.pildoras.SpringJavaAnnotations2;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleado {

	@Value("${empresa.directorFinanciero.email}")
	private String email;

	@Value("${empresa.nombre}")
	private String nombreEmpresa;

	private InformeFinanciero informeFinanciero;

	public DirectorFinanciero(InformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	@Override
	public String getTareas() {
		return "Gestion y direccion de las operaciones financieras de la empresa.";
	}

	@Override
	public String getInforme() {
		return informeFinanciero.getInformeFinanciero();
	}

}
