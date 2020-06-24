package com.ynz.springdesignpattern.builder;

public class ContactBuilder {
    private String firstName;
    private String lastName;
    private String email;


    public ContactBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactBuilder email(String email) {
        this.email = email;
        return this;
    }

    public Contact build() {
        return new Contact(firstName, lastName, email);
    }
}
