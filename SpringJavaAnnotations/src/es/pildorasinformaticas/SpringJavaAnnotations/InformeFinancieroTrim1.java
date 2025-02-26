package es.pildorasinformaticas.SpringJavaAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements InformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentacion del informe financiero del 1er Trimerstre";
	}

}
