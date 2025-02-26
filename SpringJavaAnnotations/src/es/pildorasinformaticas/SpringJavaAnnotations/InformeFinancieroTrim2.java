package es.pildorasinformaticas.SpringJavaAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim2 implements InformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentacion de informe catastrofico del 2do Trimestro";
	}

}
