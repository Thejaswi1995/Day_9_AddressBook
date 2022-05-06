package com.bridgelabz.addressbook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class AddressBook {
        List<Address> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        public void setUpInfo() {
            Scanner in = new Scanner(System.in);
            System.out.println("Num of contacts you want to create");
            int count = in.nextInt();
            for (int i = 1; i <= count; i++) {
                System.out.println("Enter the First Name:");
                String firstname = in.next();
                System.out.println("Enter the Last Name:");
                String lastname = in.next();
                System.out.println("Enter the Address in words:");
                String address = in.next();
                System.out.println("Enter the City:");
                String city = in.next();
                System.out.println("Enter the State Name:");
                String state = in.next();
                System.out.println("Enter the Pincode code:");
                int pincode = in.nextInt();
                System.out.println("Enter the Phone No");
                long phone = in.nextLong();
                System.out.println("Enter email id:");
                String email = in.next();
                Address contact = new Address(firstname, lastname, address, city, state, pincode, phone, email);
                list.add(contact);
            }
        }

        public void displayListItems() {
            for (Address info : list) {
                System.out.println(info.getFirstName() + "  " + info.getLastName() + "  "
                        + info.getAddress() + "  " + info.getCity() + "  " + info.getState()
                        + "  " + info.getPincode() + "  " + info.getPhoneNo() + "  " + info.getEmail());
            }

        }


        public void editContact() {
            System.out.println("Enter the first name of the contact to be edited");
            String newName = in.next();
            for (Address info : list) {
                if (info.getFirstName().contains(newName)) {
                    int index = list.indexOf(info);
                    System.out.println(info.getFirstName() + "  " + info.getLastName() + "  "
                            + info.getAddress() + "  " + info.getCity() + "  " + info.getState()
                            + "  " + info.getPincode() + "  " + info.getPhoneNo() + "  " + info.getEmail());
                    System.out.println("Enter the First Name:");
                    String firstname = in.next();
                    System.out.println("Enter the Last Name:");
                    String lastname = in.next();
                    System.out.println("Enter the Address in words:");
                    String address = in.next();
                    System.out.println("Enter the City:");
                    String city = in.next();
                    System.out.println("Enter the State Name:");
                    String state = in.next();
                    System.out.println("Enter the Pincode code:");
                    int pincode = in.nextInt();
                    System.out.println("Enter the Phone No");
                    long phone = in.nextLong();
                    System.out.println("Enter email id:");
                    String email = in.next();
                    list.set(index, new Address(firstname, lastname, address, city, state, pincode, phone, email));
                    displayListItems();
                }
            }
        }
        public void deleteContact() {
            System.out.println("Enter the first name of the contact to be deleted");
            String Name = in.next();
            list.removeIf(info -> info.getFirstName().contains(Name));
            displayListItems();
        }
    }

