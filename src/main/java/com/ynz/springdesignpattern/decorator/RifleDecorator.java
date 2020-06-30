package com.ynz.springdesignpattern.decorator;

import lombok.extern.slf4j.Slf4j;

abstract class RifleDecorator implements Trigger {

    protected Trigger decoratedRifle;

    public RifleDecorator(Trigger rifle) {
        this.decoratedRifle = rifle;
    }

    abstract public void launch();

    @Override
    public void shoot() {
        decoratedRifle.shoot();
    }

}

@Slf4j
class GrenadeLauncher extends RifleDecorator {
    public GrenadeLauncher(Trigger rifle) {
        super(rifle);
    }

    @Override
    public void launch() {
        log.info("launching a grenade.");
    }

}

@Slf4j
class LaserGenerator extends RifleDecorator {
    public LaserGenerator(Trigger rifle) {
        super(rifle);
    }

    @Override
    public void launch() {
        log.info("generating laser beam ");
    }

}
