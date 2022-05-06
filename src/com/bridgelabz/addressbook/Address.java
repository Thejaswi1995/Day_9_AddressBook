package com.bridgelabz.addressbook;

public class Address {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int pincode;
    private long phoneNo;
    private String email;

    public Address(String myFirstName, String myLastName, String myAddress, String myCity, String myState, int myPincode, long myPhoneNo, String myEmail)
    {
        firstName = myFirstName;
        lastName = myLastName;
        address = myAddress;
        city = myCity;
        state = myState;
        pincode = myPincode;
        phoneNo = myPhoneNo;
        email = myEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
