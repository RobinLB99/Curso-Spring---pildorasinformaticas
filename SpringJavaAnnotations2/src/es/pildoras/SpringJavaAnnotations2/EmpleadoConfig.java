package es.pildoras.SpringJavaAnnotations2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("es.pildoras.SpringJavaAnnotations2")
public class EmpleadoConfig {
	
	//Definir el bean para InformeFinancieroDtoCompras
	@Bean
	public InformeFinanciero informeFinancieroDtoCompras() { //sera el id del bean inyectado
		return new InformeFinancieroDtoCompras();
	}
	
	//Definir el bean para DirectorFinanciero e inyectar dependencias
	@Bean
	public Empleado directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
	
}
