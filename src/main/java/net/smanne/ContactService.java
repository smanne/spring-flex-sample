package net.smanne;

import java.util.List;

import net.smanne.domain.Contact;
import net.smanne.repository.ContactDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.flex.remoting.RemotingInclude;
import org.springframework.stereotype.Service;

import flex.messaging.io.ArrayList;

@Service
@RemotingDestination
public class ContactService {

	@Autowired ContactDao contactDao;
	
	@RemotingInclude
	public void saveContact(Contact contact) {
		contactDao.addContact(contact);
	}
	
	@RemotingInclude
	public List<Contact> getAllContacts() {
		List list = contactDao.getAllContacts();
		return list;
	}
}
