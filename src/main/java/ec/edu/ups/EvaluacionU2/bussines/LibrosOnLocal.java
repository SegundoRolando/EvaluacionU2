package ec.edu.ups.EvaluacionU2.bussines;

import javax.ejb.Local;

import ec.edu.ups.EvaluacionU2.model.Libro;

@Local
public interface LibrosOnLocal {
	
	public void insertar(Libro l) ;
	public void update(Libro l);
	
}
