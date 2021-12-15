package ec.edu.ups.EvaluacionU2Calle.dao;



import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.EvaluacionU2Calle.model.Libro;

@Stateless
public class LibroDao {
	@PersistenceContext
	private EntityManager em;
	
	public void insertar(Libro p) {
		// TODO Auto-generated method stub
		em.persist(p);
	}
	public void update(Libro p) {
		// TODO Auto-generated method stub
		em.persist(p);
	}
	

	public Libro read(int id) {
		// TODO Auto-generated method stub
		Libro p = em.find(Libro.class,id);
		return p;
	}
}
