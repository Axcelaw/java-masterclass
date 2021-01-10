package com.walace.ex44;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact newContact) {
        if (findContact(newContact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        else {
            myContacts.add((newContact));
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position >= 0) {
            if (findContact(newContact.getName()) >= 0) {
                System.out.println("Contact with name " + newContact.getName() + " already exists.  Update was not successful.");
                return false;
            }
            else {
                this.myContacts.set(position, newContact);
                System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
                return true;
            }
        }
        else {
            System.out.println(oldContact.getName() +", was not found.");
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position >= 0) {
            this.myContacts.remove(position);
            System.out.println(contact.getName() + ", was deleted.");
            return true;
        }
        else {
            System.out.println(contact.getName() +", was not found.");
            return false;
        }
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            if (this.myContacts.get(i).getName().equals(name))
                return i;
        }

        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);

        if (position < 0)
            return null;

        return myContacts.get(position);
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i+1) + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
