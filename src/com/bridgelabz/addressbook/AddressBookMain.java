package com.bridgelabz.addressbook;
import java.util.Scanner;
    public class AddressBookMain
    {
        public static void main(String[] args) {
            System.out.println("Welcome to your personal directory");
            AddressBook contact = new AddressBook();
            contact.inputInfo();
            contact.displayListItems();

            System.out.println("""
                    Press 1 to continue adding contacts
                    Press 2 to edit a contact
                    Press 3 to delete a contact
                    Press 4 to add a new address book
                    Press 0 to exit the program""");
            Scanner in = new Scanner(System.in);
            int operation = in.nextInt();
            if (operation == 1) {
                contact.inputInfo();
                contact.displayListItems();
            } else if (operation == 2) {
                contact.editContact();
            } else if (operation==3){
                contact.deleteContact();
            } else if (operation == 4) {
                contact.extra();
            } else if (operation == 0) {
                System.exit(0);
            }
        }
    }
