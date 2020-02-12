package com.raja.mycontactapp;

import java.util.List;

public interface ContactDao {
    public List<Contact> getAllContacts();
    public Contact getContactByName(String name);
    public Contact getContactByPhone(String phNo);
    public boolean addContact(Contact c);
    public boolean removeContact(String name);
    public boolean updateContactName(String oldName, String newName);
    public boolean updateContactPhone(String name, String newPh);
}
