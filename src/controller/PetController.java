package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Pet;

public class PetController {
	EntityManagerFactory emf;
	EntityManager em;
	
	public PetController() {
		emf = Persistence.createEntityManagerFactory("mohr");
		em = emf.createEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	public List<Pet> index() {
		em.getTransaction().begin();
		Query query = em.createQuery("select pet from Pet pet");
		List<Pet> pet = query.getResultList();
		em.getTransaction().commit();
		emf.close();
		return pet;
	}
	
	public void store(Pet pet) {
		em.getTransaction().begin();
		em.persist(pet);
		em.getTransaction().commit();
		emf.close();
	}
	
	public Pet show(int id) {
		em.getTransaction().begin();
		Pet pet = em.find(Pet.class, id);
		em.getTransaction().commit();
		emf.close();
		return pet;
	}
	
	public void update(Pet pet) {
		em.getTransaction().begin();
		em.merge(pet);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void destroy(Pet pet) {
		em.getTransaction().begin();
		em.remove(pet);
		em.getTransaction().commit();
		emf.close();
	}
}
