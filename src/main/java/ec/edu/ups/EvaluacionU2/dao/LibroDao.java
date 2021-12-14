package ec.edu.ups.EvaluacionU2.dao;



import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.EvaluacionU2.model.Libro;

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
}
