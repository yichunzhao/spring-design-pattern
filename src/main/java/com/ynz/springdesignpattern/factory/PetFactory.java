package com.ynz.springdesignpattern.factory;

import org.springframework.stereotype.Component;

@Component
public class PetFactory {

    public Pet createPet(String type) {

        switch (type) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw new UnsupportedOperationException("unknown type");
        }
    }
}
