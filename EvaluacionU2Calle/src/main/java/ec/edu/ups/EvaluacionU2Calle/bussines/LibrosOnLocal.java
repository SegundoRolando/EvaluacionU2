package ec.edu.ups.EvaluacionU2Calle.bussines;

import javax.ejb.Local;

import ec.edu.ups.EvaluacionU2Calle.model.Libro;

@Local
public interface LibrosOnLocal {
	
	public void insertar(Libro l) ;
	public void update(Libro l);
	
}
