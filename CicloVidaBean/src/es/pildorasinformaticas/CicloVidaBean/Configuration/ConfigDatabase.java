package es.pildorasinformaticas.CicloVidaBean.Configuration;

public class ConfigDatabase {

	private String databaseName;
	private String typeDatabase;
	private String port;
	
	public void init() {
		System.out.println("Iniciando la base de datos...");
	}
	
	public String persistir() {
		return "Persistiendo en la base de datos";
	}
	
	public void destroy() {
		System.out.println("Cerrando la base de datos...");
	}
	
}
