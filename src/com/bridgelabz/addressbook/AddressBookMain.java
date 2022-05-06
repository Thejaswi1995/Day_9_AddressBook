package com.bridgelabz.addressbook;
import java.util.Scanner;
    public class AddressBookMain
    {
        public static void main(String[] args) {
            System.out.println("Welcome to your personal directory");
            AddressBookMain main = new AddressBookMain();
            main.operation();
        }

        private void operation(){
            AddressBook contact = new AddressBook();
            contact.setUpInfo();
            contact.displayListItems();

            int i;
            int j = 0;
            for (i = 1; i > j; i++) {
                System.out.println("""
                    Press 1 to continue adding contacts
                    Press 2 to edit a contact
                    Press 3 to delete a contact
                    Press 0 to exit the program""");
                System.out.println("Press 1 to continue adding contacts\nPress 2 to edit a contact\nPress 0 to exit the program");
                Scanner in = new Scanner(System.in);
                int operation = in.nextInt();
                if (operation == 1) {
                    contact.setUpInfo();
                    contact.displayListItems();
                } else if (operation == 2) {
                    contact.editContact();
                } else if (operation == 0) {
                    j = i + 2;
                } else if (operation==3){
                    contact.deleteContact();
                }
            }
        }
    }

