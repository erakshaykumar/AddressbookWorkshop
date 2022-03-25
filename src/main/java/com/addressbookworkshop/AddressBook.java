/* @Purpose : Adding The Contact Details In AddressBook 
 * @File : Address Book Program
 * @Author : Akshay Kumar
 */
package com.addressbookworkshop;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	List<Contact> contactList = new ArrayList<Contact>();

	public void addContact(Contact contacts) {
		contactList.add(contacts);
	}

	public List<Contact> getcontactList() {
		return contactList;
	}

}
