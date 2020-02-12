package com.raja.mycontactapp;

public class Contact {

    private String name;
    private String phNo;

    public Contact(String name, String phNo) {
        this.name = name;
        this.phNo = phNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phNo='" + phNo + '\'' +
                '}';
    }
}
