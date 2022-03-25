/* @Purpose : Adding The Contact Details In AddressBook 
 * @File : Address Book Program
 * @Author : Akshay Kumar
 */
package com.addressbookworkshop;

import java.util.ArrayList;
import java.util.List;

/*
 * @Purpose : Creating Class For Addressbook And Defining List Of Contact and Function For AddContact
 * @Param : Contacts Elements
 * @Return : ContactList
 */
public class AddressBook {
	List<Contact> contactList = new ArrayList<Contact>();

	public void addContact(Contact contacts) {
		contactList.add(contacts);
	}

	public List<Contact> getcontactList() {
		return contactList;
	}

}
