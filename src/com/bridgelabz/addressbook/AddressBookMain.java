package com.bridgelabz.addressbook;

    public class AddressBookMain
    {
        public static void main(String[] args) {
            System.out.println("Welcome to the Address Book Program");
            AddressBook contact = new AddressBook();
            contact.setUpInfo();
            contact.displayListItems();

        }
    }