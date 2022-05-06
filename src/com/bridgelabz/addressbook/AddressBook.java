package com.bridgelabz.addressbook;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class AddressBook {
        private final Map<String, List<Address>> map = new LinkedHashMap<>();
        private final Scanner in = new Scanner(System.in);

        public void inputInfo() {
            System.out.println("Num of Address Book you want to create");
            int bookCount = in.nextInt();
            for (int b = 1; b <= bookCount; b++) {
                System.out.println("Name an Address Book");
                createContact();
            }
        }

        public void createContact(){
            String bookName = in.next();
            map.put(bookName, new LinkedList<>());
            Scanner in = new Scanner(System.in);
            System.out.println("For Address book " +bookName +" the num of contacts you want to create?");
            int contactCount = in.nextInt();
            for (int i = 1; i <= contactCount; i++) {
                System.out.println("Contact " + i + "- Enter the First Name:");
                String firstname = in.next();
                System.out.println("Contact " + i + "- Enter the Last Name:");
                String lastname = in.next();
                System.out.println("Contact " + i + "- Enter the Address in words:");
                String address = in.next();
                System.out.println("Contact " + i + "- Enter the City:");
                String city = in.next();
                System.out.println("Contact " + i + "- Enter the State Name:");
                String state = in.next();
                System.out.println("Contact " + i + "- Enter the Pincode code:");
                int pincode = in.nextInt();
                System.out.println("Contact " + i + "- Enter the Phone No");
                long phone = in.nextLong();
                System.out.println("Contact " + i + "- Enter email id:");
                String email = in.next();
                Address contact = new Address(firstname, lastname, address, city, state, pincode, phone, email);
                map.get(bookName).add(contact);
            }
        }

        public void displayListItems() {
            int i = 0;
            for (String key : map.keySet()) {
                i++;
                System.out.println("Address Book #" + i + ": " + key);
                for (Address info : map.get(key)) {
                    System.out.println(info.getFirstName() + "  " + info.getLastName() + "  "
                            + info.getAddress() + "  " + info.getCity() + "  " + info.getState()
                            + "  " + info.getPincode() + "  " + info.getPhoneNo() + "  " + info.getEmail());
                }
            }
        }

        public void editContact() {
            System.out.println("Enter the name of the Address Book from which contact is to be edited");
            String name = in.next();

            if (map.containsKey(name)) {
                System.out.println("Enter the first name of the contact to be edited");
                String Name = in.next();
                for (Address info : map.get(name)) {
                    if (Objects.equals(info.getFirstName(), Name)) {
                        System.out.println(info.getFirstName() + "  " + info.getLastName() + "  "
                                + info.getAddress() + "  " + info.getCity() + "  " + info.getState()
                                + "  " + info.getPincode() + "  " + info.getPhoneNo() + "  " + info.getEmail());
                        System.out.println("Enter the First Name:");
                        String firstname = in.next();
                        info.setFirstName(firstname);
                        System.out.println("Enter the Last Name:");
                        String lastname = in.next();
                        info.setLastName(lastname);
                        System.out.println("Enter the Address in words:");
                        String address = in.next();
                        info.setAddress(address);
                        System.out.println("Enter the City:");
                        String city = in.next();
                        info.setCity(city);
                        System.out.println("Enter the State Name:");
                        String state = in.next();
                        info.setState(state);
                        System.out.println("Enter the Pincode code:");
                        int pincode = in.nextInt();
                        info.setPincode(pincode);
                        System.out.println("Enter the Phone No");
                        long phone = in.nextLong();
                        info.setPhoneNo(phone);
                        System.out.println("Enter email id:");
                        String email = in.next();
                        info.setEmail(email);
                    } else {
                        System.out.println("No Such name found\nNote: Name is CAPS sensitive");
                        editContact();
                    }
                }
            }
            if (!map.containsKey(name)) {
                System.out.println("No Such Address book found\nNote: Name is CAPS sensitive");
                editContact();
            }
            displayListItems();
        }

        public void deleteContact() {
            System.out.println("Enter the name of the Address Book from which contact is to be edited");
            String name = in.next();

            if (map.containsKey(name)) {
                System.out.println("Enter the first name of the contact to be edited");
                String Name = in.next();
                for (Address info : map.get(name)) {
                    if (Objects.equals(info.getFirstName(), Name)) {
                        System.out.println(info.getFirstName() + "  " + info.getLastName() + "  "
                                + info.getAddress() + "  " + info.getCity() + "  " + info.getState()
                                + "  " + info.getPincode() + "  " + info.getPhoneNo() + "  " + info.getEmail());
                        map.get(name).remove(info);
                    } else {
                        System.out.println("No Such name found\nNote: Name is CAPS sensitive");
                        deleteContact();
                    }
                }
            }
            if (!map.containsKey(name)) {
                System.out.println("No Such Address book found\nNote: Name is CAPS sensitive");
                deleteContact();
            }
            displayListItems();
        }

        public void extra() {
            System.out.println("Enter the name of the Address Book to be created");
            String name = in.next();

            if (!map.containsKey(name)) {
                createContact();
                displayListItems();
            }
            else {
                System.out.println("Address book already exists, please use option 2 to edit");
            }
        }
    }