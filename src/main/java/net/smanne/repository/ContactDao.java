package net.smanne.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import net.smanne.domain.Contact;

import org.springframework.stereotype.Component;

@Component
public class ContactDao {
	
	@PersistenceContext EntityManager em;

	public List<Contact> getAllContacts() {
		TypedQuery<Contact> query = em.createQuery("Select c from Contact c", Contact.class);
		return query.getResultList();
	}
	
	public void deleteContact(int id) {
		TypedQuery<Contact> query = em.createQuery("Delete c from Contact c where c.id = :id", Contact.class)
				.setParameter("id", id);
		query.executeUpdate();
	}
	
	public void addContact(Contact c) {
		em.persist(c);
	}
}
