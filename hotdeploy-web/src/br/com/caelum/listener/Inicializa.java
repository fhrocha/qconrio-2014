package br.com.caelum.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Inicializa implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {

    	System.out.println("Inicializa o contexto... Hot");   
    	
    	carregaMuitasClasses(); 

    	System.getProperties().put(new Usuario(), "outra configuração");
		
		System.out.println("Fim da inicializaco...");
    }

    public void contextDestroyed(ServletContextEvent event) {
    }
    
   
    //usando ThreadLocal
    //new ThreadLocal<Usuario>().set(new Usuario());
    
    // usando JDBC    
    //Class.forName("com.mysql.jdbc.Driver");
    //DriverManager.getConnection("jdbc:mysql://localhost/bla");
    
	private void carregaMuitasClasses() {
		ClassLoader webappclassloader = Inicializa.class.getClassLoader();
    	try {
	    	for (int i = 1; i <= 10000; i++) {
				webappclassloader.loadClass("br.com.caelum.fj91.classloader.servlet.Classe" + i);
	    	}
    	} catch (ClassNotFoundException e) { }
	}

	
}
