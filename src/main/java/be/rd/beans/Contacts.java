package be.rd.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Serializable list of contacts to send back and forth to client
 * @author ruben
 *
 */
public class Contacts implements Serializable{

	private List<Contact> contacts;
	
	public Contacts(){}
			
	public Contacts(List<Contact> contacts){
		this.contacts = contacts;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
}
