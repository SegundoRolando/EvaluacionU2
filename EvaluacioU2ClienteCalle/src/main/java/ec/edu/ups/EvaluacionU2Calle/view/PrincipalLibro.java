package ec.edu.ups.EvaluacionU2Calle.view;

import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import ec.edu.ups.EvaluacionU2Calle.bussines.LibrosOnRemote;
import ec.edu.ups.EvaluacionU2Calle.model.Libro;


public class PrincipalLibro {

	
	
	private LibrosOnRemote  libRemote;
	public void conectar() throws Exception {
		try {  
            final Hashtable<String, Comparable> jndiProperties =  
                    new Hashtable<String, Comparable>();  
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,  
                    "org.wildfly.naming.client.WildFlyInitialContextFactory");  
            jndiProperties.put("jboss.naming.client.ejb.context", true);  
              
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");  
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "EvaluacionU2Calle");  
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "EvaluacionU2Calle");  
              
            final Context context = new InitialContext(jndiProperties);  
       
            //---------------------------------------------------------------------------Libro-----------------------------------
            final String lookupName5 = "ejb:/PlataformasWeb/LibrosOn!ec.edu.ups.EvaluacionU2Calle.bussines.LibrosOnRemote";  
            
            this.libRemote = (LibrosOnRemote) context.lookup(lookupName5);
            
        } catch (Exception ex) {  
            ex.printStackTrace();  
            throw ex;  
        }  
	}
	
	
	public void crearLibro() {
		Libro l = new Libro();
		l.setCodigo(1);
		l.setNombre("Matematicas");
		l.setAutor("Jose Maria");
		l.setAnio("1995");
		this.libRemote.insertar(l);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrincipalLibro p = new PrincipalLibro();
		try {
			p.conectar();
			p.crearLibro();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
