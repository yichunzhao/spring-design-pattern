package com.ynz.springdesignpattern.factory;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dog implements Pet {
    @Getter
    @Setter
    private String name;
    @Getter
    private String type;
    @Getter
    private boolean hungry;

    @Override
    public void feed() {
        log.info("feeding");
    }
}
