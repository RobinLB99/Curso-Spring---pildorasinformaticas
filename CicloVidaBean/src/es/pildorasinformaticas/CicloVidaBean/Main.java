package es.pildorasinformaticas.CicloVidaBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.pildorasinformaticas.CicloVidaBean.Configuration.ConfigDatabase;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ConfigDatabase config = contexto.getBean("miConfiguracion", ConfigDatabase.class);
		System.out.println(config.persistir());
		
		contexto.close();
	}

}
