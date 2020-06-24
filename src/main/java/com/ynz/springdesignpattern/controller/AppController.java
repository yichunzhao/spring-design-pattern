package com.ynz.springdesignpattern.controller;

import com.ynz.springdesignpattern.builder.Contact;
import com.ynz.springdesignpattern.builder.ContactBuilder;
import com.ynz.springdesignpattern.factory.Pet;
import com.ynz.springdesignpattern.factory.PetFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class AppController {
    @Autowired
    private PetFactory petFactory;

    @GetMapping
    public String getDefault() {
        return "hello world";
    }

    @PostMapping("adoptPet/{type}/{name}")
    public ResponseEntity<Pet> adoptPet(@PathVariable String type, @PathVariable String name) {
        Pet created = petFactory.createPet(type);
        created.setName(name);
        created.feed();
        return new ResponseEntity(created, HttpStatus.CREATED);
    }

    @GetMapping("presidents")
    public ResponseEntity<List<Contact>> getPresidents() {

        List<Contact> contacts = new ArrayList<>();

        contacts.add(new ContactBuilder().firstName("George").lastName("Washington").build());
        contacts.add(new ContactBuilder().firstName("John").lastName("Adams").build());

        return new ResponseEntity(contacts, HttpStatus.FOUND);
    }

}
