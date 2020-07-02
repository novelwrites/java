 package com.learningjava

import java.util.ArrayList;

public class CellPhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public CellPhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact (Contact contact) {
        if(findContact(contact.getName()) >=0) { //checking index value (findContact)
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact (Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact (Contact contact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.remove (foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact); //using index value to see if it exists already
    }

    private int findContact(String contactName) { //returns index value of where name was found
        for(int i=0; i<this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }

        }
        return -1;
    }

    public String queryContact (Contact contact) {
        if(findContact(contact) >=0) {
            return contact.getName();
        }
        return null;
    }

     public void printContacts() {
         System.out.println("Contact List");
         for(int i=0; i<this.myContacts.size(); i++) {
             System.out.println((i+1) + "." +
                     this.myContacts.get(i).getName() + " -> " +
                     this.myContacts.get(i).getPhoneNumber());
         }
     }










}

/*
**Cell Phone with Java Classes**
    - **CellPhone Class:**
        - Contact List
        - quit()
        - showContacts()
        - addContact()
        - updateContat()
        - removeContact()
        - searchContact()
      * **When adding or updating be sure to check if the contact already exists**
      * **Be sure not to expose the inner workings of the Arraylist to MobilePhone (use concepts of encapsulation to meet this requirement)**
*/
