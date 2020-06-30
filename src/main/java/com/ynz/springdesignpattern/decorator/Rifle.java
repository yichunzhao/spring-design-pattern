package com.ynz.springdesignpattern.decorator;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rifle implements Trigger {
    @Override
    public void shoot() {
        log.info("rifle is shooting.");
    }
}
