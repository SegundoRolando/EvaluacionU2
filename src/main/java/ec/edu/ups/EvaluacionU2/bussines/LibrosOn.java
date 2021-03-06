package ec.edu.ups.EvaluacionU2.bussines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.EvaluacionU2.dao.LibroDao;
import ec.edu.ups.EvaluacionU2.model.Libro;
@Stateless
public class LibrosOn implements LibrosOnRemote{

	@Inject
	private LibroDao personaDao;
	
	public void insertar(Libro l) {
		personaDao.insertar(l);
	}
	
	public void update(Libro p) {
		personaDao.update(p);
	}
}
