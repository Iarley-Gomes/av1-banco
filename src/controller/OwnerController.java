package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Owner;

public class OwnerController {
	EntityManagerFactory emf;
	EntityManager em;
	
	public OwnerController() {
		emf = Persistence.createEntityManagerFactory("mohr");
		em = emf.createEntityManager();
	}

	@SuppressWarnings("unchecked")
	public List<Owner> index() {
		em.getTransaction().begin();
		Query query = em.createQuery("select owner from Owner owner");
		List<Owner> owner = query.getResultList();
		em.getTransaction().commit();
		emf.close();
		return owner;
	}
	
	public Owner show(int id) {
		em.getTransaction().begin();
		Owner owner = em.find(Owner.class, id);
		em.getTransaction().commit();
		emf.close();
		return owner;
	}
	
	public void store(Owner owner) {
		em.getTransaction().begin();
		em.persist(owner);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void update(Owner owner) {
		em.getTransaction().begin();
		em.merge(owner);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void destroy(Owner owner) {
		em.getTransaction().begin();
		em.remove(owner);
		em.getTransaction().commit();
		emf.close();
	}
}
