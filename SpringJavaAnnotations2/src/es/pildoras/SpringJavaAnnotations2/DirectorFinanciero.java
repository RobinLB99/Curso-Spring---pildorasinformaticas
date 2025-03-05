package es.pildoras.SpringJavaAnnotations2;

public class DirectorFinanciero implements Empleado {

	private InformeFinanciero informeFinanciero;

	public DirectorFinanciero(InformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
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
