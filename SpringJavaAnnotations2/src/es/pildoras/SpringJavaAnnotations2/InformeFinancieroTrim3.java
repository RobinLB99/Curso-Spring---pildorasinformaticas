package es.pildoras.SpringJavaAnnotations2;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim3 implements InformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentacion de informe favorable del 3er Trimestre";
	}

}
