package com.ynz.springdesignpattern.factory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@Slf4j
public class Cat implements Pet {
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
