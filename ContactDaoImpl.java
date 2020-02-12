package com.raja.mycontactapp;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ContactDaoImpl implements ContactDao{
    List<Contact> phoneBook = new ArrayList<Contact>();
    Context appContext;
    public ContactDaoImpl(Context appContext) {
        this.appContext = appContext;
    }
    DBHelper dbHelper = new DBHelper(appContext);
    @Override
    public List<Contact> getAllContacts() {
        return this.phoneBook;
    }

    @Override
    public Contact getContactByName(String name) {
        for(Contact x:phoneBook) {
            if (x.getName().equals(name)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public Contact getContactByPhone(String phNo) {
        for(Contact x:phoneBook) {
            if (x.getPhNo().equals(phNo)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public boolean addContact(Contact c) {
        if(getContactByName(c.getName())!=null && getContactByPhone(c.getPhNo())!=null){

            phoneBook.add(c);
            Toast.makeText(appContext,"done with list",Toast.LENGTH_LONG).show();
            dbHelper.addContactToDB(c);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeContact(String name) {
        return false;
    }

    @Override
    public boolean updateContactName(String oldName, String newName) {
        return false;
    }

    @Override
    public boolean updateContactPhone(String name, String newPh) {
        return false;
    }
}
