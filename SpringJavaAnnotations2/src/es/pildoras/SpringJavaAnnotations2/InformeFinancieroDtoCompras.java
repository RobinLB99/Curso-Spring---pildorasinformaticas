package es.pildoras.SpringJavaAnnotations2;

public class InformeFinancieroDtoCompras implements InformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Informe financiero del departamento compras año 2018.";
	}

}
