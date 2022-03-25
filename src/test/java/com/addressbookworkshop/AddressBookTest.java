/* @Purpose : Check The Contact In Added In AddressBook Or Not
 * @File : Address Book Program
 * @Author : Akshay Kumar
 */

package com.addressbookworkshop;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AddressBookTest {
	@Test
	public void givenContactCheckifItIsCorrect() {
		Contact contacts = new Contact("akshay", "Kumar", "Gandak Project", "Muzaffarpur", "Bihar", 842002,
				"7057082582", "abc@gmail.com");
		AddressBook addressBook = new AddressBook();
		addressBook.addContact(contacts);
		List<Contact> contactList = addressBook.getcontactList();
		Assert.assertTrue(contactList.contains(contacts));
		System.out.println(contactList);
	}

}